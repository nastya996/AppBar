package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);

        Button submitBtn = findViewById(R.id.submit);
        Button clearBtn = findViewById(R.id.clear);
        final TextView status = findViewById(R.id.status);
        final EditText username = findViewById(R.id.username);
        final EditText email = findViewById(R.id.email);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = getString(R.string.status);
                status.setText(
                        String.format(
                                message,
                                username.getText().toString(),
                                email.getText().toString()
                        )
                );
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText("");
                email.setText("");
                status.setText("");
            }
        });
    }
}
