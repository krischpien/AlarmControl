package cz.ampertech.remotedevicemanager.entity.menu;

/**
 * Created by Jan on 16.09.2015.
 */
public class PlusMenuItem {

    public static final int PLUS_MENU_ITEM_ADD_SCREEN = 0;
    public static final int PLUS_MENU_ITEM_ADD_BUTTON = 1;
    public static final int PLUS_MENU_ITEM_ADD_EDIT_OR_REMOVE = 2;


    private int id;
    private String title;
    private boolean enabled;

    public PlusMenuItem(){

    }

    public PlusMenuItem(int id, String title, boolean enabled) {
        this.id = id;
        this.title = title;
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
