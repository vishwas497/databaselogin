package com.producation.vishwas.roomdatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.producation.vishwas.roomdatabase.Models.User;

public class UserActivity extends AppCompatActivity {
    private TextView username;
    private TextView userBirthDate;
    private TextView userEmail;
    private TextView userPassword;

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user = (User) getIntent().getSerializableExtra("User");

        username = findViewById(R.id.username);
        userBirthDate = findViewById(R.id.userBirthdate);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);

        if (user != null) {
            username.setText("WELCOME "+user.getName() );
            userBirthDate.setText(user.getLastName() );
            userEmail.setText(user.getEmail() );
            userPassword.setText(user.getPassword() );
        }
    }
}
