package Cast.Audio.Docs;

public class Playlist extends Music {
    private String album;
    private int musicsList;
    private String categorie;

    public int getMusicsList() {
        return musicsList;
    }

    public void setMusicsList(int musicsList) {
        this.musicsList = musicsList;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}

