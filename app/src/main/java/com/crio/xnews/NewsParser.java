package com.crio.xnews;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NewsParser {
   // private static final ObjectMapper objectMapper = new ObjectMapper();

// TODO: CRIO_TASK_MODULE_PROJECT
// Deserialize JSON String representing the response from the News API and 
// then return the list of NewsArticle objects contained in the response.

    public static List<NewsArticle> parse(String json) throws IOException {
          // Create an ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    // Deserialize JSON string to a NewsApiResponse object
    NewsApiResponse newsApiResponse = objectMapper.readValue(json, NewsApiResponse.class);

    // Return the list of articles from the NewsApiResponse object
    return newsApiResponse.getArticles();
        /* List<NewsArticle> article=new ArrayList<>();

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        
        // Deserialize JSON string to List of NewsArticle objects
        List<NewsArticle> articles = objectMapper.readValue(json, new TypeReference<List<NewsArticle>>() {});

        for(NewsArticle a: articles){
            article.add(a);
        }

        return article;*/
        
    }
}