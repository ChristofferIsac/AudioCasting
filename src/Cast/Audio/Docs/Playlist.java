package Cast.Audio.Docs;

public class Playlist extends Music {
    private String album;
    private int musicsList;

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
}

