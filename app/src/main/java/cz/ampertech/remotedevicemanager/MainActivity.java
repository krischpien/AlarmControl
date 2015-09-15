package cz.ampertech.remotedevicemanager;

import android.app.ActionBar;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cz.ampertech.remotedevicemanager.entity.RemoteControlLocation;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;
import cz.ampertech.remotedevicemanager.service.impl.RemoteControllerMock;
import cz.ampertech.remotedevicemanager.view.adapter.RemoteControlPageAdapter;
import cz.ampertech.remotedevicemanager.view.fragment.RemoteControlPageFragment;

public class MainActivity extends FragmentActivity {

    private boolean aboutToExit = false;
    private ViewPager viewPager = null;

    private RemoteControllerService remoteControllerService = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getActionBar().setCustomView(R.layout.actionbar);

        remoteControllerService = new RemoteControllerMock();
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        List<RemoteControlPageFragment> fragmentPages = new ArrayList<>();
        for(RemoteControlLocation rcLocation : remoteControllerService.getAllRemoteLocations()){
            fragmentPages.add(RemoteControlPageFragment.newInstance(rcLocation));
        }

        RemoteControlPageAdapter pageAdapter = new RemoteControlPageAdapter(getSupportFragmentManager(), fragmentPages);

        viewPager.setAdapter(pageAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(this, "settings", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        if (aboutToExit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, getString(R.string.exit_application_confirmation),
                    Toast.LENGTH_SHORT).show();
            aboutToExit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    aboutToExit = false;
                }
            }, 3 * 1000);

        }

    }
}
