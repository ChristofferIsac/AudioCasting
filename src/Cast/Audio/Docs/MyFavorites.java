package Cast.Audio.Docs;

public class MyFavorites {
    public void include(Audio audio) {
        if(audio.getCategorie() >= 9) {
            System.out.println(audio.getTitle() + "IT'S ONE OF THE MOST PLAYED");
        } else {
            System.out.println(audio.getTitle() + "FAVORITE IT");
        }
    }
}
