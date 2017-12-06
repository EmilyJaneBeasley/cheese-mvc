package org.launchcode.cheesemvc.models;

import java.util.ArrayList;

public class UserData {

    static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getAll() {
        return users;
    }

    //add
    public static void add(User newUser) {
        users.add(newUser);
    }

    //remove
    public static void remove(int id) {
        User userToRemove = getById(id);
        users.remove(userToRemove);
    }


    //getByID
    public static User getById(int id) {

        User theUser = null;
        for (User candidateUser : users) {
            if (candidateUser.getUserId() == id) {
                theUser = candidateUser;
            }
        }
        return theUser;
    }
}