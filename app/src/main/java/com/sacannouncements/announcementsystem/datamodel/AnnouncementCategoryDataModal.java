package com.sacannouncements.announcementsystem.datamodel;

public class AnnouncementCategoryDataModal {
    private String key;
    private String categoryName;
    private String timestamp;
    private String categoryDescription;

    public String mKey ="key";
    public String mCategoryName ="categoryName";
    public String mTimestamp = "timestamp";
    public String mCategoryDescription = "categoryDesciption";

    public void setKey(String key) {
        this.key = key;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getKey() {
        return key;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
