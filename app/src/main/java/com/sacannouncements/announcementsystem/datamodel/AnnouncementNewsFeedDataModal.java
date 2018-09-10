package com.sacannouncements.announcementsystem.datamodel;

public class AnnouncementNewsFeedDataModal {
    private String key;
    private String announcementCaption;
    private String announcementDetails;
    private String categoryOptions;
    private String imagePath;
    private String timestamp;


    public String mAnnouncementCaption ="announcementCaption";
    public String mAnnouncementDetails ="announcementDetails";
    public String mCategoryOptions = "categoryOptions";
    public String mImagePath = "imagePath";
    public String mTimestamp = "timestamp";
    public String mKey = "key";
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setAnnouncementCaption(String announcementCaption) {
        this.announcementCaption = announcementCaption;
    }

    public void setAnnouncementDetails(String announcementDetails) {
        this.announcementDetails = announcementDetails;
    }

    public void setCategoryOptions(String categoryOptions) {
        this.categoryOptions = categoryOptions;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getKey() {
        return key;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getAnnouncementCaption() {
        return announcementCaption;
    }

    public String getAnnouncementDetails() {
        return announcementDetails;
    }

    public String getCategoryOptions() {
        return categoryOptions;
    }

}
