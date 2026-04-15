package ch17_stream;

public class IStudent implements Comparable<IStudent> {
	private String name;
	private int score;
	
	public IStudent(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }

	@Override
	public int compareTo(IStudent o) {
		return Integer.compare(score, o.score);
	}
}
