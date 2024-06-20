package Cast.Audio.Main;

import Cast.Audio.Docs.Music;
import Cast.Audio.Docs.MyFavorites;
import Cast.Audio.Docs.Playlist;
import Cast.Audio.Docs.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Fly me to the moon");
        myMusic.setArtist("Frank Sinatra");
        myMusic.setGender("Romantic");

        Music myMusic1 = new Music();
        myMusic1.setTitle("Sway");
        myMusic1.setArtist("Michale Bublée");
        myMusic1.setGender("Romantic");

        Music myMusic2 = new Music();
        myMusic2.setTitle("Never Gonna Give You Up");
        myMusic2.setArtist("Rick Astley");
        myMusic2.setGender("Romantic");

        Playlist myPlaylist = new Playlist();
        myPlaylist.setAlbum("Loved One");
        myPlaylist.setCategorie("80s");

        for (int i = 0; i < 1000; i++) {
            myMusic.played();
        }

        for (int i = 0; i < 50; i++) {
        myMusic.like();
        }
        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Podcastors");
        myPodcast.setDescription("Our knowledge in a good way");

        for (int i = 0; i < 500; i++) {
            myPodcast.played();
        }

        for (int i = 0; i < 1500; i++) {
            myPodcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.include(myPodcast);
        myFavorites.include(myMusic);
    }
}
