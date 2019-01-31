package eksempel;

public class Comparator {

}

import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
class Student 
{ 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    @Override
	public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
}

class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number
	@Override
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll name
	@Override
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}

// Driver class
class Main {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyname());

		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}

_____________________

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class Student {

	// instance member variables
	String Name;
	int Age;

	// parameterized constructor
	public Student(String Name, Integer Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}

	static class CustomerSortingComparator implements Comparator<Student> {

		@Override
		public int compare(Student customer1, Student customer2) {

			// for comparison
			int NameCompare = customer1.getName().compareTo(customer2.getName());
			int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

			// 2-level comparison using if-else block
			if (NameCompare == 0) {
				return ((AgeCompare == 0) ? NameCompare : AgeCompare);
			} else {
				return NameCompare;
			}
		}
	}

	public static void main(String[] args) {

		// create ArrayList to store Student
		List<Student> al = new ArrayList<>();

		// create customer objects using constructor initialization
		Student obj1 = new Student("Ajay", 27);
		Student obj2 = new Student("Sneha", 23);
		Student obj3 = new Student("Simran", 37);
		Student obj4 = new Student("Ajay", 22);
		Student obj5 = new Student("Ajay", 29);
		Student obj6 = new Student("Sneha", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		// before Sorting arraylist: iterate using Iterator
		Iterator<Student> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(al, new CustomerSortingComparator());

		// after Sorting arraylist: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (Student customer : al) {
			System.out.println(customer);
		}
	}
}