package com.softserve.academy.string;

import com.softserve.academy.ConsoleColors;
import com.softserve.academy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task57 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        System.out.println("\nTask 57: remove spaces from string ");

        try {
            System.out.print("Enter string: ");
            line = br.readLine();
            System.out.println("String with no spaces: " + noSpace(line));

        } catch (IOException |
                NumberFormatException e) {
            System.out.println(ConsoleColors.RED + "You have entered wrong character, please try again" + ConsoleColors.RESET);
            Task57.main(args);
        }

        System.out.println(ConsoleColors.GREEN + "To back to main menu input 1 ");
        System.out.println("Try again  input 2 " + ConsoleColors.RESET);
        try {
            switch (br.readLine()) {
                case "1":
                    Main.main(args);
                    break;
                case "2":
                    Task57.main(args);
                    break;
                default:
                    System.err.println(ConsoleColors.RED + "You need ro put 1 or 2 ");
                    System.err.println("You transfer to menu " + ConsoleColors.RESET);
                    Task59.main(args);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}