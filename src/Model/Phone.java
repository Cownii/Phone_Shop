/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Phone implements Serializable{
    private String Phone_ID;
    private String Name;
    private String Brand;
    private Double Price;
    private Integer Quantity;
    private String PColor;


    public Phone(String Phone_ID, String Name, String Brand, Integer Quantity, String Color, Double Price) {
        this.Phone_ID = Phone_ID;
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
        this.Quantity = Quantity;
        this.PColor = Color;
    }

    public String getPColor() {
        return PColor;
    }

    public void setPColor(String PColor) {
        this.PColor = PColor;
    }

    public String getPhone_ID() {
        return Phone_ID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public void setPhone_ID(String Phone_ID) {
        this.Phone_ID = Phone_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
}
