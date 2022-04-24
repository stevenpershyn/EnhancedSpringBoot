package com.quintrix.java.quintrixspring.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.java.quintrixspring.models.Car;
import com.quintrix.java.quintrixspring.models.ClientCar;
import com.quintrix.java.quintrixspring.models.GetCarsRespose;
import com.quintrix.java.quintrixspring.repository.CarRepository;

@Service
public class CarsServiceImpl implements CarsService {

	@Autowired
	CarRepository carRepository;
	
	List<Car> carsList = new ArrayList<>(Arrays.asList(new Car(1L, "Ford", "SUV", 2011),
			new Car(2L, "Honda", "SUV", 2005), new Car(2L, "Honda", "Sedan", 2012), 
			new Car(3L, "Volvo", "Truck", 2015)));

	@Override
	public GetCarsRespose getCars(String make) {
		GetCarsRespose getCarsRespose = new GetCarsRespose();
		if (make != null) {
			getCarsRespose.setAvailableCarsList(carsList.stream().filter(c -> c.getMake().equals(make))
					.map(c -> new ClientCar(c.getMake(), c.getModel(), c.getYear()))
					.collect(Collectors.toList()));
		} 
		//else {
		//	getCarsRespose.setAvailableCarsList(null);
		//}
		getCarsRespose.setAvailableWarranty("2 Years Warranty");
		return getCarsRespose;
	}
	
	@Override
	public Car getCarDetailsById(Long id) {
		//Optional<Car> car = 
	    //		carsList.stream().filter(c -> c.getId().longValue() == id.longValue()).findAny();
		
		Optional<Car> car = carRepository.findById(1L);
		
	    if (car.isPresent()) {
	    	return car.get();
	    } else {
	    	return new Car();
	    }
	}
	
	@Override
	public Car addCar(Car car) {
		//carsList.add(car);
		
		Car createdCar = carRepository.save(car);
    	
    	return createdCar;	
	}
}