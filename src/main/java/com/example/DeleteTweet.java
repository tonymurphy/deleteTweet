package com.example;

import com.github.redouane59.twitter.TwitterClient;
import com.github.redouane59.twitter.signature.TwitterCredentials;

import java.io.File;
import java.io.IOException;

public class DeleteTweet {

    public static void main(String[] args) throws IOException {

        TwitterClient twitterClient = new TwitterClient(TwitterClient.OBJECT_MAPPER
                .readValue(new File("~/credentials.json"),
                        TwitterCredentials.class));

        twitterClient.deleteTweet(tweetId);
    }

}
