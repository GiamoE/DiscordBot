package emily.command.test;

import org.junit.Test;
import static org.junit.Assert.*;
import emily.command.music.*;

public class SkipTrackTest {

    SkipTrack a = new SkipTrack();

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
    public void getVisibility() {
    }

    @Test
    public void getAliases() {
    }

    @Test
    public void execute() {
    }
}