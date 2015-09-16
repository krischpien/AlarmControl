package cz.ampertech.remotedevicemanager.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.menu.PlusMenuItem;
import cz.ampertech.remotedevicemanager.view.fragment.PlusDialogFragment;

/**
 * Created by Jan on 16.09.2015.
 */

public class PlusMenuAdapter extends BaseAdapter {

    private Context context = null;
    private List<PlusMenuItem> plusMenuItems = null;

    public PlusMenuAdapter(Context context, List<PlusMenuItem> plusMenuItems){
        this.plusMenuItems = plusMenuItems;
        this.context = context;
    }

    @Override
    public int getCount() {
        return plusMenuItems.size();
    }

    @Override
    public PlusMenuItem getItem(int position) {
        return plusMenuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return plusMenuItems.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_row_plus_menu_item, parent, false);
        }
        TextView menuItemTextView = (TextView) view.findViewById(R.id.plus_menu_item_text_view);
        menuItemTextView.setText(plusMenuItems.get(position).getTitle());

        return view;
    }
}
