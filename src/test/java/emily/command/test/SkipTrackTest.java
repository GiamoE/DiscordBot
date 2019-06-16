package emily.command.test;

import emily.command.meta.CommandVisibility;
import emily.command.music.SkipTrack;
import emily.main.DiscordBot;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SkipTrackTest {

    DiscordBot bot;
    String[] args;
    MessageChannel channel;
    User author;
    Message inputMessage;

    SkipTrack skiptrack;

    @Before
    public void before() {
        bot = mock(DiscordBot.class);
        channel = mock(MessageChannel.class);
        author = mock(User.class);
        inputMessage = mock(Message.class);

        skiptrack = new SkipTrack();
    }

    @Test
    public void testGetDescription() {
        String expected = "skip current track";
        assertEquals(expected, skiptrack.getDescription());
    }

    @Test
    public void testGetCommand() {
        String expected = "skip";
        assertEquals(expected, skiptrack.getCommand());
    }

    @Test
    public void testGetUsage() {

        args = new String[]{
                "skip                  //skips current track",
                "skip adminonly        //check what skipmode its set on",
                "skip adminonly toggle //toggle the skipmode",
                "skip force            //admin-only, force a skip"
        };

        assertArrayEquals(args, skiptrack.getUsage());
    }

    @Test
    public void testGetVisibility() {
        SkipTrack test = mock(SkipTrack.class);
        when(test.getVisibility()).thenReturn(CommandVisibility.PUBLIC);
    }

    @Test
    public void testGetAliases() {
        String[] expected = new String[]{"next"};
        assertArrayEquals(expected, skiptrack.getAliases());
    }

//    @Test
//    public void testExecute() {
//         assertNotNull(skiptrack.execute(bot, args, channel, author, inputMessage));
//    }
}