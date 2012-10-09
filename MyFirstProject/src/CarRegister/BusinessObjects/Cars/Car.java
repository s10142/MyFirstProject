package CarRegister.BusinessObjects.Cars;

import CarRegister.BusinessObjects.Persons.Person;

public abstract class Car implements CarInterface {

	protected Person owner;
	
	public void setOwner(Person owner)
	{
		this.owner=owner;
	}
}
