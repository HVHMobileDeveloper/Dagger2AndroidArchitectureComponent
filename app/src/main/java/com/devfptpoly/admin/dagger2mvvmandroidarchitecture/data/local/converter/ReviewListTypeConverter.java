package com.devfptpoly.admin.dagger2mvvmandroidarchitecture.data.local.converter;

import androidx.room.TypeConverter;

import com.devfptpoly.admin.dagger2mvvmandroidarchitecture.data.remote.model.Review;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ReviewListTypeConverter {
    @TypeConverter
    public List<Review> fromString(String value) {
        Type listType = new TypeToken<List<Review>>() {}.getType();
        List<Review> reviews = new Gson().fromJson(value, listType);
        return reviews;
    }

    @TypeConverter
    public String fromList(List<Review> reviews) {
        return new Gson().toJson(reviews);
    }
}
