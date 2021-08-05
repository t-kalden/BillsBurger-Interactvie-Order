public class Hamburger {
    private String breadRoll, meat, name;
    private double basePrice, additionalPrice = 0;

    public Hamburger() {
        this.breadRoll = "Hawaiian";
        this.meat = "Beef";
        this.name = "Hamburger";
        this.basePrice = 6.99;
        this.additionalPrice = 0;
    }

    public Hamburger(String breadRoll, String meat, String name, double basePrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public double setAdditionalPrice(double additionalPrice) {
        return this.additionalPrice += additionalPrice;
    }

    public void printAdditionMenu(){
        System.out.println("========Bill's  Burger========");
        System.out.println("1. Lettuce   ||  Price=  $1.00");
        System.out.println("2. Tomato    ||  Price=  $1.00");
        System.out.println("3. Cheese    ||  Price=  $1.25");
        System.out.println("4. Bacon     ||  Price=  $2.00");
    }

    public void calcAdditions(String input) {
        int itemInput = Integer.parseInt(input);
        if(itemInput > 0 && itemInput <5) {
            switch (input) {
                case "1":
                    this.additionalPrice += 1;
                    System.out.println("Added Lettuce");
                    break;
                case "2":
                    this.additionalPrice += 1;
                    System.out.println("Added Tomato");
                    break;
                case "3":
                    this.additionalPrice += 1.25;
                    System.out.println("Added Cheese");
                    break;
                case "4":
                    this.additionalPrice += 2;
                    System.out.println("Added Bacon");
                    break;
            }
        }
    }

    public void checkOut(){
        System.out.println("========Bill's  Burger========");
        System.out.println("Burger: " + this.getName());
        System.out.println("Base Price: " + this.getBasePrice());
        System.out.println("Additional Price: " + this.getAdditionalPrice());
        System.out.println("Total: " + (basePrice + getAdditionalPrice()));
    }
}
