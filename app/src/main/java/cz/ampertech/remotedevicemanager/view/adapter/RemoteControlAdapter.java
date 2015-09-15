package cz.ampertech.remotedevicemanager.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.RemoteController;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControlAdapter extends BaseAdapter {

    private static final String LOG_TAG = "RemoteControlAdapter";
    private List<RemoteController> remoteControllers = null;
    private Context context = null;

    public RemoteControlAdapter(Context context, List<RemoteController> remoteControllers){
        this.context = context;
        this.remoteControllers = remoteControllers;
    }

    @Override
    public int getCount() {
        return remoteControllers.size();
    }

    @Override
    public RemoteController getItem(int position) {
        return remoteControllers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return remoteControllers.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = convertView;
        if(rootView == null){
            LayoutInflater inflater = ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
            rootView = inflater.inflate(R.layout.single_row_remote_controller, parent, false);
        }
        TextView remoteControllerNameTextView = (TextView) rootView.findViewById(R.id.remote_controller_name_tv);

        remoteControllerNameTextView.setText(remoteControllers.get(position).getName());

        return rootView;
    }
}
