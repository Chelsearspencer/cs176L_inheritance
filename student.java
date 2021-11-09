package inheritance;

public class student extends person{
	public static final int FRESHMAN = 1;         
	public static final int SOPHOMORE = 2;          
	public static final int JUNIOR = 3;        
	public static final int SENIOR = 4;         
	public static final int SUPERSENIOR = 5;
	public int year;
	
public student(){
	super();	
}
public int getYear() {
	return year;
}
public void setYear(int year) {
		
	if(year>=1&& year<=5)
	{
	this.year = year;
	}
		else 
		System.out.print("invalid year");
	}
public String toString() {
	String s=super.toString();
	return s +"   "+ "\nyear:"+ this.year;

}
}
