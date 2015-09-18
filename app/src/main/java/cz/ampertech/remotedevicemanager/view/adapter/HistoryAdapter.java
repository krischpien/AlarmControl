package cz.ampertech.remotedevicemanager.view.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.RemoteControlHistoryItem;

/**
 * Created by Jan on 16.09.2015.
 */
public class HistoryAdapter extends BaseAdapter {

    private Context context = null;
    private List<RemoteControlHistoryItem> historyItems = null;

    public HistoryAdapter(Context context, List<RemoteControlHistoryItem> historyItems){
        this.context = context;
        this.historyItems = historyItems;
    }

    @Override
    public int getCount() {
        return historyItems.size();
    }

    @Override
    public RemoteControlHistoryItem getItem(int position) {
        return historyItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return historyItems.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        RemoteControlHistoryItem historyItem = historyItems.get(position);
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_row_history, parent, false);
        }

        TextView historyTextView = (TextView) view.findViewById(R.id.history_item_text_view);
        historyTextView.setText(historyItem.getTitle());

        TextView dateTextView = (TextView) view.findViewById(R.id.history_item_date_text_view);
        dateTextView.setText(historyItem.getSentDate());

        TextView historyStateTextView = (TextView) view.findViewById(R.id.history_item_state_text_view);
        if(historyItem.isSent()){
            historyStateTextView.setText(context.getResources().getString(R.string.history_state_sent));
            historyStateTextView.setBackgroundColor(context.getResources().getColor(R.color.history_item_sent));
        }
        else{
            historyStateTextView.setText(context.getResources().getString(R.string.history_state_not_sent));
            historyStateTextView.setBackgroundColor(context.getResources().getColor(R.color.history_item_not_sent));
        }

        return view;
    }
}
