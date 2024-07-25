package oppInheritanceEx1;

public class Main {

	public static void main(String[] args) {
		 Student s1 = new Student("yassine aitoukallal", "rue jaafer ibno habib bourgogne");
	      s1.addCourseGrade("SVT", 17);
	      s1.addCourseGrade("pc", 9);
	      s1.printGrades();

	System.out.println("Average is " + s1.getAverageGrade());
	}

}
