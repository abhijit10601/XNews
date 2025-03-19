package com.crio.xnews;

import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: CRIO_TASK_MODULE_PROJECT
// Refer users.json in the app/src/main/resources directory to declare the necessary variables.
// Utilize your IDE to generate getters and setters for these variables.
// Use your IDE to generate the toString method to create a string representation of the variables.

public class UserPreference {
    @JsonProperty("name")
    private String name;

    @JsonProperty("query")
    private String query;

    @JsonProperty("language")
    private String language;

    @JsonProperty("sortBy")
    private String sortBy;

     // No-argument constructor (default constructor)
     public UserPreference() {
    }

    public UserPreference(String name, String query, String language, String sortBy) {
        this.name = name;
        this.query = query;
        this.language = language;
        this.sortBy = sortBy;
    }
    //Getter & setter for sortBy
    public String getSortBy() {
        return sortBy;
    }
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    //Getter & setter for language
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    
    //Getter & setter for query
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
   
    //Getter & setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //toString by IDE
    @Override
    public String toString() {
        return "UserPreference [language=" + language + ", name=" + name + ", query=" + query
                + ", sortBy=" + sortBy + "]";
    }
   
    // @Override
    // public String toString() {
    //     return "UserPreference{" +
    //             "name='" + name + '\'' +
    //             ", query='" + query + '\'' +
    //             ", language='" + language + '\'' +
    //             ", sortBy='" + sortBy + '\'' +
    //             '}';
    // }

}
