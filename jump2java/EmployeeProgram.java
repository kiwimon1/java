package j2j;

class Employee{
	String name;
	
	Employee (String n){
		name = n;
	}
	void info(){
		System.out.println("이름: " + name);
	}
	void work() {
		System.out.println("업무를 수행한다.");
	}
}
class Manager extends Employee{
	String department;
		
	Manager (String n, String d){
		super(n);
		department =d;
	}
	void work() {
		System.out.println("팀을 관리한다.");
	}
	void info() {
		super.info();
		System.out.println("부서: " + department);
	}
}
public class EmployeeProgram {

	public static void main(String[] args) {
		Employee emp1 = new Employee("스마트");
		Manager emp2 = new Manager("축구", "개발부");
		
		emp1.info();
		System.out.println("===========");
		emp2.info();
		System.out.println("===========");
		
		emp1.work();
		System.out.println("===========");
		emp2.work();
		System.out.println("===========");


	}

}
