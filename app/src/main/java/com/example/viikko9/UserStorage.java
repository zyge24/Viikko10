package com.example.viikko9;

import java.util.ArrayList;

public class UserStorage {
    protected static ArrayList<User> users = new ArrayList<>();
    private static UserStorage userStorage = null;

    protected UserStorage() {
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public int getSize(){
        return users.size();
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public void removeUser(int id) {

    }
}
