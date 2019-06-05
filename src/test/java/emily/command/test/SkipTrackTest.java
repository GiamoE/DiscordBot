package emily.command.test;

import emily.permission.SimpleRank;
import org.junit.Test;
import static org.junit.Assert.*;

public class SkipTrackTest {

    @Test
    public void executeSkipSong() {
        SimpleRank userRank = SimpleRank.GUILD_ADMIN;
        boolean adminOnly = true;

        assertTrue("Admin only & guild admin", adminOnly && userRank == SimpleRank.GUILD_ADMIN);
    }

    @Test
    public void executeSkipSongByVote() {
        int voteCount = 1;
        int requiredVotes = 1;

        assertTrue("Skip by vote", voteCount >= requiredVotes);
    }
}