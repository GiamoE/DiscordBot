package emily.command.test;

import org.junit.Test;
import static org.junit.Assert.*;
import emily.command.bot_administration.BotStatusCommand;

public class BotStatusCommandTest {
    BotStatusCommand a = new BotStatusCommand();

    @Test
    public void getDescription() {
        assertTrue(a.getDescription() != null);
    }

    @Test
    public void getCommand() {
        assertTrue(a.getCommand() != null);
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