package com.example.newsapp;

import com.example.newsapp.Models.NewsHeadlines;

import java.util.ArrayList;

public interface OnFetchDataListener<NewsApiResponse> {

    void onFetchData(ArrayList<NewsHeadlines> arrayList, String message);
    void onError(String message);
}
