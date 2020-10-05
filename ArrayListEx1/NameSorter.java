import java.util.Comparator;
 
public class NameSorter implements Comparator<Employee> 
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getName().compareToIgnoreCase(o1.getName());
    }
}
