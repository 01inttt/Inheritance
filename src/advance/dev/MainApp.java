package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[10];
		input(persons);
		print(persons);
		Teacher highestPaidTeacher = findTeacher(persons);
		System.out.println("Highest paid teacher:");
		System.out.println(highestPaidTeacher);
		Student highestGPAStudent = findStudent(persons);
		System.out.println("Student with highest GPA:");
		System.out.println(highestGPAStudent);
	}

	private static Student findStudent(Person[] persons) {
		// TODO Auto-generated method stub
		Student highestGPAStudent = (Student) persons[4];
		for (int i = 5; i < 10; i++) {
			Student student = (Student) persons[i];
			if (student.diemTrungBinh() > highestGPAStudent.diemTrungBinh()) {
				highestGPAStudent = student;
			}
		}
		return highestGPAStudent;
	}

	private static Teacher findTeacher(Person[] persons) {
		// TODO Auto-generated method stub
		Teacher highestPaidTeacher = (Teacher) persons[0];
		for (int i = 1; i < 4; i++) {
			Teacher teacher = (Teacher) persons[i];
			if (teacher.tinhLuong() > highestPaidTeacher.tinhLuong()) {
				highestPaidTeacher = teacher;
			}
		}
		return highestPaidTeacher;
	}

	private static void print(Person[] persons) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(persons[i]);
		}
	}

	private static void input(Person[] persons) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println("Nhập thông tin của giáo viên #" + (i + 1));
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Mã giáo viên: ");
			String teacherId = scanner.nextLine();
			System.out.print("Hệ số lương: ");
			double salaryCoefficient = scanner.nextDouble();
			scanner.nextLine();

			Teacher teacher = new Teacher(name, age, phoneNumber, teacherId, salaryCoefficient);
			persons[i] = teacher;
		}

		for (int i = 4; i < 10; i++) {
			System.out.println("Nhập thông tin của học sinh #" + (i - 3));
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Mã sinh viên: ");
			String studentId = scanner.nextLine();
			System.out.print("Lớp: ");
			String className = scanner.nextLine();
			System.out.print("Điểm Toán: ");
			double mathScore = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Điểm Lý: ");
			double physicsScore = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Điểm Hóa: ");
			double chemistryScore = scanner.nextDouble();
			scanner.nextLine();

			Student student = new Student(name, age, phoneNumber, studentId, className, mathScore, physicsScore, chemistryScore);
			persons[i] = student;
		}

	}

}
