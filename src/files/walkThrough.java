import java.util.Random;

public class walkThrough
{

    public static String transportationModes(int filler, int fillerStuff, String fillerTicket)
    {
        Random random = new Random();

        switch (filler)
        {
            case 1 -> fillerTicket = "David";
            //fill Driver info here
            case 2 -> {
                for (int i = 0; i < 5; i++) {
                    fillerStuff = random.nextInt(10);
                    fillerTicket += String.valueOf(fillerStuff);
                }
            }
        }
        return fillerTicket;
    }
}
