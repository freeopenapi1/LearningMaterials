package kr.co.himedia.miniproject.school.view;

import java.util.ArrayList;

import kr.co.himedia.miniproject.school.School;
import kr.co.himedia.miniproject.school.Subject;

public class GenerateGradeDisplay {

	School school = School.getInstances();
	
	public static final String TITLE = "과목 학점 결과 >>> \n";
	public static final String LINE = "-------------------------------------------------------------\n";
	public static final String HEADER = "이름	 \t학번 \t필수	\t 점수 \t 학점\n";
	public static final String LINE2 = "=============================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		ArrayList<Subject> subjects = school.getSubjects();
		
		for (Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makefooter(subject);
		}
		
		return buffer.toString();
	}

	private void makefooter(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	private void makeBody(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	private void makeHeader(Subject subject) {
		buffer.append(subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE2);
	
		
	}
}
























