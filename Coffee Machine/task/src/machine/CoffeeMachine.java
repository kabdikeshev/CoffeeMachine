package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        boolean exit = true;
        ActionListener actionListener = new ActionListener();

        while (exit) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            Scanner scanner = new Scanner(System.in);
            String actionType = scanner.next();
            if (actionType.equals("exit")) {
                exit = false;
            }
            actionListener.listen(actionType);
        }
    }
}