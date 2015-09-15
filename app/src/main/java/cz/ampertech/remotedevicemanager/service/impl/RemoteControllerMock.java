package cz.ampertech.remotedevicemanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import cz.ampertech.remotedevicemanager.entity.RemoteController;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControllerMock implements RemoteControllerService {

    @Override
    public List<RemoteController> getAllRemotesForLocation(long locationId) {
        List<RemoteController> remoteControllersMockList = new ArrayList<>();
        remoteControllersMockList.add(new RemoteController(1L, "Controller 1"));
        remoteControllersMockList.add(new RemoteController(2L, "Trabant 2"));
        remoteControllersMockList.add(new RemoteController(3L, "Kolobrnda 3"));
        remoteControllersMockList.add(new RemoteController(4L, "Kulomet 4"));
        remoteControllersMockList.add(new RemoteController(5L, "Šampón 5"));
        remoteControllersMockList.add(new RemoteController(6L, "Kulatá babička 6"));
        remoteControllersMockList.add(new RemoteController(7L, "Pakatel 7"));
        remoteControllersMockList.add(new RemoteController(8L, "Kovadlina 8"));

        return remoteControllersMockList;
    }
}
