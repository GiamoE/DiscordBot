package emily.command.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import emily.command.informative.*;

@RunWith(JUnit4.class)
public class UptimeCommandTest {

    UptimeCommand a = new UptimeCommand();

    public UptimeCommandTest() {
        super();
    }

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
    public void execute() {
    }
}