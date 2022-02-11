package Model;

public class Calculator {
	private double value1;
	private double value2;
	private String answer;
	
	public Calculator() {
		super();
	}
	
	public Calculator(double value1, double value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		calculateDivision(value1, value2);
	}

	public double getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public double getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void calculateDivision(double value1, double value2) {
		if(value1 != 0 && value2!=0) {
			setAnswer(Double.toString(value1 / value2));
		}
		else {
			setAnswer("NaN");
		}
		
	}
}
