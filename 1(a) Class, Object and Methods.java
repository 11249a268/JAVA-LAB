
Algorithm
1. Start.
2. Define a class Student with fields roll, name and marks.
3. Define a method set() to store values and a method show() to print them.
4. In main, create two objects with new.
5. Call set() on each object, then call show() on each object.
6. Stop.

//Program 1.1 — StudentDemo.java (22 lines)
// Ex 1(a): class, object and methods
class Student {
int roll;
String name;
int marks;
void set(int r, String n, int m) {
roll = r; name = n; marks = m;
}
void show() {
System.out.println(roll + " " + name + " " + marks);



}
}
public class StudentDemo {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
s1.set(101, "Aravind", 78);
s2.set(102, "Divya", 91);
System.out.println("ROLL NAME MARKS");
s1.show();
s2.show();
}
}
