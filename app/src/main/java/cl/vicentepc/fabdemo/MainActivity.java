package cl.vicentepc.fabdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton first,second,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        first = findViewById(R.id.firstFab);
        second = findViewById(R.id.secondFab);
        third = findViewById(R.id.thirdFab);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getRotation() != 0){
                    hideFabs();
                }else{
                    showFabs();
                }
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "IM NORMAL", Toast.LENGTH_SHORT).show();
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "IM HAPPY", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void showFabs(){

        first.animate().rotation(45).setDuration(400).start();
        second.animate().translationY(-150).setDuration(600).start();
        third.animate().translationY(-150).setDuration(800).start();

    }

    private void hideFabs(){
        first.animate().rotation(0).setDuration(400).start();
        second.animate().translationY(0).setDuration(600).start();
        third.animate().translationY(0).setDuration(800).start();
    }

}
