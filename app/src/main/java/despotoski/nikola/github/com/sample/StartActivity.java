package despotoski.nikola.github.com.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import despotoski.nikola.github.com.bottomnavigationlayout.sample.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void handleActivity1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void handleActivity2(View view) {
        startActivity(new Intent(this, DemoActivity.class));
    }
}
