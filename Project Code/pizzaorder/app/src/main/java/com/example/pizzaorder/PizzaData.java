package com.example.pizzaorder;

public class PizzaData {
    private String Size;
    private String Crust;
    private String topWhole;
    private String topLeft;
    private String topRight;

    public PizzaData(String size, String crust, String topWhole, String topLeft, String topRight) {
        Size = size;
        Crust = crust;
        this.topWhole = topWhole;
        this.topLeft = topLeft;
        this.topRight = topRight;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getCrust() {
        return Crust;
    }

    public void setCrust(String crust) {
        Crust = crust;
    }

    public String getTopWhole() {
        return topWhole;
    }

    public void setTopWhole(String topWhole) {
        this.topWhole = topWhole;
    }

    public String getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(String topLeft) {
        this.topLeft = topLeft;
    }

    public String getTopRight() {
        return topRight;
    }

    public void setTopRight(String topRight) {
        this.topRight = topRight;
    }
}
