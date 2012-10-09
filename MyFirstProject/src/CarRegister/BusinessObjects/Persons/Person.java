package CarRegister.BusinessObjects.Persons;

import java.util.List;

import CarRegister.BusinessObjects.Cars.*;

public class Person {

	private String name;
	
	private List<Car> cars;
	
	
	public Person(String name)
	{
		this.name=name;
		this.cars=new CarsList(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
}
