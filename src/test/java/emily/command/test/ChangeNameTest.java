package emily.command.test;

import emily.command.bot_administration.ChangeName;
import emily.main.DiscordBot;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.requests.RestAction;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ChangeNameTest {

    DiscordBot bot;
    String[] args;
    MessageChannel channel;
    User author;
    Message inputMessage;

    ChangeName changeName;

    @Before
    public void before() {
        bot = mock(DiscordBot.class);
        channel = mock(MessageChannel.class);
        author = mock(User.class);
        inputMessage = mock(Message.class);

        changeName = new ChangeName();

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
    public void testGetDescription() {
        String expected = "Changes my name";
        assertEquals(expected, changeName.getDescription());
    }

    @Test
    public void testGetCommand() {
        String expected = "changename";
        assertEquals(expected, changeName.getCommand());
    }

    @Test
    public void testGetUsage() {
        String[] expected = new String[]{};
        assertArrayEquals(expected, changeName.getUsage());
    }

    @Test
    public void testGetAliases() {
        String[] expected = new String[]{};
        assertArrayEquals(expected, changeName.getAliases());
    }
}