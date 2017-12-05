package com.tyler;

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class StatusUpdates {


    public static void updateStatus(String stat) {
        TwitterFactory twitterFactory = new TwitterFactory();
        StatusUpdate statusUpdate = new StatusUpdate(
                //Your tweet or status message
                "I love Final Fantasy!!!");

        //tweet or update status
        //Status status = twitter.updateStatus(statusUpdate);


    }
}
