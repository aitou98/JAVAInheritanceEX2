package oppInheritanceEx1;

public class Main {

	public static void main(String[] args) {
		 Student s1 = new Student("yassine aitoukallal", "rue jaafer ibno habib bourgogne");
		 s1.addCourseGrade("SVT", 17);
	      s1.addCourseGrade("PC", 9);
	      s1.printGrades();
	      System.out.println("Average is " + s1.getAverageGrade());

	      Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
	      System.out.println(t1);
	      String[] courses = {"IM101", "IM102", "IM101"};
	      for (String course: courses) {
	         if (t1.addCourse(course)) {
	            System.out.println(course + " added");
	         } else {
	            System.out.println(course + " cannot be added");
	         }
	      }
	    
	      for (String course: courses) {
	         if (t1.removeCourse(course)) {
	            System.out.println(course + " removed");
	         } else {
	            System.out.println(course + " cannot be removed");
	         }
	      }
	     
	   }

}
