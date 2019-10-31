package model;

public class Orders {
    private String login;
    private int idProduct;
    private int numberOfProducts;

    public Orders(String login, int idProduct, int numberOfProducts) {
        super();
        this.idProduct = idProduct;
        this.numberOfProducts = numberOfProducts;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
