package com.example.viikko9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class User_list extends AppCompatActivity {

    private UserStorage userStorage;
    private RecyclerView recyclerView;
    private static ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        userStorage = UserStorage.getInstance();

        users = userStorage.getUsers();

        Comparator<User> lastNameComparator = new Comparator<User>() {
            public int compare(User p1, User p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        };

        Collections.sort(users, lastNameComparator);

        recyclerView = findViewById(R.id.rvUserList);

        recyclerView.setLayoutManager(new LinearLayoutManager((this)));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), users));
    }


}