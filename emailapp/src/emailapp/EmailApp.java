package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		
		Email em1 = new Email("Nishi","Singh");
		em1.setAlternateEmail("nis1234");
		System.out.println(em1.getPassword());
		
		em1.showInfo();
		

	}

}


