package org.chapter4.absolutejava;

public class StudentRecord {

	private static final double QUIZ = 25;
	private static final double MIDTERM = 35;
	private static final double FINALEXAM = 45;
	private static final double SMALL = 30;
	private static final double BIG = 100;

	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midterm;
	private double finalExam;
	private double overallScore;
	@SuppressWarnings("unused")
	private char letterGrade;

	public void setQuiz1(double quiz1) {
		if ((quiz1 < 0) && (quiz1 > 10)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.quiz1 = quiz1;
		}
	}

	public void setQuiz2(double quiz2) {
		if ((quiz2 < 0) && (quiz2 > 10)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.quiz2 = quiz2;
		}
	}

	public void setQuiz3(double quiz3) {
		if ((quiz3 < 0) && (quiz3 > 10)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.quiz3 = quiz3;
		}
	}

	public double quizTotal() {
		return (((quiz1 + quiz2 + quiz3) / StudentRecord.SMALL) * StudentRecord.QUIZ);
	}

	public void setMidterm(double midterm) {
		if ((midterm < 0) && (midterm > 100)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.midterm = midterm;
		}
	}

	public double midtermTotal() {
		return ((midterm / StudentRecord.BIG) * StudentRecord.MIDTERM);
	}

	public void setFinalExam(double finalExam) {
		if ((finalExam < 0) && (finalExam > 100)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.finalExam = finalExam;
		}
	}

	public double finalExamTotal() {
		return ((finalExam / StudentRecord.BIG) * StudentRecord.FINALEXAM);
	}

	public double getOverallScore() {
		if ((this.overallScore < 0) && (this.overallScore > 100)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		}
		return this.overallScore = quizTotal() + midtermTotal() + finalExamTotal();
	}

	public char getLetterGrade() {
		if ((getOverallScore() >= 0) && (getOverallScore() < 60)) {
			return this.letterGrade = 'F';
		} else if ((getOverallScore() >= 60) && (getOverallScore() < 70)) {
			return this.letterGrade = 'D';
		} else if ((getOverallScore() >= 70) && (getOverallScore() < 80)) {
			return this.letterGrade = 'C';
		} else if ((getOverallScore() >= 80) && (getOverallScore() < 90)) {
			return this.letterGrade = 'B';
		} else {
			return this.letterGrade = 'A';
		}
	}

	@Override
	public String toString() {
		return "StudentRecord [overallScore= " + getOverallScore() + ", letterGrade= " + getLetterGrade() + "]";
	}

	public boolean equals(StudentRecord other) {
		return (this.getLetterGrade() == other.getLetterGrade());
	}

	public static void main(String[] args) {
		StudentRecord ramein = new StudentRecord();
		ramein.setQuiz1(8);
		ramein.setQuiz2(9);
		ramein.setQuiz3(8.5);
		ramein.setMidterm(77.5);
		ramein.setFinalExam(73.4);
		System.out.println(ramein.toString());
		StudentRecord kamron = new StudentRecord();
		kamron.setQuiz1(7);
		kamron.setQuiz2(9);
		kamron.setQuiz3(9);
		kamron.setMidterm(83.2);
		kamron.setFinalExam(85.6);
		System.out.println(kamron.toString());
		System.out.println(ramein.equals(kamron));
	}
}
