package com.crio.xnews;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsApiClient {

    private static final String API_URL = "https://newsapi.org/v2/everything";
    private static final String API_KEY = "5b9f1a5d606d4b94afa32c249f18e009";
    private OkHttpClient client = new OkHttpClient();
// TODO: CRIO_TASK_MODULE_PROJECT
// Utilize the Okhttp3 library to send a request to the News API, including the provided query, language, and sortBy parameters.
// Ensure that the Gradle dependency for Okhttp3 is included in build.gradle.
// Parse the JSON response using NewsParser.
// If the "query" parameter is empty, an IllegalArgumentException is thrown. 
// If there is an error during the API request or response parsing, IOException is thrown.

    public List<NewsArticle> fetchNewsArticles(String query, String language, String sortBy) throws IOException {

        //return Collections.emptyList();
         // Construct the URL using the buildUrl method
    String url = buildUrl(query, language, sortBy);
    
    // Create the request
    Request request = new Request.Builder()
            .url(url)
            .build();

    // Make the request and retrieve the response
    try (Response response = client.newCall(request).execute()) {
        // Check if the response is successful (HTTP 200)
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }

        // Parse the JSON response using NewsParser
        String responseBody = response.body().string();
        
        // Assuming NewsParser has a method that takes a JSON string and returns a list of NewsArticle objects.
        return NewsParser.parse(responseBody);
    } catch (IOException e) {
        // Rethrow as IOException if there's an error in the request or parsing
        throw new IOException("Error fetching news articles: " + e.getMessage(), e);
    }
    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Construct the URL required to make a request to the News API and use this in above method.
// Refer to https://newsapi.org/docs/endpoints/everything for guidance on URL construction.
// The "query" parameter is mandatory and must not be empty. 
// If the "query" parameter is empty, throw IllegalArgumentException with message "Query parameter must not be empty".
// The "language" and "sortBy" parameters are optional and will be included in the URL if they are non-empty.

    private String buildUrl(String query, String language, String sortBy) {  
     // return API_URL+"?q="+query+"&language="+language+"&sortBy="+sortBy+"&apiKey="+API_KEY;
     
     if (query == null || query.isEmpty()) {
        throw new IllegalArgumentException("Query parameter must not be empty");
    }
    
    // Construct the base URL
    StringBuilder urlBuilder = new StringBuilder(API_URL);
    urlBuilder.append("?q=").append(query);
    
    // Add language parameter if it is non-empty
    if (language!=null && !language.isEmpty()) {
        urlBuilder.append("&language=").append(language);
    }

    // Add sortBy parameter if it is non-empty
    if (sortBy!=null && !sortBy.isEmpty()) {
        urlBuilder.append("&sortBy=").append(sortBy);
    }
    
    // Append the API key at the end
    urlBuilder.append("&apiKey=").append(API_KEY);

    return urlBuilder.toString();
    }
}