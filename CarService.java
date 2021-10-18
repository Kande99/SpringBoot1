package com.saraya.firstEasySpringBootProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //-> stereotype annotation and there are 4 : Controller, Repository, Service and Component
public class CarService {

	private static ArrayList<Car> cars=new ArrayList<Car>();
	private static int count=10;
	
	static {
		cars.add(new Car(1,2019,"Tesla","Y","https://images.unsplash.com/photo-1600661288038-cb63953bfc9f?ixid=MnwxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8OHw0NTA3NzQ1fHxlbnwwfHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60"));
		cars.add(new Car(2,2017,"Tesla","P100D","https://images.unsplash.com/photo-1491921125492-f0b9c835b699?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=334&q=80"));
		cars.add(new Car(3,2021,"Range Rover","Velar","https://images.unsplash.com/photo-1613503431711-80e7b2c3f2cf?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80"));
		cars.add(new Car(4,2021,"Hyundai","Elantra","https://images.unsplash.com/photo-1625294047434-c42778d16375?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=80"));
		cars.add(new Car(5,2021,"Porsche","911 Turbo S","https://images.unsplash.com/photo-1611651338412-8403fa6e3599?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=751&q=80"));
		cars.add(new Car(6,2020,"Porsche","Panamera Turbo","https://images.unsplash.com/photo-1503376780353-7e6692767b70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1500&q=80"));
		cars.add(new Car(7,2020,"BMW","M4","https://images.unsplash.com/photo-1580273916550-e323be2ae537?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=80"));
		cars.add(new Car(8,2020,"BMW","M135i","https://images.unsplash.com/photo-1595583176635-e71b51b9c243?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1534&q=80"));
		cars.add(new Car(9,2020,"Ford Mustang","Mach-E electric","https://images.unsplash.com/photo-1610286304581-c185b49486ec?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=751&q=80"));
		cars.add(new Car(10,2020,"Audi","A7","https://images.unsplash.com/photo-1612997951749-ae9c3fffaef3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1534&q=80"));
	}
	
	public List<Car> getAllCars(){
		return cars;
	}
	public void addCar(int year, String make, String model,String image) {
		cars.add(new Car(++count,year,make,model,image));
	}
	public void deleteCar(int id) {
		Iterator<Car> iterate=cars.iterator();
		while(iterate.hasNext()) {
			Car car=iterate.next();
			if(car.getId()==id) {
				iterate.remove();
	}
	
}
}
	public Car findById(int id) {
	for(Car c:cars) {
		if(c.getId()==id) {
			return c;
		}
	}
	return null;
}
	public void updateByCar(Car c) {
		cars.remove(c);
		cars.add(c);
	}
}