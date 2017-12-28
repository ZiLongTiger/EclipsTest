package com.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Car;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestMain {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);*/
		ApplicationContext context = new ClassPathXmlApplicationContext("c3p0Bean.xml");
		ComboPooledDataSource cpds = (ComboPooledDataSource) context.getBean("dataSource");
		try {
			System.out.println(cpds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Car car = (Car) context.getBean("car2");
		System.out.println(car);
	}
}
