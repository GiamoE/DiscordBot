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
    public void getCommand() {
    }

    @Test
    public void getUsage() {
    }

    @Test
    public void getAliases() {
    }

    @Test
    public void getVisibility() {
    }

    @Test
    public void execute() {
    }

    @Test
    public void getReactionListener() {
    }
}