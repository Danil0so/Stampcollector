package com.example.stampcollector.image;

import java.util.ArrayList;
import java.util.List;

public class ImageHendler {

    private List<Image> list;

    public List<Image> getList() {
        return list;
    }

    public void addImage(Image image){
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(image);
    }
}
