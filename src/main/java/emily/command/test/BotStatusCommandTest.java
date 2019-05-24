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
    void getCommand() {
        assertTrue(a.getCommand() != null);
    }

    @Test
    void getUsage() {
    }

    @Test
    void getAliases() {
    }

    @Test
    void execute() {
    }
}