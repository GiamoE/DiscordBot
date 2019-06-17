package emily.command.test;

import emily.command.administrative.KickCommand;
import emily.db.model.OModerationCase;
import emily.main.BotContainer;
import emily.main.DiscordBot;
import net.dv8tion.jda.client.requests.restaction.pagination.MentionPaginationAction;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.Region;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.managers.AudioManager;
import net.dv8tion.jda.core.managers.GuildController;
import net.dv8tion.jda.core.managers.GuildManager;
import net.dv8tion.jda.core.managers.GuildManagerUpdatable;
import net.dv8tion.jda.core.requests.RestAction;
import net.dv8tion.jda.core.requests.restaction.MemberAction;
import net.dv8tion.jda.core.requests.restaction.pagination.AuditLogPaginationAction;
import net.dv8tion.jda.core.utils.cache.MemberCacheView;
import net.dv8tion.jda.core.utils.cache.SnowflakeCacheView;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.awt.*;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class KickCommandTest {

    DiscordBot bot;
    String[] args;
    MessageChannel channel;
    User author;
    Message inputMessage;
    BotContainer botContainer;

    Guild guild;
    Member member;
    KickCommand kickCommand;



    @Before
    public void before() {
        bot = mock(DiscordBot.class);
        channel = mock(MessageChannel.class);
        author = mock(User.class);
        inputMessage = mock(Message.class);
        botContainer = mock(BotContainer.class);
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

        guild = mock(Guild.class);
        member = mock(Member.class);

        kickCommand = new KickCommand();

    }

    @Test
    public void testGetDescription() {
        String expected = "Kicks a member from your guild";
        assertEquals(expected, kickCommand.getDescription());
    }

    @Test
    public void testGetCommand() {
        String expected = "kick";
        assertEquals(expected, kickCommand.getCommand(), expected);
    }

    @Test
    public void testGetUsage() {
        String[] expected = new String[]{"kick <user>     //Remove user from the guild user from guild"};
        assertArrayEquals(expected, kickCommand.getUsage());
    }

    @Test
    public void testGetAliases() {
        String[] expected = new String[]{};
        assertArrayEquals(expected, kickCommand.getAliases());
    }

    @Test
    public void testGetRequiredPermission() {
        Permission expected = Permission.KICK_MEMBERS;
        assertEquals(expected, kickCommand.testGetRequiredPermission());
    }

    @Test
    public void testGetPunishmentType() {
        OModerationCase.PunishType expected = OModerationCase.PunishType.KICK;
        assertEquals(expected, kickCommand.testGetPunishType());
    }
}