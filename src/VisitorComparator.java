import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor a, Visitor b) {
        int byLast = a.getLastName().compareToIgnoreCase(b.getLastName());
        if (byLast != 0) return byLast;

        int byFirst = a.getFirstName().compareToIgnoreCase(b.getFirstName());
        if (byFirst != 0) return byFirst;

        return Integer.compare(a.getAge(), b.getAge());
    }
}