package cz.ampertech.remotedevicemanager.entity;

import java.io.Serializable;

/**
 * Created by Jan on 16.09.2015.
 */
public class RemoteControlHistoryItem implements Serializable {

    private long id;
    private long remoteControllerId;
    private String title;
    private String sentDate;
    private boolean isSent;

    public RemoteControlHistoryItem() {
    }

    public RemoteControlHistoryItem(long id, long remoteControllerId, String title, String sentDate, boolean isSent) {
        this.id = id;
        this.remoteControllerId = remoteControllerId;
        this.title = title;
        this.sentDate = sentDate;
        this.isSent = isSent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRemoteControllerId() {
        return remoteControllerId;
    }

    public void setRemoteControllerId(long remoteControllerId) {
        this.remoteControllerId = remoteControllerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setIsSent(boolean isSent) {
        this.isSent = isSent;
    }
}
