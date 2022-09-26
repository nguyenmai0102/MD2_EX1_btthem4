package studentlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap msv");
       int msv = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap Name");
        String name = scanner.nextLine();
        System.out.println("nhap Age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("nhap Sex");
        String sex = scanner.nextLine();
        System.out.println("nhap Email");
        String email = scanner.nextLine();

        System.out.println("nhap phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhap address");
        String address = scanner.nextLine();
        System.out.printf("%15s %10d %15s %30s %6s %20d\n", "StudentID:",msv,"Student Name", name ,"Age",age);
        System.out.printf("%15s %10s %15s %30s %6s %20s\n", "Gender", sex, "Email", email, "phone" , phoneNumber );
        System.out.printf("%40s %60s\n", "address", address);


    }
}

