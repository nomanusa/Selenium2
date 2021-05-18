package noman;

public class ExceptionHandleDemo {

	public static void main(String[] args) throws Exception {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Exception handled");
			e.printStackTrace();
		}
			Thread.sleep(2000);
			System.out.println("Exception Handled Done");
	}

}
