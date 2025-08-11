import java.util.LinkedList;
import java.util.Queue;


public class Ride implements RideInterface {
    private String name;
    private int minHeightCm;   // Took reference from Movie world roller coaster ride 
    private Employee Operator  ;

private final Queue <Visitor> waiting = new LinkedList<>();

    
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
    @Override public boolean addVisitorToQueue(Visitor v) { 

        if (v == null) {
            System.out.println("Cannot add: Visitor has no value"  );
            return false;

        }

        if (v.getFirstName() == null || v.getFirstName().trim().isEmpty() ||
        v.getLastName() == null || v.getLastName().trim().isEmpty()) {
        System.out.println("Cannot add: Visitor must have a first and last name.");
        return false;
    }
        waiting.offer(v);
        System.out.println("Added to the queue : " + v.getFirstName() + v.getLastName());
        
        return true; }


   @Override
public Visitor removeVisitorFromQueue() {
    int before = waiting.size();

    Visitor v = waiting.poll();
    if (v == null) {
        System.out.println(" Queue is empty, nothing to remove.");
        return null;
    } 
    int after = waiting.size();
    System.out.println(" Removed from queue: " + v.getFirstName() + " " + v.getLastName()
            + " | size " + before + " → " + after);
    return v;
    
}

    @Override public void printQueue() {
        if (waiting.isEmpty()){
            System.out.println("Queue is empty.");
            return; 

        }
        else {
            System.out.println("Current queue");
            int position = 1;
            for (Visitor v : waiting){
                System.out.println("-" + v.getFirstName()+" " +  v.getLastName());
            }
        }


     }
    @Override public void runOneCycle() { }
    @Override public boolean addVisitorToHistory(Visitor v) { return false; }
    @Override public boolean checkVisitorFromHistory(Visitor v) { return false; }
    @Override public int numberOfVisitors() { return 0; }
    @Override public void printRideHistory() { }
}
