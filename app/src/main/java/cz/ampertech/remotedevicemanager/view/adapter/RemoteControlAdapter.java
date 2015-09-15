package cz.ampertech.remotedevicemanager.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.RemoteControlLocation;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControlAdapter extends BaseAdapter {

    private static final String LOG_TAG = "RemoteControlAdapter";
    private List<RemoteControlLocation> remoteControlLocations = null;
    private Context context = null;

    public RemoteControlAdapter(Context context, List<RemoteControlLocation> remoteControlLocations){
        this.context = context;
        this.remoteControlLocations = remoteControlLocations;
    }

    @Override
    public int getCount() {
        return remoteControlLocations.size();
    }

    @Override
    public RemoteControlLocation getItem(int position) {
        return remoteControlLocations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return remoteControlLocations.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = convertView;
        if(rootView == null){
            LayoutInflater inflater = ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
            rootView = inflater.inflate(R.layout.single_row_remote_controller, parent, false);
        }
        TextView remoteControllerNameTextView = (TextView) rootView.findViewById(R.id.remote_controller_name_tv);

        remoteControllerNameTextView.setText(remoteControlLocations.get(position).getLocation());

        return rootView;
    }
}
