package emily.command.test;

import emily.command.informative.UptimeCommand;
import emily.main.DiscordBot;
import emily.templates.Templates;
import emily.util.TimeUtil;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UptimeCommandTest {

    DiscordBot bot;
    String[] args;
    MessageChannel channel;
    User author;
    Message inputMessage;

    UptimeCommand uptimeCommand;

    @Before
    public void before() {
        bot = mock(DiscordBot.class);
        channel = mock(MessageChannel.class);
        author = mock(User.class);
        inputMessage = mock(Message.class);

        uptimeCommand = new UptimeCommand();
    }

    @Test
    public void testGetDescription() {
        String expected = "How long am I running for?";
        assertEquals(expected, uptimeCommand.getDescription());
    }

    @Test
    public void testGetCommand() {
        String expected = "uptime";
        assertEquals(expected, uptimeCommand.getCommand());
    }

    @Test
    public void testGetUsage() {
        String[] expected = new String[]{};
        assertArrayEquals(expected, uptimeCommand.getUsage());
    }

    @Test
    public void testGetAliases() {
        String[] expected = new String[]{};
        assertArrayEquals(expected, uptimeCommand.getAliases());
    }

//    @Test
//    public void testExecute() {
//        UptimeCommand test = mock(UptimeCommand.class);
//        when(test.execute(bot, args, channel, author, inputMessage)).thenReturn(Templates.command.uptime.upfor.formatGuild(channel, TimeUtil.getRelativeTime(bot.startupTimeStamp, false)));
//    }
}