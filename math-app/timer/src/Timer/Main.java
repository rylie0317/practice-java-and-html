package Timer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myTarget = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        while (alarmTime == null){
            try {
                System.out.println("Enter an alarm time (HH:MM:SS): ");
                String inputTime = myTarget.nextLine();
                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS ");
            }

        }



        myTarget.close();





    }
}