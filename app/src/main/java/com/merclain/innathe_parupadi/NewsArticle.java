package com.merclain.innathe_parupadi;

import java.util.Date;

/**
 * Created by root on 1/27/18.
 */

public class NewsArticle {

    String Title,Author,Picurl ; // picurl is the url of the picture
    Date Pubdate ; // pubdate is the Published Date
    String id ;// article id

    NewsArticle(String Title , String Author , String Picurl , String id, Date Pubdate ){

        this.Title = Title;
        this.Author = Author;
        this.Picurl = Picurl;
        this.Pubdate = Pubdate;
        this.id = id;
    }

}
