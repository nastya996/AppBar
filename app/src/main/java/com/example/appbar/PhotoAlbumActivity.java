package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PhotoAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photoalbum);

        TextView textView = findViewById(R.id.textView);
        if (textView.getText().equals("")) {
            int randomNum = new Random().nextInt(100);
            textView.setText("http://myfile.org/" + randomNum);
        }

        Button backBtn = findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button nextBtn = findViewById(R.id.next);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhotoAlbumActivity.this, PhotoAlbumActivity.class);
                startActivity(intent);
            }
        });
    }
}
