package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class LocalDateIntro {


    public static void main(String[] args) {

        LocalDate person1 =LocalDate.of(1980,12,11);
        LocalDate person2 = LocalDate.of(1980,12,25);

        if(person1.isBefore(person2)){
            System.out.println("person1 is older");
        }else{
            System.out.println("person2 is older");
        }

        boolean r1 = person1.isLeapYear();
        System.out.println(r1);




    }
}
