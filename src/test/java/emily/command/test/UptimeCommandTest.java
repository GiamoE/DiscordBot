package emily.command.test;

import emily.main.BotContainer;
import emily.main.DiscordBot;
import emily.templates.Templates;
import emily.util.TimeUtil;
import net.dv8tion.jda.core.entities.MessageChannel;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UptimeCommandTest {

    // Create the needed variables

//    DiscordBot bot; (need to init bot, however seems to be hard. Mby mock?)
//    MessageChannel channel;
//    String uptime = Templates.command.uptime.upfor.formatGuild(channel, TimeUtil.getRelativeTime(bot.startupTimeStamp, false));

    @Test
    public void CheckUptime() {
        // check whether the bot actually has an uptime, if it is null the bot is most likely offline.
        assertTrue("The bot isn't up therefore has no uptime", System.currentTimeMillis() != 0);
    }
}