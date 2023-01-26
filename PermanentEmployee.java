package day4asn2;

public class PermanentEmployee extends Employee {
	private double basicPay,hra;
	private float experience;
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra,float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public void calculateMonthlySalary() {
		double varComp=0;
		if(experience>=3 && experience<5)
			varComp=(5*basicPay)/100.0;
		else if(experience>=5 && experience<10)
			varComp=(7*basicPay)/100.0;
		else if(experience>=10)
			varComp=(12*basicPay)/100.0;
		
		double sal=basicPay+hra+varComp;
		sal=(Math.round(sal)*100.0)/100.0;
		setSalary(sal);	
	}
}
