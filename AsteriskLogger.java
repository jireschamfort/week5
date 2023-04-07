package WEEK5_Coding_Assignment;

public class AsteriskLogger implements Logger {

	public AsteriskLogger () {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("***"+message+"***");
		System.out.println();
	}

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub
		for (int i =0; i<+ message.length()+6;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("***"+message+"***");
		for (int i =0; i<+ message.length()+6;i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
