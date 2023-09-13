package com.example.newsapp.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class NewsApiResponse implements Serializable {
    public String status;
    public int totalResults;
    public ArrayList<NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<NewsHeadlines> articles) {
        this.articles = articles;
    }
}
