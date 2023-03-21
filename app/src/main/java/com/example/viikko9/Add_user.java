package com.example.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Add_user extends AppCompatActivity {

    private EditText Firstname;
    private EditText Lastname;
    private EditText Email;
    private UserStorage userStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        UserStorage userStorage = UserStorage.getInstance();

        Firstname = findViewById(R.id.txtFirstName);
        Lastname = findViewById(R.id.txtLastName);
        Email = findViewById(R.id.txtEmail);

    }

    public void addUser(View view) {
        RadioGroup rgSubject = findViewById(R.id.rgSubject);
        User new_user = null;
        switch (rgSubject.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tietotekniikka"));
                break;
            case R.id.rbTuotantotalous:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tuotantotalous"));
                break;
            case R.id.rbLate:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Laskennallinen tekniikka"));
                break;
            case R.id.rbSahko:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Sähkötekniikka"));
                break;
        }
    }
}

