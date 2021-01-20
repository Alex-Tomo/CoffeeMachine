package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int amountOfWater = 400;
    private static int amountOfMilk = 540;
    private static int amountOfCoffeeBeans = 120;
    private static int amountOfDisposableCups = 9;
    private static int amountOfMoney = 550;

    public static void main(String[] args) {
        coffeeAction();
    }

    public static void coffeeInventory() {
        System.out.println("The coffee machine has:");
        System.out.println(amountOfWater + " of water");
        System.out.println(amountOfMilk + " of milk");
        System.out.println(amountOfCoffeeBeans + " of coffee beans");
        System.out.println(amountOfDisposableCups + " of disposable cups");
        System.out.println(amountOfMoney + " of money");

        coffeeAction();
    }

    public static void coffeeAction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        switch(action) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillCoffeeInventory();
                break;
            case "take":
                takeMoney();
                break;
            case "exit":
                exitCoffee();
                break;
            case "remaining":
                coffeeInventory();
                break;
        }
    }

    public static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String decision = scanner.next();

        switch(decision) {
            case "1":
                if ((amountOfWater >= 250) && (amountOfCoffeeBeans >= 16)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    amountOfWater -= 250;
                    amountOfCoffeeBeans -= 16;
                    amountOfDisposableCups--;
                    amountOfMoney += 4;
                } else if((amountOfWater < 250) && (amountOfCoffeeBeans < 16)) {
                    System.out.println("Not enough water or coffee beans, sorry!");
                } else if(amountOfWater < 250) {
                    System.out.println("Not enough water, sorry!");
                } else if(amountOfCoffeeBeans < 16) {
                    System.out.println("Not enough coffee beans, sorry!");
                }
                break;

            case "2":
                if ((amountOfWater >= 350) && (amountOfMilk >= 75) && (amountOfCoffeeBeans >= 20)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    amountOfWater -= 350;
                    amountOfMilk -= 75;
                    amountOfCoffeeBeans -= 20;
                    amountOfDisposableCups--;
                    amountOfMoney += 7;
                } else if((amountOfWater < 350) && (amountOfMilk < 75) && (amountOfCoffeeBeans < 20)) {
                    System.out.println("Not enough water or coffee beans, sorry!");
                } else if(amountOfWater < 350) {
                    System.out.println("Not enough water, sorry!");
                } else if(amountOfMilk < 75) {
                    System.out.println("Not enough milk, sorry!");
                } else if(amountOfCoffeeBeans < 20) {
                    System.out.println("Not enough coffee beans, sorry!");
                }
                break;

            case "3":
                if ((amountOfWater >= 200) && (amountOfMilk >= 100) && (amountOfCoffeeBeans >= 12)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    amountOfWater -= 200;
                    amountOfMilk -= 100;
                    amountOfCoffeeBeans -= 12;
                    amountOfDisposableCups--;
                    amountOfMoney += 6;
                } else if((amountOfWater < 200) && (amountOfMilk < 100) && (amountOfCoffeeBeans < 12)) {
                    System.out.println("Not enough water or coffee beans, sorry!");
                } else if(amountOfWater < 200) {
                    System.out.println("Not enough water, sorry!");
                } else if(amountOfMilk < 100) {
                    System.out.println("Not enough milk, sorry!");
                } else if(amountOfCoffeeBeans < 12) {
                    System.out.println("Not enough coffee beans, sorry!");
                }
                break;
            case "back":
                coffeeAction();
                break;
        }

        coffeeAction();
    }

    public static void fillCoffeeInventory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addDisposableCups = scanner.nextInt();

        amountOfWater += addWater;
        amountOfMilk += addMilk;
        amountOfCoffeeBeans += addCoffeeBeans;
        amountOfDisposableCups += addDisposableCups;

        coffeeAction();
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + amountOfMoney);
        amountOfMoney = 0;

        coffeeAction();
    }

    public static void exitCoffee() {
        System.exit(0);
    }

    public static void makeCoffee() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

}
