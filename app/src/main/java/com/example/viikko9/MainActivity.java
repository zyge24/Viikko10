package com.example.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //    UserStorage.getInstance().loadUsers(context);
        UserStorage userStorage = UserStorage.getInstance();

    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, Add_user.class);
        startActivity(intent);
    }

    public void switchToUserList(View view) {
        Intent intent = new Intent(this, User_list.class);
        startActivity(intent);
    }
}