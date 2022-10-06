import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public void book() throws ParseException {
        ArrayList<Bus> bus = new ArrayList<>();
        bus.add(new Bus(11, "YBM Travels ", 1499, " Tenkasi ", " Chennai ", true, 23));
        bus.add(new Bus(12, "SS", 999, " Tenkasi ", " Adayar ", false, 44));
        ArrayList<UsersInput> book = new ArrayList<>();

        int userInput = 1;
        Scanner in = new Scanner(System.in);

        while (userInput == 1) {
            for (Bus b : bus) {
                b.busInfo();
                System.out.println("__________________________________________________________________");
            }
            System.out.println("Enter 1 to booking or 0 to exit");
            userInput = in.nextInt();
            if (userInput == 1) {
                UsersInput booking = new UsersInput();
                if (booking.isAvailable(book, bus)) {
                    booking.startInput(bus);
                    System.out.println("Happy  Journey");
                } else {
                    System.out.println("This Bus is full");
                }
            }
        }
    }
}
