package n1exercise1_Singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
    private static Undo instance;
    private ArrayList<String> commands;

    private Undo(){
        commands = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void add (){
        String input = readString("Introduce the command");
        commands.add(input);
    }

    public void delete(int index){
        commands.remove(index);
    }

    public void listCommands(){
        commands.stream().forEach(System.out::println);
    }

    public static String readString(String message){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.nextLine();
                validInput = true;
            } catch (IllegalStateException e){
                System.err.println("The error occured.");
                System.out.println("Details of the exception: " + e.getMessage());
                scanner.next();
            }
        } while (!validInput);
        return input;
    }
}
