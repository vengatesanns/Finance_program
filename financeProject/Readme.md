# Collector Interface
        java.util.stream.Collectors.* 

**In the Collector Interface, there are some predefined methods**
1. Collectors.toList()
2. Collectors.toSet()
3. Collectors.toCollection()
1. Collectors.toMap()
1. Collectors.collectingAndThen()
1. Collectors.joining()
1. Collectors.counting()
1. Collectors.summarizingDouble/Long/Int()
1. Collectors.averagingDouble/Long/Int()
1. Collectors.summingDouble/Long/Int()
1. Collectors.maxBy()/minBy()
1.  Collectors.groupingBy()
1. Collectors.partitioningBy()

---------------------------------------------------------------------


**1.** **Collectors.toList()**
        
     ToList collector can be used for collecting all Stream elements into a List instance.
      
    ```
    List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    List<String> val = tech.stream().collect(toList());
    System.out.println(val);
    ```
**Output** 
     [Softwares hardwares]




**2.** **Collectors.toSet()**
        To Eliminate the Duplicate elements in the list.

```
Set<String> tech=new HashSet<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    tech.add("Hardwares");
    Set<String> val = tech.stream().collect(toSet());
    System.out.println(val);
```
**Output** 
     [Softwares hardwares] // Eliminate the duplicates

**3.** **Collectors.toCollection()**
      To implement the Collection functionalities like, "Linked list,Tree,hash map etc..."
```
List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    Collection<String> val=l.stream().collect(toCollection(LinkedList::new));       //return Linked list
    val.removeFirst();         //use Linked list function
    System.out.println(val);     
```
**Output** 
     
    [Softwares hardwares]  //before remove

    [hardwares]            //After  remove First by removeFirst()


**4.** **Collectors.Counting()**
        To use joining for count number of elements in stream
```
List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    Object val=tech.stream().collect(counting());
    System.out.println("Total elelments="+val);     
```
**Output** 
     
    Total elements=2

**5.** **Collectors.joining()**
        To use Joining as to combine the stream of elements
```
List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    String val=g.stream().collect(joining("-"));
    System.out.println(val);     
```
**Output** 
     
    [Softwares-Hardwares]

**6.** **Collectors.minBy()**
        To use minBy to find the minimum element in the stream
```
List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    String val=g.stream().collect(minBy(String::compareTo));
    System.out.println(val);     
```
**Output** 
     
    [Hardwares]

**7.** **Collectors.maxBy()**
        To use minBy to find the minimum element in the stream
```
List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    tech.add("Sim-card");
    String val=g.stream().collect(maxBy(String::compareTo));
    System.out.println(val);     
```
**Output** 
     
    [Softwares] //if first letter is same ,then compared with next letters

**8.** **Collectors.SummingInt()**
        To use SummingInt to calculate the values of the stream
```
List<String> tech=new ArrayList<String>();
    tech.add("Softwares");
    tech.add("Hardwares");
    tech.add("Sim-card");
    Long val=g.stream().collect(summingInt(String::length));
    System.out.println("total values:"+val);     
```
**Output** 
     
    30 // find the length of stream and summing it //is similar as double/Long