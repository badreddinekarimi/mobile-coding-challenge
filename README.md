# Mobile Coding Challenge | hiddenfounders
 - This [**challenge**](https://github.com/hiddenfounders/mobile-coding-challenge) is proposed by [**HiddenFounders**](https://github.com/hiddenfounders/).
 - The idea is to create an android application that will list the most starred Github repos that were created in the last 30 days using the Github API. 

## **GET STARTED**

### Features
 - As a User I should be able to list the most starred Github repos that were created in the last 30 days.
 - As a User I should see the results as a list. One repository per row.
 - As a User I should be able to see for each repo/row the following details :
    - Repository name
    - Repository description
    - Numbers of stars for the repo.
    - Username and avatar of the owner.

### Used technology
 - Android/Kotlin
 
### Running the app
 - In order to run this app on a real device or an emulator please follow the steps [**HERE**](https://developer.android.com/training/basics/firstapp/running-app)
 
### Libraries
  - To access the remote API : [**Retrofit2**](https://square.github.io/retrofit/) was the choice because it facilitate the **GSON** conversion , it is based on **REST API**
  - For image loading, i used [**Glide**](https://github.com/bumptech/glide).
  - [**Retrofit2**](https://square.github.io/retrofit/) using OkHttp library for HTTP requests [**OkHttp**](https://github.com/square/okhttp).
  
### APIs
 [**Github Api v3**](https://developer.github.com/v3/)

### Build configuration
 - Android studio 3.2.1
 - Gradle version 3.2.1
 - Android SDK 28