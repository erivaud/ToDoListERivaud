package com.example.todolisterivaud;

import com.example.todolisterivaud.Model.Listes;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connects {

    public static Listes get(URL url, String login, String password) throws IOException {

        Gson gson = new Gson();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("login",login);
        connection.setRequestProperty("password",password);
        InputStream inputStream = connection.getInputStream();
        Reader reader = new InputStreamReader(inputStream);
        return  gson.fromJson(reader, Listes.class);
    }
}
