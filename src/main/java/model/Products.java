package model;

public class Products {

    private int idProduct;
    private String productName;
    private String categoryName;
    private String description;
    private String imagePath;
    private int quantity;
    private double unitPrice;

    public Products(int idProduct, String productName, String category, String description, String imagePath,
                    int quantity, double unitPrice) {
        super();
        this.idProduct = idProduct;
        this.productName = productName;
        this.categoryName = category;
        this.description = description;
        this.imagePath = imagePath;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}