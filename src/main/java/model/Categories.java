package model;

public class Categories {
    private String categoryName;
    private String description;
    private String imagePath;

    public Categories(String categoryName, String description, String imagePath) {
        super();
        this.categoryName = categoryName;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
