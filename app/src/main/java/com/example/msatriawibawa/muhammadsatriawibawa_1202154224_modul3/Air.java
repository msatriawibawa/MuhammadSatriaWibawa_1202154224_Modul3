package com.example.msatriawibawa.muhammadsatriawibawa_1202154224_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by M. Satria Wibawa on 25/02/2018.
 */

public class Air {

    private String title;
    private String subtitle;
    private int image;

    static final String TITLE_KEY = "Title";
    static final String IMAGE_KEY = "Image Resource";


    public Air(String title, String info, int image) {
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getTitle() {
        return title;
    }

    public static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailActivity.class);
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);

        return detailIntent;
    }
}
