/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author ST10481835 Thabiso Mashego
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("select the beverage type");
        System.out.println("1. ps5");
        System.out.println("2. xbox");
        System.out.println("3. switch");
        System.out.println();
        int choice = input.nextInt();
        input.nextLine();

        String consoleType = "";
        if (choice == 1) consoleType = "ps5";
        else if (choice == 2) consoleType = "xbox";
        else if (choice == 3) consoleType = "switch";

        System.out.print("enter the store: ");
        String storeName = input.nextLine();

        System.out.print("enter the total number oof " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = input.nextInt();

        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
        sale.printReport();

        input.close();
    }
}