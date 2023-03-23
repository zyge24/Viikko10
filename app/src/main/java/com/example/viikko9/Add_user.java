package com.example.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Add_user extends AppCompatActivity {

    private EditText Firstname;
    private EditText Lastname;
    private EditText Email;
    private UserStorage userStorage;
    private Spinner spinner;
    private int picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        UserStorage userStorage = UserStorage.getInstance();

        Firstname = findViewById(R.id.txtFirstName);
        Lastname = findViewById(R.id.txtLastName);
        Email = findViewById(R.id.txtEmail);

        Spinner spinner = (Spinner) findViewById(R.id.sUserPicture);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pictures, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }

    public void addUser(View view) {
        RadioGroup rgSubject = findViewById(R.id.rgSubject);
        Spinner spinner = findViewById(R.id.sUserPicture);
        picture = 0;
        switch (spinner.getSelectedItemPosition()) {
            case 0:
                picture = R.drawable.a;
                break;
            case 1:
                picture = R.drawable.b;
                break;
            case 2:
                picture = R.drawable.c;
                break;
            case 3:
                picture = R.drawable.d;
                break;
        }
        switch (rgSubject.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tietotekniikka", picture));
                break;
            case R.id.rbTuotantotalous:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tuotantotalous", picture));
                break;
            case R.id.rbLate:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Laskennallinen tekniikka", picture));
                break;
            case R.id.rbSahko:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Sähkötekniikka", picture));
                break;
        }
    }
}

