public class Deluxe  extends Hamburger{
    public Deluxe() {
        super("Brioche", "Kobe Beef", "Deluxe", 24.99);
    }

    @Override
    public void printAdditionMenu() {
        System.out.println("==========Bill's  Burger==========");
        System.out.println("1. Truffle Fries ||  Price=  $7.00");
        System.out.println("2. Wine          ||  Price=  $9.00");
    }

    @Override
    public void calcAdditions(String itemInput) {
        double additional = 0;
        switch (itemInput) {
            case "1":
                additional += 7;
                System.out.println("Added Truffle Fries");
                break;
            case "2":
                additional += 9;
                System.out.println("Added Wine");
                break;
        }
        this.setAdditionalPrice(additional);
    }
}
