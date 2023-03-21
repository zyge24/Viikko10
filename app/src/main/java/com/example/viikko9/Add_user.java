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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        Firstname = findViewById(R.id.txtFirstName);
        Lastname = findViewById(R.id.txtLastName);
        Email = findViewById(R.id.txtEmail);

    }

    public void addUser() {
        RadioGroup rgSubject = findViewById(R.id.rgSubject);
        User new_user = null;
        switch (rgSubject.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                new_user = new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tietotekniikka");
                break;
            case R.id.rbTuotantotalous:
                new_user = new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tuotantotalous");
                break;
            case R.id.rbLate:
                new_user = new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Laskennallinen tekniikka");
                break;
            case R.id.rbSahko:
                new_user = new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Sähkötekniikka");
                break;
        }
        UserStorage.addUser(new_user);

    }
}