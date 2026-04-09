package ch07_inheritance;

public class AStudent extends APerson {

	private int schoolYear;
	private int classNo;
	private int sutdentNo;

	public AStudent() {}

	public AStudent(String name, String ssn, String tel, String addr, int age
			, int schoolYear, int classNo, int sutdentNo) {
		super(name, ssn, tel, addr, age);
		this.schoolYear = schoolYear;
		this.classNo = classNo;
		this.sutdentNo = sutdentNo;
	}

}
