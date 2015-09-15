package cz.ampertech.remotedevicemanager.entity;

import java.io.Serializable;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControlLocation implements Serializable {

    private long id;
    private String location;

    public RemoteControlLocation(){

    }

    public RemoteControlLocation(long id, String location){
        this.id = id;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
