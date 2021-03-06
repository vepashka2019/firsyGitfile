package day36.DataConvert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter desired date(M/d/yyyy):");
        String text = scanner.nextLine();

        LocalDate date = LocalDate.parse(text, DateTimeFormatter.ofPattern("M/d/yyyy"));

        System.out.println("converted to LocalDate: " + date);
    }
}
