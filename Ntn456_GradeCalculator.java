import java.util.Scanner;
import java.util.*;

class Ntn456_GradeCalculator
{
	private int Exam_1;
	private int Exam_2;
	private int Exam_3;

	private int HomeworkScore;
	private int QuizScore;

	public void setExam1(int i){
		this.Exam_1=i;
	}

	public void setExam2(int i){
		this.Exam_2=i;
	}

	public void setExam3(int i){
		this.Exam_3=i;
	}

	public void setHW(int i){
		this.HomeworkScore=i;
	}

	public void setQuiz(int i){
		this.QuizScore=i;
	}

	Ntn456_GradeCalculator(int exam1, int exam2, int exam3, int homework, int quiz)
	{
		ArrayList<Integer> input_grades = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);

		input_grades.add(exam1);
		input_grades.add(exam2);
		input_grades.add(exam3);
		input_grades.add(homework);
		input_grades.add(quiz);

		ArrayList<Integer> correct_grades = new ArrayList<Integer>();

		for (int x:input_grades)
		{
			int i=0;

			while (x>100 || x<0)
			{

				System.out.println("Invalid input. Please enter a grade between 0 and 100.");
				i= scan.nextInt();

				//while (!(scan.hasNextInt()))
				//{
				//	System.out.println("Please enter an valid integer.");
				//}
				x=i;
			}
			
			correct_grades.add(x);
			System.out.println(correct_grades);
		}

		setExam1(correct_grades.get(0));
		setExam2(correct_grades.get(1));
		setExam3(correct_grades.get(2));
		setHW(correct_grades.get(3));
		setQuiz(correct_grades.get(4));
	}



	public void calculateGrade()
	{

		// double E1= (double)Exam_1;
		// double E2= (double)Exam_2;
		// double E3= (double)Exam_3;
		// double HW= (double)HomeworkScore;
		// double QZ= (double)QuizScore;

		double weighted_average = (Exam_1*.25)+(Exam_2*.25)+(Exam_3*.25)+(HomeworkScore*.1)+(.15*QuizScore);
		if ( weighted_average >= 90)
		{
			System.out.println("A");
		}
		else if ( weighted_average >= 80)
		{
			System.out.println("B");
		}
		else if ( weighted_average >= 70)
		{
			System.out.println("C");
		}
		else if ( weighted_average >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}
}
