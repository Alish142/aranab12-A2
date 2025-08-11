public interface RideInterface {
        boolean addVisitorToQueue(Visitor v);
        Visitor removeVisitorFromQueue();
        void printQueue();
    
        void runOneCycle();
    
        boolean addVisitorToHistory(Visitor v);
        boolean checkVisitorFromHistory(Visitor v);
        int numberOfVisitors();
        void printRideHistory();
    }
    

