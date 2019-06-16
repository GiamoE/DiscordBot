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
import static org.junit.Assert.*;

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

        author = new User() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getDiscriminator() {
                return null;
            }

            @Override
            public String getAvatarId() {
                return null;
            }

            @Override
            public String getAvatarUrl() {
                return null;
            }

            @Override
            public String getDefaultAvatarId() {
                return null;
            }

            @Override
            public String getDefaultAvatarUrl() {
                return null;
            }

            @Override
            public String getEffectiveAvatarUrl() {
                return null;
            }

            @Override
            public boolean hasPrivateChannel() {
                return false;
            }

            @Override
            public RestAction<PrivateChannel> openPrivateChannel() {
                return null;
            }

            @Override
            public List<Guild> getMutualGuilds() {
                return null;
            }

            @Override
            public boolean isBot() {
                return false;
            }

            @Override
            public JDA getJDA() {
                return null;
            }

            @Override
            public boolean isFake() {
                return false;
            }

            @Override
            public String getAsMention() {
                return null;
            }

            @Override
            public long getIdLong() {
                return 0;
            }
        };
    }

    @Test
    public void testGetUsage() {

        args = new String[]{
                "botstatus reset                      //unlocks the status",
                "botstatus game <game>                //changes the playing game to <game>",
                "botstatus stream <username> <game>   //streaming twitch.tv/<username> playing <game>",
        };

        assertArrayEquals(botStatusCommand.getUsage(), args);

    }


    @Test
    public void testExecute() {
        SimpleRank rank = SimpleRank.CREATOR;
        args = new String[]{"reset"};
        //botStatusCommand.execute(bot, args, channel, author, inputMessage);

    }

}