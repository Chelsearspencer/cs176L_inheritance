package inheritance;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			person pete = new person();
			pete.setName("Pete");
			System.out.println(pete + "\n");
	          
			student stan = new student();
	        stan.setName("Stan");
	        stan.setYear(student.SUPERSENIOR);
	        System.out.println(stan + "\n");
	          
	        employee anne = new employee();
	        anne.setName("Anne");
	        anne.setOfficeNumber("E153");
	        anne.setSalary(50000);
	        System.out.println(anne + "\n");
	          
	        faculty coddington = new faculty();
	        coddington.setName("Codd");
	        coddington.setRank("associate");
	        coddington.setOfficeNumber("BH202");
	        coddington.setSalary(70000);
	        System.out.println(coddington + "\n");
	          
	        staff starr = new staff();
	        starr.setName("Starr");
	        starr.setTitle("grounds keeper");
	        starr.setOfficeNumber("SH102");
	        starr.setSalary(40000);
	        System.out.println(starr);
	     }
	}

}
