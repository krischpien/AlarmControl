package cz.ampertech.remotedevicemanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import cz.ampertech.remotedevicemanager.entity.RemoteControlLocation;
import cz.ampertech.remotedevicemanager.entity.RemoteController;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControllerMock implements RemoteControllerService {

    @Override
    public List<RemoteControlLocation> getAllRemoteLocations() {
        List<RemoteControlLocation> remoteControllersMockList = new ArrayList<>();
        remoteControllersMockList.add(new RemoteControlLocation(1L, "Řáholec"));
        remoteControllersMockList.add(new RemoteControlLocation(2L, "Kačerov"));
        remoteControllersMockList.add(new RemoteControlLocation(3L, "Kašpárkov"));
        remoteControllersMockList.add(new RemoteControlLocation(4L, "Táborská 31"));
        remoteControllersMockList.add(new RemoteControlLocation(5L, "Perníková chaloupka"));
        remoteControllersMockList.add(new RemoteControlLocation(6L, "Danův pokoj"));
        remoteControllersMockList.add(new RemoteControlLocation(7L, "Happy Hippo Land"));
        remoteControllersMockList.add(new RemoteControlLocation(8L, "Tady"));

        return remoteControllersMockList;
    }

    @Override
    public List<RemoteController> getAllRemoteControllersForLocation(long locationId) {
        List<RemoteController> remoteControllers = new ArrayList<>();
        switch((int) locationId){
            case 1:
                remoteControllers.add(new RemoteController(1L, "Vypustit", 1,locationId));
                remoteControllers.add(new RemoteController(2L, "Napustit", 2, locationId));
                remoteControllers.add(new RemoteController(3L, "Přivolat Rumcajse", 3, locationId));
                break;
            case 2:
                remoteControllers.add(new RemoteController(1L, "Nouze", 1, locationId));
                remoteControllers.add(new RemoteController(2L, "Skrblík", 2,locationId));
                remoteControllers.add(new RemoteController(3L, "Kulík", 3, locationId));
                remoteControllers.add(new RemoteController(4L, "Dulík", 5, locationId));
                break;
            case 3:
                break;
            case 4:
                remoteControllers.add(new RemoteController(1L, "Všechny propustit", 1, locationId));
                remoteControllers.add(new RemoteController(2L, "Přidat prémie", 2, locationId));
                break;
            case 5:
                remoteControllers.add(new RemoteController(1L, "Jíst", 1, locationId));
                break;
            case 6:
                remoteControllers.add(new RemoteController(1L, "Uklidit", 1, locationId));
                remoteControllers.add(new RemoteController(2L, "Uklidit", 2, locationId));
                remoteControllers.add(new RemoteController(3L, "Uklidit", 3, locationId));
                remoteControllers.add(new RemoteController(4L, "Uklidit", 4, locationId));
                remoteControllers.add(new RemoteController(5L, "Uklidit", 5, locationId));
                remoteControllers.add(new RemoteController(6L, "Uklidit", 6, locationId));
                remoteControllers.add(new RemoteController(7L, "Uklidit", 7, locationId));
                remoteControllers.add(new RemoteController(8L, "Uklidit", 8, locationId));
                remoteControllers.add(new RemoteController(9L, "Zavolat pokojskou", 9, locationId));
                break;
            case 7:
                remoteControllers.add(new RemoteController(1L, "Vypnout topení", 1, locationId));
                break;
            case 8:
                remoteControllers.add(new RemoteController(1L, "Být veselý", 1, locationId));
                break;

        }
        return remoteControllers;
    }
}
