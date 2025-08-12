import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;


public class Ride implements RideInterface {
    private String name;
    private int minHeightCm;   // Took reference from Movie world roller coaster ride 
    private Employee Operator  ;

    //For Part 5
    private int maxRider = 2;
    private int numOfCycles = 0;



private final Queue <Visitor> waiting = new LinkedList<>();
private final LinkedList<Visitor> history = new LinkedList<>();

    
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
    public void setOperator (Employee Operator ) { 
        this.Operator  = Operator ; 

        if (Operator == null) {
            System.out.println("Operator unassigned from \"" + name + "\".");
        } else {
            System.out.println("Operator assigned: " + Operator.getFirstName() + " " + Operator.getLastName()
                + " to \"" + name + "\".");
        }
    
    }


    // getters and setters for Part 5 

public int getMaxRider() { return maxRider;}
public void setMaxRider(int maxRider) {
    if (maxRider < 1) {
        System.out.println("maxRider must be at least 1. Keeping previous value: " + this.maxRider);
        return;
    }
    this.maxRider = maxRider;
    System.out.println("maxRider set to: " + this.maxRider);
}

public int getNumofCycles (){ return numOfCycles;}

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

    if (v.getAge() <= 0) {
        System.out.println("Cannot add: Visitor," + v.getFirstName() + " "+"age must be greater than 0.");
        return false;
    }
        waiting.offer(v);
        System.out.println("Added to the queue : " + v.getFirstName() + " " + v.getLastName());
        
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
    
     @Override
    public boolean addVisitorToHistory(Visitor v) {
        if (v == null) { System.out.println("Cannot add to history: Visitor is null."); return false; }
        if (v.getFirstName() == null || v.getFirstName().trim().isEmpty() ||
            v.getLastName() == null  || v.getLastName().trim().isEmpty()) {
            System.out.println("Cannot add to history: first/last name missing.");
            return false;
        }

        if (v.getAge() <= 0) {
            System.out.println("Cannot add to history: " + "Visitor," + v.getFirstName() +" "+ "age must be greater than 0.");
            return false;
        }

        boolean ok = history.add(v);
        System.out.println(ok ? "Added to history: " + v.getFirstName() + " " + v.getLastName()
                              : "Failed to add to history.");
        return ok;
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor v) {
        boolean found = history.contains(v);
        if (found) {
            System.out.println("Visitor found in history: " + v.getFirstName() + " " + v.getLastName());
        } else {
            System.out.println("Visitor NOT found in history: " + v.getFirstName() + " " + v.getLastName());
        }
        return found;
    }
    

    @Override public int numberOfVisitors() { 
        int n = history.size();
        System.out.println("Number of Visitor:" + n);      
        return n; }


        @Override
        public void printRideHistory() {
            if (history.isEmpty()) {
                System.out.println("No visitors in history.");
                return;
            }
            System.out.println("Ride history (old to new), size " + history.size() + ":");
            Iterator<Visitor> it = history.iterator(); // required by brief
            int pos = 1;
            while (it.hasNext()) {
                Visitor v = it.next();
                System.out.println(pos++ + ". " + v.getFirstName() + " " + v.getLastName() + " (age " + v.getAge() + ")");
            }
        }
        
        public void sortHistory(java.util.Comparator<Visitor> comparator) {
            java.util.Collections.sort(history, comparator);
            System.out.println("History sorted using " + comparator.getClass().getSimpleName());
        }
        
        @Override
        public void runOneCycle() {
            // Operator check
            if (getOperator() == null) {
                System.out.println(" Cannot run: no operator assigned to \"" + name + "\".");
                return;

            } else {
                System.out.println(" Operator found: " + getOperator().getFirstName() + " " +
                           getOperator().getLastName() + " is assigned to \"" + name + "\".");
            }
        
            //Capacity + queue checks
            if (maxRider < 1) {
                System.out.println(" Cannot run: maxRider must be at least 1.");
                return;
            }
            if (waiting.isEmpty()) {
                System.out.println(" Cannot run: queue is empty.");
                return;
            }
        
            // 
            int toTake = Math.min(maxRider, waiting.size());
            System.out.println(" Running one cycle of \"" + name + "\". Capacity: " + maxRider + ", taking: " + toTake);
        
            for (int i = 0; i < toTake; i++) {
                Visitor v = removeVisitorFromQueue();  
                if (v != null) {
                    addVisitorToHistory(v);            
                }
            }
        
            //Increment cycle count and summary
            numOfCycles++;
            System.out.println(" Cycle complete. Total cycles run: " + numOfCycles);
            System.out.println("   Queue size now: " + waiting.size() + ", History size now: " + history.size());
 
 
        }


        //Part 6 

        public void exportRideHistory(String fileName) {
            if (fileName == null || fileName.trim().isEmpty()) {
                System.out.println("Export failed: filename is empty.");
                return;
            }
            if (history.isEmpty()) {
                System.out.println("No visitors in history to export.");
                return;
            }
        
            java.io.File file = new java.io.File(fileName);
        

            try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(file))) {
               
                for (Visitor v : history) {
              
                    String line = v.getFirstName() + "," +
                                  v.getLastName()  + "," +
                                  v.getAge()       + "," +
                                  v.getTicketId()  + "," +
                                  v.isFastPass();
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println("Ride history successfully exported (" + history.size() +
                                   " visitors) to: " + file.getAbsolutePath());
            } catch (java.io.IOException e) {
                System.out.println("Error exporting ride history to \"" + fileName + "\": " + e.getMessage());
            }
        }
}
