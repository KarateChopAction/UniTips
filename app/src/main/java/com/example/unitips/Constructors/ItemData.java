package com.example.unitips.Constructors;

public class ItemData {
    private String title;
    private String description;
    private String category;


    public ItemData() {
        // Empty constructor needed
    }

    public ItemData(String title, String description, String category) {
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}
