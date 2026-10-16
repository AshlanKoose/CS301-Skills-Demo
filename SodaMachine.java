public class SodaMachine {
    private final double prices;
    double total = 0.0;
    double totalPrice = 0.0;

    public SodaMachine(double price){ 
        prices = price;
    }

    public void insertCoin(int amount, String coin){
        if (coin.equalsIgnoreCase("Dollar")){
            total =+ (1.00 * amount);
        } else if (coin.equalsIgnoreCase("Quarter")){
            total =+ (0.25 * amount);
        } else if (coin.equalsIgnoreCase("Dime")){
            total =+ (0.10 * amount);
        } else if (coin.equalsIgnoreCase("Nickel")){
            total =+ (0.05 * amount);
        } else if (coin.equalsIgnoreCase("Penny")){
            total =+ (0.01 * amount);
        }
        IO.println(("Your total is: $" + total));
    }
        public void buy(int amount){
            totalPrice = amount * prices;
        if (totalPrice > total){
            IO.println("You have $" + total + " inserted. You need $" + totalPrice + " for " + amount + " soda(s).");
        } else {
            double change = (getChange(total, totalPrice));
            IO.println("Bought " + amount + " soda(s). Your change is $" + change);
        }
    }
    private Double getChange(double start, double given){
        return start - given;
    }
}
