package studentgradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		Enter Total Number of Subject to Calculate their marks
		System.out.println("*****Enter the Total Number of Subjects :  *****");
		int numSubjects=scan.nextInt();
		
		int totalMarks=0;
		
		for(int i=1; i<=numSubjects;i++) {
			System.out.println("Enter marks for Subject"+i+"(out of 100): ");
			int marks=scan.nextInt();
			
//			Input Validation
			
			while(marks<0||marks>100) {
				System.out.println("Invalid marks.Please Enter between 0& 100.");
				System.out.println("Enter marks for Subject"+i+"out of 100");
				marks=scan.nextInt();
			}
			
			totalMarks+=marks;
		}
		
		System.out.println("***Student Result is: ***");
		System.out.println("--------------------------------");
		System.out.println("Total marks obtained in all Subjects :" +totalMarks);
		
		
//	Calculate Average Percentage
		
		int AveragePercentage=totalMarks/numSubjects;
	    System.out.println("Average Percentage : " + AveragePercentage);
	    
	    if(AveragePercentage >=90) {
	    	System.out.println("Your Grade : A+");
	    }
	    else if(AveragePercentage >=80) {
	    	System.out.println("Your Grade : B+");
	    }
	    else if(AveragePercentage >=70) {
	    	System.out.println("Your Grade : B");
	    }
	    else if(AveragePercentage >=60) {
	    	System.out.println("Your Grade : C+");
	    }
	    else if(AveragePercentage >=50) {
	    	System.out.println("Your Grade : C");
	    }
	    else if(AveragePercentage >=40) {
	    	System.out.println("Your Grade : D+");
	    }
	    else if(AveragePercentage >=30) {
	    	System.out.println("Your Grade : D");
	    }
	    else {
	    	System.out.println("Your Grade : E");
	    }	
	}
}
