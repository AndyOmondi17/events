package model;

public class Orders {
    private String login;
    private int idProduct;
    private int numberOfProducts;

    public Orders(String login, int idProduct, int numberOfProducts) {
        super();
        this.login = login;
        this.idProduct = idProduct;
        this.numberOfProducts = numberOfProducts;
    }
}
