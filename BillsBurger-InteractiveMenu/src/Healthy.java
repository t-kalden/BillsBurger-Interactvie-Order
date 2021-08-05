public class Healthy extends Hamburger{
    public Healthy() {
        super("Whole Wheat Rye", "Turkey", "Healthy", 8.99);
    }

    @Override
    public void printAdditionMenu() {
        super.printAdditionMenu();
        System.out.println("5. Pickles   ||  Price=  $1.25");
        System.out.println("6. Mushrooms ||  Price=  $2.00");
    }

    @Override
    public void calcAdditions(String input) {
        super.calcAdditions(input);
        int itemInput = Integer.parseInt(input);
        if(itemInput == 5 || itemInput == 6) {
            double price = 0;
            switch (input) {
                case "5":
                    price += 1.25;
                    System.out.println("Added Pickles");
                    break;
                case "6":
                    price += 2;
                    System.out.println("Added Mushrooms");
                    break;
            }
            this.setAdditionalPrice(price);
        }
    }
}
