package com.DataStructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
/* ---version 1, works fine here, but not on submitted compiler ---- */
/*class Student{
	int id;
	String name;
	double cgpa;
	
	Student(int id, String name, double cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}
	public static Comparator<Student> studentCompare = new Comparator<Student>(){
		@Override
		public int compare(Student s1, Student s2) {
	
			if (Double.compare(s2.cgpa, s1.cgpa)==0) {
				int nameDiff=s1.name.compareTo(s2.name);
				//System.out.println("nameDiff="+nameDiff);
				if(nameDiff==0) {
					//System.out.println("iddiff="+(s1.id-s2.id));
					return s1.id-s2.id;
				}
				else {
					return nameDiff;
				}
			}
			else {
				return Double.compare(s2.cgpa, s1.cgpa);
			}
		}
	};
	
}

class Priorities{

	public List<Student> getStudents(List<String> events) {
		 java.util.PriorityQueue<Student> pqueue=new  java.util.PriorityQueue<Student>(Student.studentCompare);
		
		 for(String str: events) {
			 String[] command=str.split(" ");
			// System.out.println("This str is = "+str);
			 if(command[0].equalsIgnoreCase("ENTER")) {
				 Student std=new Student(Integer.parseInt(command[3]),
						            command[1],
						            Double.parseDouble(command[2]));
				 pqueue.add(std);
			 }
			 else if(command[0].equalsIgnoreCase("SERVED")) {
				 pqueue.poll();
				// System.out.println("After polling="+pqueue.toString());
			 }
		 }
		 
		/* priority queue is a heap, order is not guranteed in display, 
	      * need to poll always
	      */
		/*List<Student> o_list=new ArrayList<Student>();
		Student std=pqueue.poll();
		if(std==null) {
			return o_list;
		}
		else {
			while(std != null) {
				o_list.add(std);
				std=pqueue.poll();
			}
		}
		return o_list;
	}
	
}*/

/* --- another comparator ----- 
 * PriorityQueue < Student > student_queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getToken))
 */

class Student implements Comparable<Student>{
	int id;
	String name;
	double cgpa;
	
	Student(int id, String name, double cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		if (Double.compare(this.cgpa, std.cgpa)==0) {
			int nameDiff=this.name.compareTo(std.name);
			if(nameDiff==0) {
				return this.id-std.id;
			}
			else {
				return nameDiff;
			}
		}
		else {
			return Double.compare(std.cgpa, this.cgpa);
		}
	}
	
}

class Priorities{

	public List<Student> getStudents(List<String> events) {
		 java.util.PriorityQueue<Student> pqueue=new  java.util.PriorityQueue<Student>();
		
		 for(String str: events) {
			 String[] command=str.split(" ");
			 if(command[0].equalsIgnoreCase("ENTER")) {
				 Student std=new Student(Integer.parseInt(command[3]),
						            command[1],
						            Double.parseDouble(command[2]));
				 pqueue.add(std);
			 }
			 else if(command[0].equalsIgnoreCase("SERVED")) {
				 pqueue.poll();
				// System.out.println("After polling="+pqueue.toString());
			 }
		 }
		
		 /* priority queue is a heap, order is not guranteed in display, 
		  * need to poll always
		  */
		List<Student> o_list=new ArrayList<Student>();
		Student std=pqueue.poll();
		if(std==null) {
			return o_list;
		}
		else {
			while(std != null) {
				o_list.add(std);
				std=pqueue.poll();
			}
		}
		return o_list;
	}	
}

public class SolutionPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}