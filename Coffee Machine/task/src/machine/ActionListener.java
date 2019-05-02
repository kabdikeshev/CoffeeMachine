package machine;

import java.util.Scanner;

class ActionListener {

    private Resources resources = new Resources();

    ActionListener() {
    }

    void listen(String actionType) {

        switch (actionType) {
            case "buy":
                buyCoffee(resources);
                break;
            case "fill":
                fillMachine(resources);
                break;
            case "take":
                takeMachineMoney(resources);
                break;
            case "remaining":
                getRemainingResources(resources);
                break;
        }
    }

    private void getRemainingResources(Resources resources) {
        System.out.println("The coffee machine has: \n" +
                resources.getWater() + " of water\n" +
                resources.getMilk() + " of milk\n" +
                resources.getCoffeeBeans() + " of coffee beans\n" +
                resources.getDisposableCups() + " of disposable cups\n" +
                "$" + resources.getMoney() + " of money");
    }

    private void buyCoffee(Resources resources) {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");

        Scanner typeOfCoffeeScanner = new Scanner(System.in);
        String typeOfCoffee = typeOfCoffeeScanner.next();

        switch (typeOfCoffee) {
            case "1":
                if ((resources.getWater() >= 250) && (resources.getCoffeeBeans() >= 16)
                        && (resources.getDisposableCups() >= 1)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    resources.setWater(resources.getWater() - 250);
                    resources.setMilk(resources.getMilk());
                    resources.setCoffeeBeans(resources.getCoffeeBeans() - 16);
                    resources.setDisposableCups(resources.getDisposableCups() -1);
                    resources.setMoney(resources.getMoney() + 4);
                } else if (resources.getWater() < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (resources.getCoffeeBeans() < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (resources.getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "2":
                if ((resources.getWater() >= 350) && (resources.getMilk() >= 75) && (resources.getCoffeeBeans() >= 20)
                        && (resources.getDisposableCups() >=1)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    resources.setWater(resources.getWater() - 350);
                    resources.setMilk(resources.getMilk() - 75);
                    resources.setCoffeeBeans(resources.getCoffeeBeans() - 20);
                    resources.setDisposableCups(resources.getDisposableCups() - 1);
                    resources.setMoney(resources.getMoney() + 7);
                } else if (resources.getWater() < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (resources.getMilk() < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (resources.getCoffeeBeans() < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (resources.getMoney() < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "3":
                if ((resources.getWater() >= 200) && (resources.getMilk() >= 100) && (resources.getCoffeeBeans() >= 12)
                        && (resources.getDisposableCups() >=1)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    resources.setWater(resources.getWater() - 200);
                    resources.setMilk(resources.getMilk() - 100);
                    resources.setCoffeeBeans(resources.getCoffeeBeans() - 12);
                    resources.setDisposableCups(resources.getDisposableCups() - 1);
                    resources.setMoney(resources.getMoney() + 6);
                } else if (resources.getWater() < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (resources.getMilk() < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (resources.getCoffeeBeans() < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (resources.getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "back" :
                break;
        }
    }

    private void fillMachine(Resources resources) {
        System.out.print("Write how many ml of water do you want to add: ");
        Scanner fillScanner = new Scanner(System.in);
        int mlOfWater = fillScanner.nextInt();

        System.out.print("Write how many ml of milk do you want to add: ");
        int mlOfMilk = fillScanner.nextInt();

        System.out.print("Write how many grams of coffee beans do you want to add: ");
        int gramsOfBeans = fillScanner.nextInt();

        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        int cups = fillScanner.nextInt();

        resources.setWater(resources.getWater() + mlOfWater);
        resources.setMilk(resources.getMilk() + mlOfMilk);
        resources.setCoffeeBeans(resources.getCoffeeBeans() + gramsOfBeans);
        resources.setDisposableCups(resources.getDisposableCups() + cups);
        resources.setMoney(resources.getMoney());

    }

    private void takeMachineMoney(Resources resources) {
        System.out.println("I gave you $" + resources.getMoney());
        resources.setMoney(0);
    }
}
