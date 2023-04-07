package WEEK5_Coding_Assignment;

public class SpacedLogger implements Logger{

	public SpacedLogger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		for (int i=0; i<message.length();i++) {
			System.out.print(message.charAt(i)   +" ");
		}
		System.out.println();
		
	}

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub
		System.out.print("ERROR:");
		for (int i=0; i<message.length();i++) {
			System.out.print(message.charAt(i)   +" ");
		}
		System.out.println();
	}

}
