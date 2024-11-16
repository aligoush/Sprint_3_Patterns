package n1exercise1_Singleton;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        undo.add();
        undo.add();
        undo.add();
        System.out.println("Show all commands added: ");
        undo.listCommands();
        undo.delete(1);
        System.out.println("Show commands after deleting:");
        undo.listCommands();
    }
}
