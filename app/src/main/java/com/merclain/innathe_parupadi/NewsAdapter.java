package com.merclain.innathe_parupadi;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by root on 1/27/18.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.PersonViewHolder> {
    public View view;               // <----- here

    List<NewsArticle> persons;



    NewsAdapter(List<NewsArticle> persons){
        this.view = view;            // <----- here
        this.persons = persons;
    }
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_image_news, viewGroup, false);

        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;}

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).Title);
        personViewHolder.personAge.setText(persons.get(i).Author);
        personViewHolder.articleid.setText(persons.get(i).id);
        Glide.with(Home.getAppContext()).load(Login.Baseurl + persons.get(i).Picurl).centerCrop().into(personViewHolder.personPhoto);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
            CardView cv;
            TextView personName;
            TextView personAge , articleid;
            ImageView personPhoto;

            PersonViewHolder(View itemView) {
                super(itemView);
                cv = (CardView)itemView.findViewById(R.id.cv);
                personName = (TextView)itemView.findViewById(R.id.person_name);
                personAge = (TextView)itemView.findViewById(R.id.person_age);
                personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
                articleid = (TextView)itemView.findViewById(R.id.article_id);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Home.getAppContext(), News.class);
                        i.putExtra("articleid",articleid.getText().toString());
                        Home.getAppContext().startActivity(i);
                    }
                });
            }
        }

}
