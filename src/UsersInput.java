import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UsersInput {
    int busNo;
    String passengerName;
    String email;
    String gender;
    Date date;

    public void startInput(ArrayList<Bus> check) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the bus Number ");
        this.busNo = in.nextInt();
        System.out.print("Passenger Information");
        System.out.print("Passengers Name:");
        this.passengerName = in.next();
        System.out.println("Enter the E-mail address");
        this.email = in.next();
        String regex = "^(.+)@(.+)$";
        while (!email.matches(regex)) {
            System.out.println("Please enter the valid e-mail address");
            this.email = in.next();
        }
        System.out.println("Gender");
        this.gender = in.next();
        System.out.println("Enter the date in this format dd-mm-yyyy");
        String dateInput = in.next();
        SimpleDateFormat newDate = new SimpleDateFormat("dd-MM-yyyy");
        this.date = newDate.parse(dateInput);
    }

    public boolean isAvailable(ArrayList<UsersInput> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        int booked = 0;
        Scanner in = new Scanner(System.in);
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCap();
                bus.setTicketFare(+200);
            }
            for (UsersInput b : bookings) {
                if (b.busNo == busNo && date.equals(date)) {
                    booked++;
                }
            }
        }
        if (booked > capacity) {
            return false;
        } else
            return true;
    }
}
