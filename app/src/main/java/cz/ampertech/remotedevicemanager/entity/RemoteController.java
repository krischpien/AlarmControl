package cz.ampertech.remotedevicemanager.entity;

import java.io.Serializable;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteController implements Serializable {

    private long id;
    private String title;
    private String syntax;
    private int position;

    // foreign key
    private long locationId;


    public RemoteController(){

    }

    public RemoteController(long id, String title, int position, long locationId){
        this.id = id;
        this.title = title;
        this.position = position;
        this.locationId = locationId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSyntax() {
        return syntax;
    }

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
}
