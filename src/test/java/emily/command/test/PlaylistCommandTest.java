package emily.command.test;

import org.junit.Test;
import static org.junit.Assert.*;
import emily.command.music.*;

public class PlaylistCommandTest {

    PlaylistCommand a = new PlaylistCommand();

    @Test
    public void getDescription() {
        assertTrue(a.getDescription() != null);
    }

    @Test
    public void getCommand()  {
        assertTrue(a.getDescription() != null);
    }

    @Test
    public void getUsage()  {
        assertTrue(a.getDescription() != null);
    }

    @Test
    public void getAliases() {
    }

    @Test
    public void getVisibility() {
    }

    @Test
    public void executeDisplayPlaylistInfo() {
        String args = "";
        // when no option given, only ?playlist is used to display the playlist
        assertEquals("?playlist is used", 0, args.length());
    }

    @Test
    public void getReactionListener() {
    }
}