package org.nsh.uts_yuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depan);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.action_settings) {
            Intent nintent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(nintent);
        }
        return super.onOptionsItemSelected(item);
    }


    public void clickumayyah(View view) {
        Intent i = new Intent(this,umayyah.class);
        startActivity(i);
    }

    public void clickabbasiyah(View view) {
        Intent i = new Intent(this,abbasiyah.class);
        startActivity(i);
    }
}