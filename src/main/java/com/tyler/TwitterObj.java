package com.tyler;

import twitter4j.TimeZone;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
// Class handling my Twitter configuration and authentication
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
