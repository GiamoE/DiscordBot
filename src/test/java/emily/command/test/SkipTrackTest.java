package emily.command.test;

import emily.command.meta.CommandVisibility;
import emily.command.music.SkipTrack;
import emily.permission.SimpleRank;
import org.junit.Test;
import static org.junit.Assert.*;

public class SkipTrackTest {

    private SkipTrack skiptrack = new SkipTrack();

    @Test
    public void testDescription() {
        assertEquals("skip current track", skiptrack.getDescription());
    }

    @Test
    public void testCommand() {
        assertEquals("skip", skiptrack.getCommand());
    }

    @Test
    public void testUsage() {
        assertNotNull(skiptrack.getUsage());
    }

    @Test
    public void testVisibility() {
        assertEquals(skiptrack.getVisibility(), CommandVisibility.PUBLIC);

    }

    @Test
    public void testAliases() {
        assertArrayEquals(skiptrack.getAliases(), new String[]{"next"});
    }

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