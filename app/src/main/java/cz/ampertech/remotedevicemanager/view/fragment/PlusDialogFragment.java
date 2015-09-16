package cz.ampertech.remotedevicemanager.view.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.menu.PlusMenuItem;
import cz.ampertech.remotedevicemanager.service.MenuService;
import cz.ampertech.remotedevicemanager.service.impl.PlusMenuService;
import cz.ampertech.remotedevicemanager.view.adapter.PlusMenuAdapter;

/**
 * Created by Jan on 16.09.2015.
 */
public class PlusDialogFragment extends DialogFragment implements AdapterView.OnItemClickListener{

    private ActivityDialogCallback dialogCallback = null;
    private ListView plusMenuListView = null;
    private MenuService plusMenuService = null;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        dialogCallback = (ActivityDialogCallback) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_plus, null, false);
        plusMenuListView = (ListView) view.findViewById(R.id.dialog_plus_menu_list_view);
        plusMenuService = new PlusMenuService(getActivity());

        PlusMenuAdapter plusMenuAdapter = new PlusMenuAdapter(getActivity(), plusMenuService.getAllMenuItems());
        plusMenuListView.setAdapter(plusMenuAdapter);
        plusMenuListView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch ((int) id){
            case PlusMenuItem.PLUS_MENU_ITEM_ADD_SCREEN:
                Toast.makeText(getActivity(), "Add screen clicked", Toast.LENGTH_SHORT).show();
                break;
            case PlusMenuItem.PLUS_MENU_ITEM_ADD_BUTTON:
                Toast.makeText(getActivity(), "Add button clicked", Toast.LENGTH_SHORT).show();
                break;
            case PlusMenuItem.PLUS_MENU_ITEM_ADD_EDIT_OR_REMOVE:
                Toast.makeText(getActivity(), "Edit or remove clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getActivity(), "menu item missing", Toast.LENGTH_SHORT).show();
        }
        dismiss();
        dialogCallback.setDialogIsVisible(false);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        getActivity().onBackPressed();
    }

    public interface ActivityDialogCallback{
        void setDialogIsVisible(boolean visible);
    }
}
