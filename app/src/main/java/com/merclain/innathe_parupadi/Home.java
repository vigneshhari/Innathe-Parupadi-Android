package com.merclain.innathe_parupadi;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.Optional;
import jp.satorufujiwara.scrolling.MaterialScrollingLayout;
import jp.satorufujiwara.scrolling.behavior.ParallaxBehavior;
import jp.satorufujiwara.scrolling.behavior.ScrollFadingBehavior;
import okhttp3.OkHttpClient;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import butterknife.InjectView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.baoyz.widget.PullRefreshLayout;
import com.jacksonandroidnetworking.JacksonParserFactory;
import com.wang.avi.AVLoadingIndicatorView;

import org.json.JSONArray;
import org.json.JSONObject;

import jp.satorufujiwara.scrolling.MaterialScrollingLayout;
import jp.satorufujiwara.scrolling.behavior.ParallaxBehavior;



public class Home extends AppCompatActivity {

    private static Object mContext;
    public AVLoadingIndicatorView avi ;
    public PullRefreshLayout layout ;
    public List<NewsArticle> persons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        setContentView(R.layout.activity_home);
        avi= (AVLoadingIndicatorView) findViewById(R.id.avihome);
        avi.smoothToShow();
        avi.setIndicatorColor(Color.GRAY);
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        final RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);
        TextView titleText = (TextView) findViewById(R.id.titleText) ;
        titleText.setText("Innathe Parupadi");
        View overlayView = (View) findViewById(R.id.overlayView);
        MaterialScrollingLayout scrollingLayout = (MaterialScrollingLayout) findViewById(R.id.materialScrollingLayout);
        ImageView bgImage = (ImageView) findViewById(R.id.bgImage);

        scrollingLayout.addBehavior(bgImage, new ScrollFadingBehavior());
        scrollingLayout.addBehavior(overlayView, new Overlay_Behavior_Home_News(dp(56)));
        scrollingLayout.addBehavior(titleText, new Overlay_Behavior_Home_News_Text(getResources()));

        layout = (PullRefreshLayout) findViewById(R.id.prl);
        layout.setColor(Color.argb(255,97,97,97));
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .build();
        AndroidNetworking.initialize(getApplicationContext(),okHttpClient);
        AndroidNetworking.setParserFactory(new JacksonParserFactory());
// listen refresh event
        persons = new ArrayList<>();
        layout.setOnRefreshListener(new PullRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                persons = new ArrayList<>();

                AndroidNetworking.get(Login.Baseurl + "/news/list/")
                        .build()
                        .getAsJSONObject(new JSONObjectRequestListener() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    JSONArray arr = response.getJSONArray("data");
                                    for(int i = 0 ; i< arr.length() ; i++){
                                        persons.add(new NewsArticle(arr.getJSONObject(i).getString("title"), arr.getJSONObject(i).getString("author"), arr.getJSONObject(i).getString("picurl"),arr.getJSONObject(i).getString("newsid"),new Date()));
                                    }
                                    NewsAdapter adapter = new NewsAdapter(persons);
                                    rv.setAdapter(adapter);
                                    avi.smoothToHide();

                                }
                                catch (Exception e){
                                    Log.e("ERR" , e.toString());
                                }
                            }
                            @Override
                            public void onError(ANError error) {
                                Log.e("ERR" , error.getErrorDetail() );                    }
                        });

                // start refresh
                layout.setRefreshing(false);
            }
        });


        AndroidNetworking.get(Login.Baseurl + "/news/list/")
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray arr = response.getJSONArray("data");
                            for(int i = 0 ; i< arr.length() ; i++){
                                persons.add(new NewsArticle(arr.getJSONObject(i).getString("title"), arr.getJSONObject(i).getString("author"), arr.getJSONObject(i).getString("picurl"),arr.getJSONObject(i).getString("newsid"),new Date()));
                            }
                            NewsAdapter adapter = new NewsAdapter(persons);
                            rv.setAdapter(adapter);
                            avi.smoothToHide();

                        }
                        catch (Exception e){
                            Log.e("ERR" , e.toString());
                        }
                    }
                    @Override
                    public void onError(ANError error) {
                        Log.e("ERR" , error.getErrorDetail() );                    }
                });




    }




    public int dp(final int dp) {
        return (int) (dp * getResources().getDisplayMetrics().density);
    }
    public static Context getAppContext() {
        return (Context)mContext;
    }
}
