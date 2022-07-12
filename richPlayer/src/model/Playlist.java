package model;
import java.io.Serializable;

public class Playlist implements Serializable {
    private String musicUrl;
    
    public Playlist(String musicUrl){
     this.musicUrl =  musicUrl;
    }

    public String getTitle() {
        return musicUrl;
    }
    public void setTitle(String musicUrl) {
        this.musicUrl = musicUrl;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
