package com.quintrix.java.quintrixspring.services;

import com.quintrix.java.quintrixspring.models.Car;
import com.quintrix.java.quintrixspring.models.GetCarsRespose;

public interface CarsService {

	Car getCarDetailsById(Long id);

	GetCarsRespose getCars(String make);

	Car addCar(Car car);

}
