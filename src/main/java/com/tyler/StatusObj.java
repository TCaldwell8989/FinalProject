package com.tyler;

// StatusObj/Tweet object handling the status text and date posted/tweeted
public class StatusObj {
    private String userName;
    private String statusText;
    private String createdAt;

    // Getters and Setters for StatusObj object
    public String getUserName() { return userName; }
    private void setUserName(String userName) { this.userName = userName; }
    public String getText() { return statusText; }
    private void setText(String text) { this.statusText = text; }
    public String getCreatedAt() { return createdAt; }
    private void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    // Constructor for StatusObj/Tweet objects
    public StatusObj(String text, String createdAt) {
        this.statusText = text;
        this.createdAt = createdAt;
    }

}
