package cz.ampertech.remotedevicemanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import cz.ampertech.remotedevicemanager.entity.RemoteControlHistoryItem;
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

    @Override
    public List<RemoteControlHistoryItem> getCompleteHistory() {
        List<RemoteControlHistoryItem> historyItems = new ArrayList<>();
        historyItems.add(new RemoteControlHistoryItem(1, 1, "Pokus", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(2, 1, "Test", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(3, 1, "Žaluzie", "2015-05-08-17:48:53", false));
        historyItems.add(new RemoteControlHistoryItem(4, 1, "Pisoár spláchnut", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(5, 1, "Žaluzie", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(6, 1, "Leprikon", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(7, 1, "Okna", "2015-05-08-17:48:53", false));
        historyItems.add(new RemoteControlHistoryItem(8, 1, "Dveře", "2015-05-08-17:48:53", false));
        historyItems.add(new RemoteControlHistoryItem(9, 1, "Kapačky", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(10, 1, "Šuplík", "2015-05-08-17:48:53", false));
        historyItems.add(new RemoteControlHistoryItem(11, 1, "Zásuvka", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(12, 1, "Liška", "2015-05-08-17:48:53", true));
        historyItems.add(new RemoteControlHistoryItem(13, 1, "Želva", "2015-05-08-17:48:53", false));
        historyItems.add(new RemoteControlHistoryItem(14, 1, "Bobík", "2015-05-08-17:48:53", true));
        return historyItems;
    }
}
