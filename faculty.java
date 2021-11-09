package inheritance;

public class faculty extends employee{
	String rank = "";

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}
public String toString(){
	return getClass() + "\nname: " + name + "\noffice Number: "+ officeNumber + "\nsalary: " + salary + "\nrank: " + rank;
}
}
