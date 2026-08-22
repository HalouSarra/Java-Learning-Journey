package advanced;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args){
        // How to work with DATES & TIMES  using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
//        System.out.println(date);

        LocalTime time = LocalTime.now();
//        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        // UTC timestamp
        Instant instant = Instant.now();
//        System.out.println(instant);

        // Custom format to display day and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Custom day and time objects instead of using now
        LocalDate date1 = LocalDate.of(2024, 12, 25);
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println(date1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }
        else if(dateTime1.isAfter(dateTime2)){
            System.out.println(dateTime1 + " is later than " + dateTime2);
        } else if (dateTime1.isEqual(dateTime2)) { // can be used in alarm clock
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }


    }
}