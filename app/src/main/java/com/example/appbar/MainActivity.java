package com.example.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    /* @see https://developer.android.com/training/appbar/setting-up.html */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
    }

    /* @see https://developer.android.com/guide/topics/ui/menus */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_notes:
                intent = new Intent(this, NotesActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_calendar:
                intent = new Intent(this, CalendarActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_spinner:
                intent = new Intent(this, SpinnerActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_checkboxes:
                intent = new Intent(this, CheckboxesActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_photoalbum:
                intent = new Intent(this, PhotoAlbumActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_subscription:
                intent = new Intent(this, SubscriptionActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_splashscreen:
                intent = new Intent(this, SplashScreenActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
