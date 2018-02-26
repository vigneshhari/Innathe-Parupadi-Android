package com.merclain.innathe_parupadi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.jacksonandroidnetworking.JacksonParserFactory;
import com.wang.avi.AVLoadingIndicatorView;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;


public class News extends AppCompatActivity {

    public AVLoadingIndicatorView avi ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_news);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        avi= (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.smoothToShow();
        avi.setIndicatorColor(Color.GRAY);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .build();
        AndroidNetworking.initialize(getApplicationContext(),okHttpClient);
        AndroidNetworking.setParserFactory(new JacksonParserFactory());

        final WebView wv = (WebView) findViewById(R.id.webview);
        Intent intent = getIntent();
        AndroidNetworking.get(Login.Baseurl + "/news/article/")
                .addQueryParameter("id", intent.getStringExtra("articleid"))
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            toolbar.setTitle(response.getString("title"));
                            setSupportActionBar(toolbar);
                            String temp = "<head>\n" +
                                    "\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n" +
                                    "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n" +
                                    "    <link href='https://fonts.googleapis.com/css?family=Merriweather+Sans:400,300,700' rel='stylesheet' type='text/css'>\n" +
                                    "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
                                    "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n" +
                                    "    <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\">\n" +
                                    "    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
                                    "</head><body style=\"background-color : #FAFAFA  \">\n" + response.getString("content") + "</body>" ;
                            wv.loadData(temp, "text/html", "UTF-8");
                            avi.smoothToHide();
                        }
                        catch (Exception e){
                        Log.e("ERR" , e.toString());
                        }
                        }
                    @Override
                    public void onError(ANError error) {
                    Log.e("ERR" , error.toString());                    }
                });




    }

    public void hideClick(View view) {
        avi.hide();
        // or avi.smoothToHide();
    }

    public void showClick(View view) {
        avi.show();
        // or avi.smoothToShow();
    }
}
