package cz.ampertech.remotedevicemanager.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.RemoteController;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;
import cz.ampertech.remotedevicemanager.service.impl.RemoteControllerMock;
import cz.ampertech.remotedevicemanager.view.adapter.RemoteControlAdapter;

/**
 * Created by Jan on 14.09.2015.
 */
public class ControlDetailFragment extends Fragment {

    private RemoteControllerService remoteControllerService = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        remoteControllerService = new RemoteControllerMock();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_control_detail, container, false);

        List<RemoteController> remoteControllers = remoteControllerService.getAllRemotesForLocation(0);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        View rootView = getView();
//        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);


    }
}
