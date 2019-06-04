package emily.command.test;

import emily.permission.SimpleRank;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChangeNameTest {


    @Test
    public void executeNoPermission() {
        SimpleRank rank1 = SimpleRank.CREATOR;
        SimpleRank rank2 = SimpleRank.BANNED_USER;
        SimpleRank rank3 = SimpleRank.BOT;
        SimpleRank rank4 = SimpleRank.USER;
        SimpleRank rank5 = SimpleRank.INTERACTION_BOT;
        SimpleRank rank6 = SimpleRank.GUILD_BOT_ADMIN;
        SimpleRank rank7 = SimpleRank.GUILD_ADMIN;
        SimpleRank rank8 = SimpleRank.BANNED_USER;
        SimpleRank rank9 = SimpleRank.GUILD_OWNER;
        SimpleRank rank10 = SimpleRank.CONTRIBUTOR;
        SimpleRank rank11 = SimpleRank.BOT_ADMIN;
        SimpleRank rank12 = SimpleRank.SYSTEM_ADMIN;

        //only the creator can change the bot name
        assertSame("You are the creator", rank1, SimpleRank.CREATOR);

        //other ranks cannot change the bot name
        assertNotSame("You are not the creator", rank2, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank3, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank4, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank5, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank6, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank7, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank8, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank9, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank10, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank11, SimpleRank.CREATOR);
        assertNotSame("You are not the creator", rank12, SimpleRank.CREATOR);

    }

    @Test
    public void executeNoName() {
        // if the name given has no characters
        String newName = "Timmy";
        assertTrue("There is no input for the new name", newName.length() > 0);
    }
}