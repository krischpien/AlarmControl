package cz.ampertech.remotedevicemanager.service;

import java.util.List;

import cz.ampertech.remotedevicemanager.entity.RemoteControlLocation;
import cz.ampertech.remotedevicemanager.entity.RemoteController;

/**
 * Created by Jan on 15.09.2015.
 */
public interface RemoteControllerService {

    List<RemoteControlLocation> getAllRemoteLocations();

    List<RemoteController> getAllRemoteControllersForLocation(long locationId);

}
