import static java.util.stream.Collectors.*;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.summingInt;
 class A
{

        int sal;
        String dept;

        public A(int sal,String dept)
{
    this.sal=sal;
    this.dept=dept;
}

int getsal()
{
    return sal;
}

String getdept()
{
    return dept;
}

}
public class B 
{
    public static void main(String args[])
    {
    LinkedList<String> l=new LinkedList<String>();
    Collection<String> g=new ArrayList<String>();
    g.add("Softwares");
    g.add("Hardwares");
 //   l.add("vengat");
   // l.add("vijay");
   System.out.println(g);
   //counting
  // Set<String> l1=l.stream().collect(counting());
Object r=g.stream().collect(counting());
 System.out.println(r);
  //linked list
  Collection<String> l2=l.stream().collect(toCollection(LinkedList::new));
   //l2.removeFirst();
   //System.out.println(l2);
   //joining
   // String rs=g.stream().collect(joining("-"));
   //  System.out.println(rs);
//list
  // List<String> g1=new ArrayList<String>();
  // g1.add(new A(1000,"cse"));
 // g1.add(new A(2000,"EEE"));
//summing int
//int result = g.stream().collect(summingInt(A::getsal));
//System.out.println(result);
Set<String> tech=new HashSet<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    tech.add("Hardwares");
    Set<String> val = tech.stream().collect(toSet());
    System.out.println(val);
    }
}