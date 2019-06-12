package com.example.todolisterivaud.Model;

import java.util.Arrays;

public class Listes {

    private String utilisateur;
    private String password;
    private ToDoList[] todoListes;

    public Listes() {
    }

    public Listes(String utilisateur, String password) {
        this.utilisateur = utilisateur;
        this.password = password;
    }

    public Listes(String utilisateur, String password, ToDoList[] todoListes) {
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

    public ToDoList[] getTodoListes() {
        return todoListes;
    }

    public void setTodoListes(ToDoList[] todoListes) {
        this.todoListes = todoListes;
    }

    @Override
    public String toString() {
        return "Listes{" +
                "utilisateur='" + utilisateur + '\'' +
                ", password='" + password + '\'' +
                ", todoListes=" + Arrays.toString(todoListes) +
                '}';
    }
}
