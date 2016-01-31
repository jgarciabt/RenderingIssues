package jgarciabt.renderingissues.overdraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import jgarciabt.renderingissues.R;

/**
 * Created by Jose Garcia on 28/01/2016.
 */
public class OverdrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdraw);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new OverdrawFragment())
                    .commit();
        }
    }

}
