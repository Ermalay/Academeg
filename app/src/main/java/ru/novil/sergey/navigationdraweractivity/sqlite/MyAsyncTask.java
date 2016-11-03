package ru.novil.sergey.navigationdraweractivity.sqlite;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;
import android.widget.Toast;

import ru.novil.sergey.navigationdraweractivity.MainActivity;

public class MyAsyncTask extends AsyncTask<Void, Void, String> {

    String string = "String string";
    Context context;


    @Override
    protected String doInBackground(Void... params) {
        return string + " 111";
    }

    @Override
    protected void onPostExecute(String strJson) {
        super.onPostExecute(strJson);
        Toast.makeText(context, "ggggggggggggggggggggggggggggggggg", Toast.LENGTH_SHORT).show();
        MainActivity mainActivity = new MainActivity();
        mainActivity.content_main.setText("jjjjjjjjjjjjjjjj");
    }
}
