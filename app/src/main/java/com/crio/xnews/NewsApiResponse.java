package com.crio.xnews;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsApiResponse {
    @JsonProperty("status")
    private String status;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
    @JsonProperty("totalResults")
    private int totalResults;
    public int getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("articles")
    private List<NewsArticle> articles = new ArrayList<>();
    public List<NewsArticle> getArticles() {
        return articles;
    }
    public void setArticles(List<NewsArticle> articles) {
        this.articles = articles;
    }
    @Override
    public String toString() {
        return "NewsApiResponse [articles=" + articles + ", status=" + status + ", totalResults="
                + totalResults + "]";
    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Use your IDE to generate getters and setters for the variables declared above.
// Use your IDE to generate the toString method to provide a string representation of the variables.

}
