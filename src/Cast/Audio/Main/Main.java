package Cast.Audio.Main;

import Cast.Audio.Docs.Music;
import Cast.Audio.Docs.MyFavorites;
import Cast.Audio.Docs.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Fly me to the moon");
        myMusic.setTitle("Frank Sinatra");

        for (int i = 0; i < 1000; i++) {
            myMusic.played();
        }

        for (int i = 0; i < 50; i++) {
        myMusic.like();
        }
        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("DesenCast");
        myPodcast.setDescription("Our favorite youtubers, right here!");

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
