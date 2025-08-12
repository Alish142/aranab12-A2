public class AssignmentTwo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride coaster = new Ride("Hyper Coaster", 130, employee);
        Visitor visitor = new Visitor("Ayush", "Rana", 18, "T001", false);


        System.out.println(employee);
        System.out.println(coaster);
        System.out.println(visitor);

        new AssignmentTwo().partThree();
        new AssignmentTwo().partFourA();

    }

    // placeholders for other parts . 
    public void partThree(){
        Employee op = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride ride = new Ride("Hyper Coaster", 130, op);

        Visitor v1 = new Visitor("Nehemia", "Shrestha", 19, "T101", false);
        Visitor v2 = new Visitor("Jason",   "Gurung",   20, "T102", false);
        Visitor v3 = new Visitor("Tom",     "Lama",     18, "T103", false);
        Visitor v4 = new Visitor("Sherly",  "Magar",    21, "T104", true);
        Visitor v5 = new Visitor("Ben",     "KC",       22, "T105", false);
        Visitor v6 = new Visitor("David",   "Bhandari", 23, "T106", true);

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);
        ride.addVisitorToQueue(v6);

        ride.removeVisitorFromQueue();

        ride.printQueue();
    }
    public void partFourA() {
        Employee op = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride ride = new Ride("Hyper Coaster", 130, op);

        Visitor v1 = new Visitor("Nehemia", "Shrestha", 12, "T201", false);
        Visitor v2 = new Visitor("Jason",   "Gurung",   20, "T202", false);
        Visitor v3 = new Visitor("Tom",     "Lama",     18, "T203", false);
        Visitor v4 = new Visitor("Sherly",  "Magar",    21, "T204", true);
        Visitor v5 = new Visitor("Ben",     "KC",       22, "T205", false);

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        ride.checkVisitorFromHistory(v3); 
        //prints counts 
        ride.numberOfVisitors();  
       //Use of the iterator      
        ride.printRideHistory();         
    }
    public void partFourB(){ }
    public void partFive(){ }
    public void partSix(){ }
    public void partSeven(){ }
    
    
}
