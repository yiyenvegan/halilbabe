package day17_String;

import java.util.Scanner;

public class initial2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        String firstname = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.lastIndexOf(" ")+1);

        System.out.println(firstname);
        System.out.println(lastName);

    }


}
