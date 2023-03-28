package com.example.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class Add_user extends AppCompatActivity {

    private EditText Firstname;
    private EditText Lastname;
    private EditText Email;
    private UserStorage userStorage;
    private Spinner spinner;
    private int picture;
    private ArrayList<String> degrees;

    private Context context;

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
        degrees = getDegrees();
        switch (rgSubject.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tietotekniikka", picture, degrees));
                break;
            case R.id.rbTuotantotalous:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Tuotantotalous", picture, degrees));
                break;
            case R.id.rbLate:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Laskennallinen tekniikka", picture, degrees));
                break;
            case R.id.rbSahko:
                userStorage.addUser(new User(Firstname.getText().toString(), Lastname.getText().toString(), Email.getText().toString(), "Sähkötekniikka", picture, degrees));
                break;
        }
        UserStorage.getInstance().saveUsers(getApplicationContext());
    }

    public ArrayList<String> getDegrees() {
        ArrayList<String> result = new ArrayList<>();
        CheckBox candidate = findViewById(R.id.cbCandidate);
        CheckBox di = findViewById(R.id.cbDi);
        CheckBox doctor = findViewById(R.id.cbDoctor);
        CheckBox swimMaster = findViewById(R.id.cbSwimMaster);
        if (candidate.isChecked()) {
            result.add(String.valueOf(candidate.getText()));
        }
        if (di.isChecked()) {
            result.add(String.valueOf(di.getText()));
        }
        if (doctor.isChecked()) {
            result.add(String.valueOf(doctor.getText()));
        }
        if (swimMaster.isChecked()) {
            result.add(String.valueOf(swimMaster.getText()));
        }
        return result;
    }

}

