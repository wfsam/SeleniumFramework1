package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void demo() throws Exception {
//		try {
			System.out.println("Test started");
			int i = 1/0;		
			System.out.println("Completed");
			
//		} catch (Exception exp) {
//			System.out.println("\n->Inside catch block");
//			System.out.println("\n->Message is " + exp.getMessage());
//			System.out.println("\n->Cause is " + exp.getCause());
//			exp.printStackTrace();
//		}
//		
//		finally {
//			System.out.println("\n I am inside finally block \n");
//		}
	}

	}
