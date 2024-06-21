/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project.swing;

/**
 *
 * @author farel
 */
public interface product {
    void displayInfo();

    static void printCompanyName() {
        System.out.println("Pearlab Corp");
    }

    default void printCategory() {
        System.out.println("General Product");
    }
}
