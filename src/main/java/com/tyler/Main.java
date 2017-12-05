package com.tyler;

import twitter4j.*;
import twitter4j.auth.AccessToken;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, TwitterException {

        TwitterBotGUI gui = new TwitterBotGUI();

        //Twitter App's Consumer Key
        String consumerKey = System.getenv("TWITTER_CONSUMER_KEY");
        System.out.println(consumerKey);

        //Twitter App's Consumer Secret
        String consumerSecret = System.getenv("TWITTER_CONSUMER_SECRET");

        //Twitter App's Access Token
        String accessToken = System.getenv("TWITTER_ACCESS_TOKEN");

        //Twitter App's Access Token Secret
        String accessTokenSecret = System.getenv("TWITTER_ACCESS_TOKEN_SECRET");

        //Instantiate a new re-usable and thread-safe factory
        TwitterFactory twitterFactory = new TwitterFactory();

        //Instantiate a new Twitter Instance
        Twitter twitter = twitterFactory.getInstance();

        //Setup OAuth Consumer Credentials
        twitter.setOAuthConsumer(consumerKey, consumerSecret);

        //Setup OAuth Access Token
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));

        //Instantiate and initialize a new twitter status update
        //StatusUpdate statusUpdate = new StatusUpdate(
                //Your tweet or status message
//                "I love Final Fantasy!!!");

        //tweet or update status
        //Status status = twitter.updateStatus(statusUpdate);

        //response from twitter server
//        System.out.println("status.ToString() = " + status.toString());
//        System.out.println("status.getInReplyToScreenName() = " + status.getInReplyToScreenName());
//        System.out.println("status.getSource() = " + status.getSource());
//        System.out.println("status.getText() + " + status.getText());
//
//        System.out.println("status.getURLEntities() = " + Arrays.toString(status.getURLEntities()));
//        System.out.println("status.getUserMentionEntities() = " + Arrays.toString(status.getUserMentionEntities()));

    }

}
