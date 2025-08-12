public class AssignmentTwo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride coaster = new Ride("Hyper Coaster", 130, employee);
        Visitor visitor = new Visitor("Ayush", "Rana", 18, "T001", false);

        System.out.println(employee);
        System.out.println(coaster);
        System.out.println(visitor);

        AssignmentTwo a2 = new AssignmentTwo();
        a2.partThree();
        a2.partFourA();
        a2.partFourB();
        a2.partFive();
    }

    // === Part 3 ===
    public void partThree() {
        Employee op = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride ride = new Ride("Hyper Coaster", 130, op);

        Visitor v1 = new Visitor("Nehemia", "Shrestha", 19, "T101", false);
        Visitor v2 = new Visitor("Jason",   "Gurung",   0,  "T102", false); // will fail (age 0) by design
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

        System.out.println("\n--- Current Queue ---");
        ride.printQueue();
    }

    // === Part 4A ===
    public void partFourA() {
        Employee op = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride ride = new Ride("Hyper Coaster", 130, op);

        Visitor v1 = new Visitor("Nehemia", "Shrestha", 0,  "T201", false);  // will fail (age 0)
        Visitor v2 = new Visitor("Jason",   "Gurung",   20, "T202", false);
        Visitor v3 = new Visitor("Tom",     "Lama",     18, "T203", false);  // we'll check this one
        Visitor v4 = new Visitor("Sherly",  "Magar",    21, "T204", true);
        Visitor v5 = new Visitor("Ben",     "KC",       22, "T205", false);

        // added to th collecion 
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // Check if a Visitor is in the collection
        System.out.println("\n--- Check Visitor in History ---");
        ride.checkVisitorFromHistory(v3);

        System.out.println("\n--- Number of Visitors in History ---");
        ride.numberOfVisitors();

        System.out.println("\n--- Ride History ---");
        ride.printRideHistory();
    }

    // === Part 4B ===
    public void partFourB() {
        Employee op = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride ride = new Ride("Hyper Coaster", 130, op);

        ride.addVisitorToHistory(new Visitor("Nehemia", "Shrestha", 19, "T301", false));
        ride.addVisitorToHistory(new Visitor("Jason",   "Gurung",   20, "T302", false));
        ride.addVisitorToHistory(new Visitor("Tom",     "Lama",     18, "T303", false));
        ride.addVisitorToHistory(new Visitor("Sherly",  "Magar",    21, "T304", true));
        ride.addVisitorToHistory(new Visitor("Ben",     "KC",       22, "T305", false));

        System.out.println("\n--- History BEFORE sort ---");
        ride.printRideHistory();

        ride.sortHistory(new VisitorComparator());

        System.out.println("\n--- History AFTER sort (lastname, firstname, age) ---");
        ride.printRideHistory();
    }

    // === Part 5 ===
    public void partFive() {
        Employee op = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride ride = new Ride("Hyper Coaster", 130, op);
        ride.setMaxRider(4); // seats per cycle

        // names of the visitors 
        ride.addVisitorToQueue(new Visitor("Nehemia", "Shrestha", 19, "T401", false));
        ride.addVisitorToQueue(new Visitor("Jason",   "Gurung",   20, "T402", true));
        ride.addVisitorToQueue(new Visitor("Tom",     "Lama",     18, "T403", false));
        ride.addVisitorToQueue(new Visitor("Sherly",  "Magar",    21, "T404", true));
        ride.addVisitorToQueue(new Visitor("Ben",     "KC",       22, "T405", false));
        ride.addVisitorToQueue(new Visitor("David",   "Bhandari", 23, "T406", true));
        ride.addVisitorToQueue(new Visitor("Ayush",   "Rana",     18, "T407", false));
        ride.addVisitorToQueue(new Visitor("Kiran",   "Thapa",    20, "T408", true));
        ride.addVisitorToQueue(new Visitor("Samir",   "Basnet",   19, "T409", false));
        ride.addVisitorToQueue(new Visitor("Ravi",    "Adhikari", 21, "T410", true));

        System.out.println("\n--- Queue BEFORE running one cycle ---");
        ride.printQueue();

        System.out.println("\n--- Run One Cycle ---");
        ride.runOneCycle();

        System.out.println("\n--- Queue AFTER running one cycle ---");
        ride.printQueue();

        System.out.println("\n--- Visitors Who Took the Ride (History) ---");
        ride.printRideHistory();
    }


    public void partSix() { }
    public void partSeven() { }
}
