package in.student.test;

import java.util.Scanner;

import in.student.dao.StudentDao;
import in.student.dao.StudentDaoIMPL;
import in.student.pojo.Student;

public class StudentControl {

	public static void main(String[] args) {

		int studentId;
		String studentName;
		int studentStandard;
		char studentGrade;
		int studentRoll;
		long studentContact;
		boolean studentFee;
		Student student;
		StudentDao studentDao = new StudentDaoIMPL();
		boolean result;

		System.out.println("=========================================================");
		System.out.println("====================== WELCOME TO =======================");
		System.out.println("=============== STUDENT MANAGEMENT SYSTEM ===============");
		System.out.println("=========================================================");

		System.out.println("    1) Show All Studnet                                  ");
		System.out.println("    2) Search Student Studnet                            ");
		System.out.println("    3) Add Studnet                                       ");
		System.out.println("    4) Update Studnet                                    ");
		System.out.println("    5) Delete Studnet                                    ");
		System.out.println("    6) Exit                                              ");
		System.out.print("    Please Enter Your Choice : ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 3:
			System.out.println("=========================================================");
			System.out.println("===================== ADD STUDENT =======================");
			System.out.println("=========================================================");
			System.out.print("   Enter Student Name        : ");
			studentName = scan.nextLine();
			studentName = scan.nextLine();
			System.out.print("   Enter Student Standard    : ");
			studentStandard = scan.nextInt();
			System.out.print("   Enter Student Grade       : ");
			studentGrade = scan.next().charAt(0);
			System.out.print("   Enter Student Roll Number : ");
			studentRoll = scan.nextInt();
			System.out.print("   Enter Student Contact     : ");
			studentContact = scan.nextLong();
			while (true) {
				System.out.print("   Enter Student Fee Clear (YES OR NO) : ");
				String feeString = scan.next();
				if (feeString == "yes" || feeString == "YES" || feeString == "Yes") {
					studentFee = true;
					break;
				} else if (feeString == "no" || feeString == "No" || feeString == "NO") {
					studentFee = false;
					break;
				} else {
					System.out.println("   ERROR : Please Answer in YES or NO !!!!");
				}
			}

			student = new Student(studentName, studentStandard, studentGrade, studentRoll, studentContact, studentFee);
			result = studentDao.AddStudent(student);

			break;
		}

	}

}
