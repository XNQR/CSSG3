package lab2;

import java.util.Scanner;

public class P6_Overall_grade {

	public static void main(String[] args) {
		double assessment_1_masks, assessment_2_masks, lab_assignment_masks, final_exam_masks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Assessment 1 masks: ");
		assessment_1_masks = input.nextDouble();
		
		System.out.println("Enter Assessment 2 masks: ");
		assessment_2_masks = input.nextDouble();
		
		System.out.println("Enter Lab Assignment masks: ");
		lab_assignment_masks = input.nextDouble();
		
		System.out.println("Enter Final Exam masks: ");
		final_exam_masks = input.nextDouble();
		
		input.close();
		
		final double ASSESSMENT_1_WEIGHTING = 0.15;
		final double ASSESSMENT_2_WEIGHTING = 0.20;
		final double LAB_ASSIGNMENT_WEIGHTING = 0.35;
		final double FINAL_EXAM_WEIGHTING = 0.30;
		
		double overall_grade = assessment_1_masks * ASSESSMENT_1_WEIGHTING + assessment_2_masks * ASSESSMENT_2_WEIGHTING + lab_assignment_masks * LAB_ASSIGNMENT_WEIGHTING + final_exam_masks * FINAL_EXAM_WEIGHTING;
		
		System.out.println("Overall grade: " + overall_grade);

	}

}
