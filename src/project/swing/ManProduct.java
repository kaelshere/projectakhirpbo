/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.swing;

/**
 *
 * @author farel
 */

public class ManProduct extends item implements product {
    private String size;

    public ManProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }

    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Detailed Info: " + getName() + ", " + getPrice() + ", " + size);
        } else {
            displayInfo();
        }
    }

    @Override
    public void printCategory() {
        System.out.println("Man Product");
    }
}

