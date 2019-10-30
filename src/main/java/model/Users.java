package model;

public class Users {

    private String login;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String city;
    private double money;

    public Users(String login, String password, String name, String surname, int age, String city, double money) {
        super();
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.money = money;
    }
}
