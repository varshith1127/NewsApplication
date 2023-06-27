package com.example.newsapplication;

public class CategoryRVModal {
    private String category;
    private String categoryImageurl;

    public CategoryRVModal(String category, String categoryimageUrl) {
        this.category=category;
        this.categoryImageurl=categoryimageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryImageurl() {
        return categoryImageurl;
    }

    public void setCategoryImageurl(String categoryImageurl) {
        this.categoryImageurl = categoryImageurl;
    }
}
