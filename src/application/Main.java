package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the departament's name: ");
        String departamentName = sc.nextLine();
        System.out.print("Enter the worker data: ");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();
        System.out.print("Level: ");
        String WorkerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
    }
}