package Cast.Audio.Docs;

public class Podcast extends Audio {
    private String host;
    private String description;
    private int episode;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getCategorie() {
        if (this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
      }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
}
