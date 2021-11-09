package inheritance;

public class staff extends employee{
	String title = "";

public void setTitle(String title) {
	this.title = title;
}
public String getTitle() {
	return title;
}
public String toString(){
	return getClass() + "\nname: " + name + "\noffice Number: "+ officeNumber + "\nsalary: " + salary + "\ntitle: " + title;
}

}
