package emily.command.test;

import emily.command.music.SkipTrack;
import emily.main.DiscordBot;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.requests.RestAction;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

import java.util.List;

import static org.mockito.Mockito.mock;

public class SkipTrackTest {

    @Mock DiscordBot bot;
    @Mock String[] args;
    @Mock MessageChannel channel;
    @Mock User author;
    @Mock Message inputMessage;
    private SkipTrack skiptrack;

    @Before
    public void before() {
//        MockitoAnnotations.initMocks(SkipTrack.class);
        MockitoAnnotations.initMocks(SkipTrack.class);
        skiptrack = new SkipTrack();

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

//    @Test
//    public void testExecute() {
//         assertNotNull(skiptrack.execute(bot, args, channel, author, inputMessage));
//    }
}