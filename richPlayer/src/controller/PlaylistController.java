package controller;

import java.util.ArrayList;
import java.util.List;

import model.Playlist;

public class PlaylistController {
    private  ArrayList<Playlist> mylistData =  new ArrayList();
    public void addToMyLostData(Playlist me){
      mylistData.add(me);
    }
    public void removeFromMyListData(Playlist me){
        mylistData.remove(me);
    }
    public ArrayList<Playlist> getMylistData() {
        return mylistData;
    }
}
