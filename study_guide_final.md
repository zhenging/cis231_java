[1] Write a Java method that will take in a generic ArrayList with Doubles (reference type). Have the method take each Double and convert it to an Integer and store it into another generic ArrayList that holds integers.  When done, return the new Integer ArrayList.
```java
private static ArrayList<Integer> convert(ArrayList<Double> nums) {
    ArrayList<Integer> ints = new ArrayList<>();
	  int size = nums.size();
	  for (int i = 0; i < size; i ++) {
	      Double d = nums.get(i);
	      int dd = d.intValue();
	      ints.add(dd);
    }
	  return ints;
}
```

[2] Write a Java method that receives a two-dimensional array of primitive ints (int [] []).  The array can have any number of rows and any number of items per row.  Also the array can be “ragged” (not all rows have the same number of items).  Have the method return the average of all of the items in the array as a primitive double.
```java
private static double average1(int [][] arr) {
    int sum = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i ++) {
        if (arr[i] != null) {
            count += arr[i].length;
            for (int j = 0; j < arr[i].length; j ++) {
                sum += arr[i][j];
            } 
        }

    }
    if (count != 0)
        return (double) sum / count;

    return -1;
}

private static double average2(int [][] arr) {
    int sum = 0;
    int count = 0;
    for (int [] subArr: arr) {
        if (subArr != null) {
            count += subArr.length;
            for (int cellValue: subArr) {
                sum += cellValue;
            }
        }
    }
    if (count != 0)
        return (double) sum / count;

    return -1;
}
```

[3] Given this class, please add the requested methods in the designated spaces provided.
```
public class Student {
    private int ID;
    private String name;
    private double GPA;

    public Student(int id, String newName, double gpa) {
        ID = id;
        name = newName;
        GPA = gpa;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setID(int id) {
        ID = id;
    }

    public void setName(String name) {
        name = name;
    }

    public void setGPA(double gpa) {
        GPA = gpa;
    }

    public String toString() {
        return ID + "|" + name + "|" + GPA;
    }

    public boolean equal(Object obj) {
        if (obj instanceof Student) {
            Student ns = (Student) obj;
            return ns.getID() == ID && ns.getName() == name && ns.getGPA() == GPA;
        }
        return false;
    }
}
```
[4] What are the compile-time and run-time types of the following variables?  Use the classes from the PersonDemo example.
a)
```
// a
// CT: Person
// RT: Person
Person a = new Person();

//b
// CT: Person
// RT: Student
Person b = new Student();

// c
// CT: Student
// RT: Student
Student c = new Student();

// d
// CT: Employee
// RT: Employee
Employee d = new Employee();

// e
// CT: Person
// RT: Employee
Person e = new Employee();
```

[5]Is this assignment legal?  Why or why not?
```
Employee z = new Person();
```
Not legal. The static type of `new Person()` is `Person`, and `Person` IS-NOT-A `Employee`.
