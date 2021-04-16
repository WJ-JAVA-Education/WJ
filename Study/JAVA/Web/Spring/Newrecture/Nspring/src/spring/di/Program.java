package spring.di;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		 * Exam exam = new NewlecExam(); ExamConsole console = new GridExamConsole();
		 * 
		 * console.setExam(exam);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");

		 ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

//		List<Exam> exams = (List<Exam>) context.getBean("exams");
		// exams.add(new NewlecExam(1, 1, 1, 1));

//		for (Exam e : exams) {
//			System.out.println(e);
//		}

	}

}
