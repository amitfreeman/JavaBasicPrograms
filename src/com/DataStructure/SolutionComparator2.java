package com.DataStructure;
import java.util.*;

class StudentO{
	private int id;
	private String fname;
	private double cgpa;
	public StudentO(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	
	public static Comparator<StudentO> studentCompare = new Comparator<StudentO>(){
		@Override
		public int compare(StudentO s1, StudentO s2) {
			System.out.println("in studentCompare, s1="+s1.toString()+" s2="+s2.toString());
			//int cgpaDiff= Double.compare(s2.cgpa, s1.cgpa);
			//System.out.println("cgpaDiff="+cgpaDiff);
			if (Double.compare(s2.cgpa, s1.cgpa)==0) {
				int nameDiff=s1.fname.compareTo(s2.fname);
				System.out.println("nameDiff="+nameDiff);
				if(nameDiff==0) {
					System.out.println("iddiff="+(s1.id-s2.id));
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
	
	@Override
	public String toString(){
		return "["+this.id+" "+this.fname+" "+this.cgpa+"]";
	}
}

/*class StudentCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}*/

//Complete the code
public class SolutionComparator2
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<StudentO> studentList = new ArrayList<StudentO>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			StudentO st = new StudentO(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        in.close();
        
		Collections.sort(studentList, StudentO.studentCompare);
		
      	for(StudentO st: studentList){
			System.out.println(st.getFname());
		}
	}
}





