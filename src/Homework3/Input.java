package Homework3;

import java.util.Scanner;

public class Input {
    private Scanner s;

    public Input() {
        s = new Scanner(System.in, "cp866");
    }

    public String[] scan() {
        String input;
        if (s.hasNextLine()) {
            input = s.nextLine();
        } else {
            input = "ERROR";
        }
        return input.split(" ");
    }
}
