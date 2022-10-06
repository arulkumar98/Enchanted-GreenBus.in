public class Bus {
    private int busNo;
    private String busName;
    private int ticketFare;
    private String boarding;
    private String droppingPoint;
    private boolean ac;
    private int cap;

    public Bus(int busNo, String busName, int ticketFare, String boarding, String droppingPoint, boolean ac, int cap) {
        this.busNo = busNo;
        this.busName = busName;
        this.ticketFare = ticketFare;
        this.boarding = boarding;
        this.droppingPoint = droppingPoint;
        this.ac = ac;
        this.cap = cap;
    }

    public int getBusNo() {
        return this.busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public String getBusName() {
        return this.busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public int getTicketFare() {
        return this.ticketFare;
    }

    public void setTicketFare(int ticketFare) {
        this.ticketFare = ticketFare;
    }

    public String getBoarding() {
        return this.boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getDroppingPoint() {
        return this.droppingPoint;
    }

    public void setDroppingPoint(String droppingPoint) {
        this.droppingPoint = droppingPoint;
    }

    public boolean isAc() {
        return this.ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCap() {
        return this.cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public void busInfo() {
        System.out.println();
        System.out.println("Bus Number:" + this.busNo + " Travels Name: " + this.busName);
        System.out.println("Ticket Price ₹" + this.ticketFare);
        System.out.println("Boarding Point:" + this.boarding + "- Destruction " + this.droppingPoint +
                "AC " + this.ac + " Total Seats " + this.cap);
    }
}
