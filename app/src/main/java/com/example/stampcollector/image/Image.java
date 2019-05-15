package com.example.stampcollector.image;

import android.graphics.Bitmap;

public class Image {

    private Bitmap small_image;
    private Bitmap origin_image;

    public Bitmap getSmall_image() {
        return small_image;
    }

    public void setSmall_image(Bitmap small_image) {
        this.small_image = small_image;
    }

    public Bitmap getOrigin_image() {
        return origin_image;
    }

    public void setOrigin_image(Bitmap origin_image) {
        this.origin_image = origin_image;
    }
}
