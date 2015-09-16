package cz.ampertech.remotedevicemanager;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Jan on 16.09.2015.
 */
public class HistoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getActionBar().setCustomView(R.layout.actionbar);
    }
}
