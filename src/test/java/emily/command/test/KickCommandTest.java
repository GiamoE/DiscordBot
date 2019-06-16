package emily.command.test;

import emily.db.model.OModerationCase;
import net.dv8tion.jda.core.Permission;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KickCommandTest {

    // create the variables needed
    Permission permission = Permission.KICK_MEMBERS;
    OModerationCase.PunishType punishType = OModerationCase.PunishType.KICK;

    @Test
    public void CheckRequiredRank() {
        // first we check whether the user requesting the command has the right rank.
        assertTrue("Your rank is invalid for this command", permission == Permission.KICK_MEMBERS);
    }

    @Test
    public void CheckPunishType() {
        // then we check the punishmentType
        assertTrue("You're using an invalid punishment type", punishType == OModerationCase.PunishType.KICK);
    }
}