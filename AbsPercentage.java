package basics_day_01;

abstract class ParentAbsPercentage
{
	abstract void login();
	abstract void logout();
	
	static void EmpID()
	{
		System.out.println("Print 1");
	}
	static void Approved()
	{
		System.out.println("Print 2");
	}
}

public class AbsPercentage extends ParentAbsPercentage {
	
	public static void main(String[] args) {
		EmpID();
		Approved();
		AbsPercentage A8 = new AbsPercentage();
		A8.login();
		A8.logout();
		
		
	}

	@Override
	void login() {
		System.out.println("Print 3");
		
	}

	@Override
	void logout() {
		System.out.println("Print 4");
		
	}

}
