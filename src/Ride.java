public class Ride {
    private String name;
    private int minHeightCm;   // Took reference from Movie world roller coaster ride 
    private Employee Operator  ;
    
//Default Constructor 
    public Ride() { }

//paramaterised constructer 
    public Ride(String name, int minHeightCm, Employee Operator ) {
        this.name = name;
        this.minHeightCm = minHeightCm;
        this.Operator  = Operator ;
    }

    //Getters and Setters 

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMinHeightCm() { return minHeightCm; }
    public void setMinHeightCm(int minHeightCm) { this.minHeightCm = minHeightCm; }

    public Employee getOperator () { return Operator ; }
    public void setOperator (Employee Operator ) { this.Operator  = Operator ; }

    @Override
    public String toString() {
        return "Ride[name=" + name + ", minHeightCm=" + minHeightCm + ", Operator =" + Operator  + "]";
    }
}
