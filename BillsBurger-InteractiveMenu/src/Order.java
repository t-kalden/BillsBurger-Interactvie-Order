import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("WELCOME TO BILL'S BURGERS! WOULD YOU LIKE TO PLACE AN ORDER? 1 for Yes");
        String input = keyboard.nextLine();
        if(input.equals("1")){
            printMenu();
            System.out.println("WHICH BURGER WOULD YOU LIKE TO ORDER?");
            Hamburger burger = buildBurger(input = keyboard.nextLine());
            printOrder(burger);
            if(burger.getClass().getName() == "Deluxe") {
                System.out.println("WOULD YOU LIKE TO ADD ADDITIONAL ITEMS? 0 for No");
            } else {
                System.out.println("WOULD YOU LIKE ADDITIONAL TOPPINGS? 1 for Yes");
            }
            input = keyboard.nextLine();
            if(input.equals("1")) {
                burger.printAdditionMenu();
                System.out.println("WHAT WOULD YOU LIKE TO ADD? 0 TO CANCEL" );
                input = keyboard.nextLine();
                while(!input.equals("0")) {
                    burger.calcAdditions(input);
                    System.out.println("Current additional total: " + burger.getAdditionalPrice());
                    System.out.println("WOULD YOU LIKE TO ADD ADDITIONAL ITEMS? 0 TO CANCEL");
                    input = keyboard.nextLine();
                }
                burger.checkOut();
            }
        }
        System.out.println("HAVE A GREAT DAY!");


    }
    public static void printMenu() {
        System.out.println("========Bill's  Burger========");
        System.out.println("=====CHOOSE  YOUR  BURGER=====");
        System.out.println("1. Hamburger ||  Price=  $6.99");
        System.out.println("2. Healthy   ||  Price=  $8.99");
        System.out.println("3. Deluxe    ||  Price= $24.99");
    }
    public static void printOrder(Hamburger burger){
        System.out.println("You ordered the " + burger.getName());
        System.out.println("Your price is " + burger.getBasePrice());
    }
    private static Hamburger buildBurger(String input) {
        switch (input) {
            case "1":
                return new Hamburger();
            case "2":
                return new Healthy();
            case "3":
                return new Deluxe();
        }
        return null;
    }
}

