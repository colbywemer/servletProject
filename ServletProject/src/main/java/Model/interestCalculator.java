package Model;

import java.text.NumberFormat;

public class interestCalculator {
	private double investment;
	private double rate;
	private double years;
	private String answer;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public interestCalculator() {
		super();
	}
	
	public interestCalculator(double investment, double rate, double years) {
		super();
		this.investment = investment;
		this.rate = rate;
		this.years = years;
		calculateInterest(investment, rate, years);
	}
	
	public double getInvestment() {
		return investment;
	}
	public String getFormattedInvestment() {
		return formatter.format(investment);
	}
	public void setInvestment(double investment) {
		this.investment = investment;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void calculateInterest(double investment, double rate, double years) {
		rate = rate/100;
		double answer = investment*(1 + rate * years);
		setAnswer(formatter.format(answer));
	}
}
