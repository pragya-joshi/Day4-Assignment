package day4asn2;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractEmployee emp1=new ContractEmployee(1001,"James",500,7);
		emp1.calculateSalary();
		System.out.println("Contract Employee Details : ");
		System.out.println(emp1.getEmployeeId()+" "+emp1.getEmployeeName()+" "+emp1.getSalary());
		
		PermanentEmployee emp2=new PermanentEmployee(2001,"Lily",1850,115,3.5f);
		emp2.calculateMonthlySalary();
		System.out.println("Permanent Employee Details : ");
		System.out.println(emp2.getEmployeeId()+" "+emp2.getEmployeeName()+" "+emp2.getSalary());
	}

}
