package com.cscorner.hungerfree4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView signup;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.signuptext);
        login = findViewById(R.id.loginButton);

        signup.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, signup.class));
        });

        login.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, profile.class));
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginText), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}