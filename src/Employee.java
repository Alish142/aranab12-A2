public class Employee extends Person {
    private String staffId;
    private String role;     
    private boolean onDuty;

   // Default constructor
    public Employee() { }

    // Paramaterised constructer 

    public Employee(String firstName, String lastName, int age,
                    String staffId, String role, boolean onDuty) {
        super(firstName, lastName, age);
        this.staffId = staffId;
        this.role    = role;
        this.onDuty  = onDuty;
    }

    //getters and setters for Emlpyee
    public String getStaffId() { return staffId; }
    public void setStaffId(String staffId) { this.staffId = staffId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public boolean isOnDuty() { return onDuty; }
    public void setOnDuty(boolean onDuty) { this.onDuty = onDuty; }

    @Override
    public String toString() {
        return "Employee[" + super.toString() + ", staffId = " + staffId + ", role = " + role + ", onDuty = " + onDuty + "]";
    }
}
