package reference.quiz;

	//부서(Department)을 정의하는 클래스를 만드세요.
	//속성: 부서장, 수석연구원, 책임연구원
	//
	//직원(Employee)을 정의하는 클래스를 만드세요.
	//속성: 이름, 나이, 월급, 근속년수
	//
	//부서 객체를 생성하고, 부서원들을 추가하세요.

public class Quiz2 {

	public static void main(String[] args) {
		// 직원 생성		
		Employee employee1 = new Employee("용철", 45, 450, "10년");
		Employee employee2 = new Employee("철구", 35, 350, "8년");
		Employee employee3 = new Employee("지연", 25, 280, "3년");
		
//		부서생성하고 부서원
		Department department = new Department(employee1, employee2, employee3);
	}

}
// 직원 클래스
class Employee{
	String employeeName;
	int employeeAge;
	int salary;
	String yearsService; //근속연수
	
	public Employee(String employeeName, int employeeAge, int salary, String yearsService) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.salary = salary;
		this.yearsService = yearsService;
	}
}

// 부서 클래스
class Department{
	Employee departmentHead;
	Employee chiefResearcher;
	Employee seniorResearcher;
	
	public Department(Employee departmentHead, Employee chiefResearcher, Employee seniorResearcher) {
		super();
		this.departmentHead = departmentHead;
		this.chiefResearcher = chiefResearcher;
		this.seniorResearcher = seniorResearcher;
	}
}
