package emily.command.test;

import emily.command.meta.CommandReactionListener;
import emily.command.meta.CommandVisibility;
import emily.command.meta.PaginationInfo;
import emily.command.music.PlaylistCommand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlaylistCommandTest {

    PaginationInfo initialData;
    PlaylistCommand playlistCommand;
    CommandReactionListener listener;

    @Before
    public void before() {
        initialData = mock(PaginationInfo.class);
        listener = mock(CommandReactionListener.class);
        playlistCommand = new PlaylistCommand();
    }

    @Test
    public void testGetDescription() {
        String expected = "information about the playlists";
        assertEquals(expected, playlistCommand.getDescription());
    }

    @Test
    public void testGetCommand() {
        String expected = "playlist";
        assertEquals(expected, playlistCommand.getCommand());
    }

    @Test
    public void testGetUsage() {
        String[] expected = new String[]{"-- using playlists ",
                "playlist mine          //use your default playlist",
                "playlist mine <code>   //use your playlist with code",
                "playlist lists         //see what playlists you have ",
                "playlist guildlists    //see what playlists the guild has",
                "playlist guild         //use the guild's default playlist",
                "playlist guild <code>  //use the guild's playlist with code",
                "playlist global        //use the global playlist",
                "playlist settings      //check the settings for the active playlist",
                "playlist               //info about the current playlist",
                "playlist list <page>   //Shows the music in the playlist",
                "",
                "-- Adding and removing music from the playlist",
                "playlist add                         //adds the currently playing music",
                "playlist add guild                   //adds the currently playing to the guild list",
                "playlist remove                      //removes the currently playing music",
                "playlist removeall                   //removes ALL songs from playlist",
                "",
                "-- Changing the settings of the playlist",
                "playlist title <new title>           //edit the playlist title",
                "playlist edit <new type>             //change the edit-type of a playlist",
                "playlist play <id>                   //plays a track from the playlist",
                "playlist playtype <new type>         //change the play-type of a playlist"
        };
        assertArrayEquals(expected, playlistCommand.getUsage());
    }

    @Test
    public void testGetAliases() {
        String[] expected = new String[]{"pl"};
        assertArrayEquals(expected, playlistCommand.getAliases());
    }

    @Test
    public void testGetVisibility() {
        PlaylistCommand test = mock(PlaylistCommand.class);
        when(test.getVisibility()).thenReturn(CommandVisibility.PUBLIC);
    }

//    @Test
//    public void testGetReactionListener() {
//        PlaylistCommand test = mock(PlaylistCommand.class);
//        when(test.getReactionListener(userId,initialData)).thenReturn(listener);
//    }

}