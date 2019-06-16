package emily.command.test;

import emily.command.bot_administration.BotStatusCommand;
import emily.main.DiscordBot;
import emily.permission.SimpleRank;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.requests.RestAction;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class BotStatusCommandTest {

    DiscordBot bot;
    String[] args;
    MessageChannel channel;
    User author;
    Message inputMessage;

    BotStatusCommand botStatusCommand;


    @Before
    public void before() {
       bot = mock(DiscordBot.class);
       channel = mock(MessageChannel.class);
       author = mock(User.class);
       inputMessage = mock(Message.class);

       botStatusCommand = new BotStatusCommand();

       SimpleRank rank = SimpleRank.CREATOR;
    }

    @Test
    public void testExecute() {
        botStatusCommand.execute(bot, args, channel, author, inputMessage);
    }

}