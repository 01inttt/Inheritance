package advance.dev;

public class Student extends Person {
	private double mathScore;
	private double physicsScore;
	private double chemistryScore;
	private String studentID;
	private String className;

	public Student(String name, int age, String phoneNumber, String studentId2, String className, double mathScore,
			double physicsScore, double chemistryScore) {
		// TODO Auto-generated constructor stub
		super(name, age, phoneNumber);
		this.mathScore = mathScore;
		this.physicsScore = physicsScore;
		this.chemistryScore = chemistryScore;
		this.studentID = studentID;
		this.className = className;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getPhysicsScore() {
		return physicsScore;
	}

	public void setPhysicsScore(double physicsScore) {
		this.physicsScore = physicsScore;
	}

	public double getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(double chemistryScore) {
		this.chemistryScore = chemistryScore;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double diemTrungBinh() {
		return (mathScore + physicsScore + chemistryScore) / 3;
	}
}
