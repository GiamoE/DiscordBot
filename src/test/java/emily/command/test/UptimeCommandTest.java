package emily.command.test;

import emily.command.informative.UptimeCommand;
import emily.command.music.SkipTrack;
import emily.main.DiscordBot;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;

public class UptimeCommandTest {

    @Mock DiscordBot bot;
    @Mock String[] args;
    @Mock MessageChannel channel;
    @Mock User author;
    @Mock Message inputMessage;

    private UptimeCommand uptimeCommand;

    @Before
    public void before() {
//        MockitoAnnotations.initMocks(SkipTrack.class);
        MockitoAnnotations.initMocks(SkipTrack.class);
        uptimeCommand = new UptimeCommand();
    }

//    @Test
//    public void testExecute() {
//        assertNotNull(uptimeCommand.execute(bot, args, channel, author, inputMessage));
//    }
}