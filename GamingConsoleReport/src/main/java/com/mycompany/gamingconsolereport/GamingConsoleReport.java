/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author ST10481835 Thabiso Mashego
 */
// Question 1
public class GamingConsoleReport {

    public static void main(String[] args) {
        // 1D array for the different cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // 1D array for the three console names (Header)
        String[] console = {"PS5", "Xbox", "Switch"};

        // 2D array for the sales: Row = City, Column = Console
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        int highestTotal = 0;
        String highestCity = "";

        // Print Report Header
        System.out.println("NUMBER 1 ELECTRONICS FRANCHISE - CONSOLE SALES REPORT");
        System.out.println("[STRIPPED 65 bytes]");
        System.out.printf("%-18s %-10s %-10s %-10s %-10s\n", "City", "PS5", "Xbox", "Switch", "Total");
        System.out.println("[STRIPPED 65 bytes]");

        // Loop through each city to calculate the total
        for (int i = 0; i < cities.length; i++) {
            int ps5Sales = sales[i][0];
            int xboxSales = sales[i][1];
            int switchSales = sales[i][2];
            int total = ps5Sales + xboxSales + switchSales;

            System.out.printf("%-18s %-10d %-10d %-10d %-10d\n", cities[i], ps5Sales, xboxSales, switchSales, total);

            // Find highest selling city
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[i];
            }
        }

        System.out.println("[STRIPPED 65 bytes]");
        System.out.println("Total Sales Breakdown:");
        System.out.println("Cape Town: 6000");
        System.out.println("Port Elizabeth: 9000");
        System.out.println("Pretoria: 3800");
        System.out.println("\nCity with highest sales: " + highestCity + " (" + highestTotal + ")");
    }
}