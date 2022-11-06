package com.example.menu;




import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
       MenuItem item = menu.findItem(R.id.menu_notification);
       View v = item.getActionView();
                   // setContentView(R.layout.custom_notification_item);
      //  TextView tv = v.findViewById(R.id.custom_notification_tv);
       //  tv.setText("12");



        LayoutInflater myinflater =getLayoutInflater();
        View myview= myinflater.inflate(R.layout.custom_notification_item,
                (ViewGroup)findViewById(R.id.relat_ve));
        TextView tv = (TextView)myview.findViewById(R.id.custom_notification_tv);
        tv.setText("12");

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_notification :
                Toast.makeText(this, "notification item", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_setting4 :
                Toast.makeText(this, "setting item", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}




