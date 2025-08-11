public class Visitor extends Person {
    private String ticketId;
    private boolean fastPass;

    //Default Constructor 
    public Visitor(){}

    //Paramatersied constructor 
    public Visitor(String firstName, String lastName, int age,
    String ticketId, boolean fastPass) {
super(firstName, lastName, age);
this.ticketId = ticketId;
this.fastPass = fastPass;
}

// getters and setters 
public String getTicketId() { return ticketId; }
    public void setTicketId(String ticketId) { this.ticketId = ticketId; }

    public boolean isFastPass() { return fastPass; }
    public void setFastPass(boolean fastPass) { this.fastPass = fastPass; }

    @Override
    public String toString() {
        return "Visitor [" + super.toString() + ", ticketId = " + ticketId + ", fastPass = " + fastPass + "]";
    }
    
}
