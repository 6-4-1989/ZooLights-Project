public class driveThrough {
    public static void main(String[] args)
    {
        double price = 65;
        if(peopleCount > 8) {
            price += (peopleCount-8) * 12;
        }
        if(discountCode.equals("MEMBER")) {
            price *= 0.8;
        }
        System.out.println("Total Price: $" + price);
    }
}