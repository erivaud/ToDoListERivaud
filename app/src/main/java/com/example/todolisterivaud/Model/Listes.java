package com.example.todolisterivaud.Model;

import java.util.ArrayList;

public class Listes {

    private String utilisateur;
    private String password;
    private ArrayList<ToDoList> todoListes;


    public Listes() {
    }

    public Listes(String utilisateur, String password, ArrayList<ToDoList> todoListes) {
        this.utilisateur = utilisateur;
        this.password = password;
        this.todoListes = todoListes;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<ToDoList> getTodoListes() {
        return todoListes;
    }

    public void setTodoListes(ArrayList<ToDoList> todoListes) {
        this.todoListes = todoListes;
    }

    @Override
    public String toString() {
        return "Listes{" +
                "utilisateur='" + utilisateur + '\'' +
                ", password='" + password + '\'' +
                ", todoListes=" + todoListes +
                '}';
    }


}
