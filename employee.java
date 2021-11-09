package inheritance;

	public class employee extends person{
		String officeNumber = "";
		double salary = 0;
		public String getOfficeNumber() {
			return officeNumber;
		}
public void setOfficeNumber(String officeNumber) {
	this.officeNumber = officeNumber;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString()
{
	return getClass() + "\nname: " + name + "\noffice Number: "+ officeNumber + "\nSalary: " + salary;

}}
