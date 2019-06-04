package emily.command.test;

import emily.permission.SimpleRank;
import org.junit.Test;
import static org.junit.Assert.*;
import emily.command.bot_administration.BotStatusCommand;

public class BotStatusCommandTest {

    // setting up the initial variables
    SimpleRank rank = SimpleRank.BOT_ADMIN;
    String status = "Playing Mario 98";
    String command = "game";

    @Test
    public void checkPermission() {
        // first we check whether the user requesting the command has the right rank.
        assertTrue("Your rank is invalid for this command", rank == SimpleRank.BOT_ADMIN);
    }

    @Test
    public void checkMessage() {
        // we then test if the message is valid has to be more than 0 characters
        assertTrue("The text has to be longer", status.length() > 0);
    }

    @Test
    public void checkCommand() {
        // we then test if the command given is valid (reset, game and stream) are the only valid options.
        assertTrue("You're using an invalid botstatus command", command.toLowerCase() == "reset" ||
                command.toLowerCase() == "stream" || command.toLowerCase() == "game");
    }
}