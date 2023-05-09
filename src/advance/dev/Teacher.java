package advance.dev;

public class Teacher extends Person {
	private String maGiaoVien;
	private double heSoLuong;

	public Teacher(String name, int age, String phoneNumber, String maGiaoVien, double heSoLuong) {
		super(name, age, phoneNumber);
		this.maGiaoVien = maGiaoVien;
		this.heSoLuong = heSoLuong;
	}

	public String getMaGiaoVien() {
		return maGiaoVien;
	}

	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double tinhLuong() {

		return heSoLuong * 1000000;
	}
}
