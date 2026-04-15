package ch17_stream;

public class MStudent {
	private String name;
	private String sex;
	private int score;
	
	public MStudent(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}	

	public String getName() { return name; }
	public String getSex() { return sex; }
	public int getScore() {	return score; }
}
