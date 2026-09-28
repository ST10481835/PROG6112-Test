/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author ST10481835 Thabiso Mashego
 */
// Real class that extends the abstract blueprint
public class ConsoleSalesReport extends Consoles {

    public ConsoleSalesReport(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report
    public void printSalesReport() {
        System.out.println("\n--- ELECTRIC STORE SALES REPORT ---");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("-----------------------------------");
    }
}