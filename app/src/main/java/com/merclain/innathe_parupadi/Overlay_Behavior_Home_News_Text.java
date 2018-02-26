package com.merclain.innathe_parupadi;

/**
 * Created by root on 1/30/18.
 */


import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.view.View;

import jp.satorufujiwara.scrolling.Behavior;


public class Overlay_Behavior_Home_News_Text extends Behavior {

    private final int scrollLimitHeight;

    public Overlay_Behavior_Home_News_Text(Resources r) {
        scrollLimitHeight = r.getDimensionPixelOffset(R.dimen.title_scroll_height);
    }

    @Override
    protected void onScrolled(View target, int scrollY, int dy) {
        ViewCompat.setTranslationY(target, -Math.min(scrollY, scrollLimitHeight));
    }
}