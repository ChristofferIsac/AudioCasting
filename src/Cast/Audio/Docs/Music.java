package Cast.Audio.Docs;

public class Music extends Audio {
    private String artist;
    private String gender;



    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getCategorie() {
        if(this.getTotalPlayed() > 10000) {
            return 10;
        } else {
            return 8;
        }

    }
}
