package cz.ampertech.remotedevicemanager.service;

import android.widget.AdapterView;

import java.util.List;

import cz.ampertech.remotedevicemanager.entity.menu.PlusMenuItem;

/**
 * Created by Jan on 16.09.2015.
 */
public interface MenuService {

    List<PlusMenuItem> getAllMenuItems();
}
