package emily.command.test;

import org.junit.Test;
import static org.junit.Assert.*;
import emily.command.administrative.KickCommand;

public class KickCommandTest {

    KickCommand a = new KickCommand();

    @Test
    public void getDescription() {
        assertTrue(a.getDescription() != null);
    }

    @Test
    public void getCommand() {
    }

    @Test
    public void getAliases() {
    }

    @Test
    public void getPunishType() {
    }

    @Test
    public void getRequiredPermission() {
    }

    @Test
    public void punish() {
    }
}