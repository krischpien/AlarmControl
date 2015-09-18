package cz.ampertech.remotedevicemanager.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;
import cz.ampertech.remotedevicemanager.service.impl.RemoteControllerMock;
import cz.ampertech.remotedevicemanager.view.adapter.HistoryAdapter;

/**
 * Created by Jan on 16.09.2015.
 */
public class HistoryFragment extends Fragment {

    private RemoteControllerService remoteControllerService = null;
    private ListView historyListView = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        historyListView = (ListView) view.findViewById(R.id.history_list_view);
        remoteControllerService = new RemoteControllerMock();

        HistoryAdapter historyAdapter = new HistoryAdapter(getActivity(), remoteControllerService.getCompleteHistory());
        historyListView.setAdapter(historyAdapter);

        return view;
    }
}
