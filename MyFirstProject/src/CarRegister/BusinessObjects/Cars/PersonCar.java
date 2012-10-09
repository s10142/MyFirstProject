package CarRegister.BusinessObjects.Cars;

public class PersonCar extends Car 
{

	//pola statycznych
	
	//pola prywatne
	private String mark;
	private String regNumber;
	
	//pola publiczne X
	
	//konstruktory
	public PersonCar(String mark, String regNumber)
	{
		this.mark = mark;
		this.regNumber = regNumber;
	}
	
	public PersonCar()
	{
		this("","");
	}

	
	//właściwości
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	//metody
	
	public void printData()
	{
		System.out.println(mark+" "+regNumber);
	}
	
}
