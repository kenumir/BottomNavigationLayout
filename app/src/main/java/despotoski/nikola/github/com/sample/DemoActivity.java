package despotoski.nikola.github.com.sample;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import despotoski.nikola.github.com.bottomnavigationlayout.BottomNavigationItem;
import despotoski.nikola.github.com.bottomnavigationlayout.BottomTabLayout;
import despotoski.nikola.github.com.bottomnavigationlayout.sample.R;

public class DemoActivity extends AppCompatActivity {

    private BottomTabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        tabs = (BottomTabLayout) findViewById(R.id.tabs);
        tabs.setShadowVisible(false);
        tabs.addOnNavigationItemSelectionListener(new BottomTabLayout.OnNavigationItemSelectionListener() {
            @Override
            public void onBottomNavigationItemSelected(BottomNavigationItem item) {
                switch(item.getPosition()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }

            @Override
            public void onBottomNavigationItemUnselected(BottomNavigationItem item) {

            }
        });
        ViewCompat.setElevation(tabs, 0);
        if (savedInstanceState == null) {
            tabs.setSelectedItemPosition(0);
        }
    }
}
