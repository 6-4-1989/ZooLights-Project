package files;

public class driveThrough {
    public static void main(String[] args)
    {
        double price = 65; //sets initial price for drive through
        if(peopleCount > 8) { //adds price for >8 people
            price += (peopleCount-8) * 12;
        }
        if(discountCode.equals("MEMBER")) { //discount code application
            price *= 0.8;
        }
        System.out.println("Total Price: $" + price); //output
    }
}