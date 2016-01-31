package jgarciabt.renderingissues;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import jgarciabt.renderingissues.overdraw.OverdrawActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button overdrawActivityButton = (Button) findViewById(R.id.overdraw_activity_button);
        overdrawActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                showOverdrawActivity();
            }
        });


        Button optimizedActivityButton = (Button) findViewById(R.id.optimized_activity_button);
        optimizedActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                showOptimizedActivity();
            }
        });

    }

    private void showOverdrawActivity() {

        Intent intent = new Intent(this, OverdrawActivity.class);
        startActivity(intent);
    }

    private void showOptimizedActivity() {

    }

}
