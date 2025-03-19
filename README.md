# Xnews Application

## Introduction
Xnews is a dynamic application designed to aggregate and display news articles based on user preferences. It emphasizes user customization by allowing individuals to set their preferred language and sorting options.

## Overview
This independent project outlines the implementation of the Xnews application, focusing on its architecture and key functionalities that enhance the user experience by fetching relevant news articles.

![Alt text](https://raw.githubusercontent.com/abhijit10601/XNews/refs/heads/master/Screenshot%202025-03-19%20145100.png
)


## Implementation Steps

### Setup
1. **Workspace Configuration**:
   - Set up your development environment.
   - Fetch the source code stubs to begin the project.


## Key Features
### User Preferences
- Implement the `UserPreferences.java` class to manage user preferences for fetching news articles. 

### Core Components
- **Key Files**:
  - **users.json**: Holds user preferences; includes fields such as language (optional) and sorting criteria (optional).
  - **UserPreferences.java**: Represents user preferences within the application.
  - **App.java**: Serves as the entry point, containing methods to read user preferences from the JSON file.

### Implementation Activities
1. Complete key methods in `UserPreferences.java`.
2. Finalize the `readUserPreferences(String filePath)` method in `App.java`.
3. Run unit tests in `AppTest.java` to ensure correctness.

### API Key Generation
- Generate an API key by visiting [newsapi.org](https://newsapi.org/). This key is essential for making requests to fetch news articles from the external API.

### Fetching News Articles
1. Complete `NewsApiResponse.java` and `NewsArticle.java`.
2. Implement the `parse(String json)` method in `NewsParser.java` to process API responses.
3. Finalize the `fetchNewsArticles(String query, String language, String sortBy)` and `buildUrl(String query, String language, String sortBy)` methods within `NewsApiClient.java`.
4. Run unit tests in `NewsParserTest.java` and `NewsApiClientTest.java` to verify functionality.

### Running the Application
- Execute the command `bash run.sh` to compile and launch the application, ensuring the output matches the expected visuals.
