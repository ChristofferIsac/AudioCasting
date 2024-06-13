package Cast.Audio.Docs;

public class Music extends Audio {
    private String album;
    private String artist;
    private String gender;

    @Override
    public int getCategorie() {
        if(this.getTotalPlayed() > 10000) {
            return 10;
        } else {
            return 8;
        }

    }
}
