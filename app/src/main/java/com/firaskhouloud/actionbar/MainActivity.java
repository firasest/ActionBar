package com.firaskhouloud.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.home) {
            Toast.makeText(getApplicationContext(),"this is home page", Toast.LENGTH_LONG).show();
        } else if (id == R.id.search) {
            Toast.makeText(getApplicationContext(),"you can search from here", Toast.LENGTH_LONG).show();
        } else if (id == R.id.settings) {
            Toast.makeText(getApplicationContext(),"linked to setting interface", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }


}
