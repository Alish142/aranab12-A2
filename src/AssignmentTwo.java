public class AssignmentTwo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alish", "Ranabhat", 25, "E102", "Ride Operator", true);
        Ride coaster = new Ride("Hyper Coaster", 130, employee);
        Visitor visitor = new Visitor("Ayush", "Rana", 18, "T001", false);


        System.out.println(employee);
        System.out.println(coaster);
        System.out.println(visitor);

    }

    // placeholders for other parts . 
        public void partThree(){ }
    public void partFourA(){ }
    public void partFourB(){ }
    public void partFive(){ }
    public void partSix(){ }
    public void partSeven(){ }
    
    
}
