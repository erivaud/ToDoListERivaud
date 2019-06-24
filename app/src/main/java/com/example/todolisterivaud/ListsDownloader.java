package com.example.todolisterivaud;

import android.os.AsyncTask;

import com.example.todolisterivaud.Model.Listes;

import java.io.IOException;
import java.net.URL;

public class ListsDownloader extends AsyncTask<URL, Integer, Listes> {

    private MainActivity mainActivity;

    public ListsDownloader(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    protected Listes doInBackground(URL... urls) {
       try {
            publishProgress(10);
            Listes downloadedListes = Connects.get(urls[0],mainActivity.getUserIDInput(),mainActivity.getUserPasswordInput());
            publishProgress(90);
            return downloadedListes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Listes();
    }

    protected void onPostExecute(Listes listes) {

         mainActivity.goToListsView(listes);


        //ListView listView = showLists.findViewById((R.id.listsList));
        /*MyListesAdapter myListesAdapter = new MyListesAdapter(this.showLists);
        myListesAdapter.addAll(listes);
        listView.setAdapter(myListesAdapter);*/
    }
}
