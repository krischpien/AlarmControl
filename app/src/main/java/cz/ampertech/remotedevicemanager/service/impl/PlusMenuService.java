package cz.ampertech.remotedevicemanager.service.impl;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.menu.PlusMenuItem;
import cz.ampertech.remotedevicemanager.service.MenuService;

/**
 * Created by Jan on 16.09.2015.
 */
public class PlusMenuService implements MenuService {

    private Context context = null;

    public PlusMenuService(Context context){
        this.context = context;
    }

    @Override
    public List<PlusMenuItem> getAllMenuItems() {
        List<PlusMenuItem> menuItems = new ArrayList<>();
        String[] menuItemTitles = context.getResources().getStringArray(R.array.plus_menu_items);
        menuItems.add(new PlusMenuItem(PlusMenuItem.PLUS_MENU_ITEM_ADD_SCREEN, menuItemTitles[0], true));
        menuItems.add(new PlusMenuItem(PlusMenuItem.PLUS_MENU_ITEM_ADD_BUTTON, menuItemTitles[1], true));
        menuItems.add(new PlusMenuItem(PlusMenuItem.PLUS_MENU_ITEM_ADD_EDIT_OR_REMOVE, menuItemTitles[2], true));
        return menuItems;
    }


}
