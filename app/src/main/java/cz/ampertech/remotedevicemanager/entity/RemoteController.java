package cz.ampertech.remotedevicemanager.entity;

import java.io.Serializable;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteController implements Serializable {

    private long id;
    private String name;

    public RemoteController(){

    }

    public RemoteController(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
