package com.sacannouncements.announcementsystem.MapModel;

import com.google.firebase.firestore.Exclude;

import java.util.HashMap;
import java.util.Map;

public class AnnouncementCategoryMapModel {
    public String key;
    public String categoryName;
    public String timestamp;
    public String categoryDescription;


    public AnnouncementCategoryMapModel(){

    }
    public AnnouncementCategoryMapModel(String key, String categoryName, String timestamp, String categoryDescription){
      this.key = key;
      this.timestamp = timestamp;
      this.categoryDescription = categoryDescription;
      this.categoryName = categoryName;
    }
    @Exclude
    public Map<String,Object> toMap(){
        HashMap<String,Object> result = new HashMap<>();

        result.put("key",key);
        result.put("timestamp",timestamp);
        result.put("categoryDescription",categoryDescription);
        result.put("categoryName",categoryName);

        return result;
    }
}
