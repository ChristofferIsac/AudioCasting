package Cast.Audio.Docs;

public class Audio {
    private String title;
    private int duration;
    private int totalPlayed;
    private int totalLikes;
    private double categorie;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalPlayed() {
        return totalPlayed;
    }

    public double getCategorie() {
        return categorie;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void like() {
      this.totalLikes++;
    }

    public void played(){
        this.totalPlayed++;
    }
}
