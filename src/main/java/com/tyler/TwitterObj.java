package com.tyler;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/* Class handling my Twitter configuration and authentication
   CREATE Enviromental Variables for the following
   TWITTER_CONSUMER_KEY = 30DJiSLT0Z0rV1iLW197BlrND
   TWITTER_CONSUMER_SECRET = H2BBP8twdOCoWj0PB8XzOSYtX4Su14iIL92DYNHAttqDbPEzJ5
   TWITTER_ACCESS_TOKEN = 937904976835248129-memMeN3WG4mppPH0QHWd4qvCiZgN0fp
   TWITTER_ACCESS_TOKEN_SECRET = heklosMa0qrP4EfzT50QmfE7qyUOxAr43ub1sT12B5JS9
*/

class TwitterObj {
    String consumerKey;
    String consumerKeySecret;
    String accessToken;
    String accessTokenSecret;

    // Authentication
    TwitterObj() {
        this.consumerKey = System.getenv("TWITTER_CONSUMER_KEY");
        this.consumerKeySecret = System.getenv("TWITTER_CONSUMER_SECRET");
        this.accessToken = System.getenv("TWITTER_ACCESS_TOKEN");
        this.accessTokenSecret = System.getenv("TWITTER_ACCESS_TOKEN_SECRET");

    }

    public Twitter configureTwitter() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerKeySecret)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessTokenSecret);

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter t = tf.getInstance();
        return t;
    }
}
