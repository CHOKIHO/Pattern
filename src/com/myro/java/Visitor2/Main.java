package com.myro.java.Visitor2;

public class Main {
	
    static public void main(String[] args){
        Car car = new Car();
        car.accept(new CarElementPrintVisitor()); //알고리즘 적용
        car.accept(new CarElementDoVisitor());  ////알고리즘 적용
    }

}
