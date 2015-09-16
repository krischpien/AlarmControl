package cz.ampertech.remotedevicemanager.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.RemoteControlLocation;
import cz.ampertech.remotedevicemanager.entity.RemoteController;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;
import cz.ampertech.remotedevicemanager.service.impl.RemoteControllerMock;
import cz.ampertech.remotedevicemanager.view.adapter.RemoteControlAdapter;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControlPageFragment extends Fragment {

    private RemoteControllerService remoteControllerService = null;
    private RemoteControlLocation remoteControlLocation = null;
    private ViewGroup rootView = null;
    private GridView remoteControllerGridView = null;

    private Map<Integer, Button> remoteControllButtonMap = new HashMap<>();


    public static RemoteControlPageFragment newInstance(RemoteControlLocation remoteControlLocation) {

        Bundle args = new Bundle();

        RemoteControlPageFragment fragment = new RemoteControlPageFragment();
        fragment.setArguments(args);
        fragment.setRemoteControlLocation(remoteControlLocation);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_remote_control_grid_page, container, false);

        initializeRemoteControlButtons();
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        remoteControllerGridView = (GridView) rootView.findViewById(R.id.remote_control_grid_view);
        remoteControllerService = new RemoteControllerMock();
        List<RemoteController> remoteControllersForLocation = remoteControllerService.getAllRemoteControllersForLocation(getRemoteControlLocation().getId());
        RemoteControlAdapter remoteControlAdapter = new RemoteControlAdapter(getActivity(), remoteControllersForLocation);
        remoteControllerGridView.setAdapter(remoteControlAdapter);

//        for (RemoteController rc : remoteControllersForLocation){
//            remoteControllButtonMap.get(rc.getPosition()).setText(rc.getTitle());
//        }
    }

    private void initializeRemoteControlButtons() {
//        remoteControllButtonMap.put(1, (Button) rootView.findViewById(R.id.remote_controller_button_1));
//        remoteControllButtonMap.put(2, (Button) rootView.findViewById(R.id.remote_controller_button_2));
//        remoteControllButtonMap.put(3, (Button) rootView.findViewById(R.id.remote_controller_button_3));
//        remoteControllButtonMap.put(4, (Button) rootView.findViewById(R.id.remote_controller_button_4));
//        remoteControllButtonMap.put(5, (Button) rootView.findViewById(R.id.remote_controller_button_5));
//        remoteControllButtonMap.put(6, (Button) rootView.findViewById(R.id.remote_controller_button_6));
//        remoteControllButtonMap.put(7, (Button) rootView.findViewById(R.id.remote_controller_button_7));
//        remoteControllButtonMap.put(8, (Button) rootView.findViewById(R.id.remote_controller_button_8));
//        remoteControllButtonMap.put(9, (Button) rootView.findViewById(R.id.remote_controller_button_9));
    }


    public RemoteControlLocation getRemoteControlLocation() {
        return remoteControlLocation;
    }

    public void setRemoteControlLocation(RemoteControlLocation remoteControlLocation) {
        this.remoteControlLocation = remoteControlLocation;
    }
}
