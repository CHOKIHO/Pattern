package com.myro.java.Visitor2;

public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}

class CarElementPrintVisitor implements CarElementVisitor {
    public void visit(Wheel wheel) {      
        System.out.println("Visiting "+ wheel.getName() + " wheel");
    }
 
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }
 
    public void visit(Body body) {
        System.out.println("Visiting body");
    }
 
    public void visit(Car car) {      
        System.out.println("Visiting car");
    }
}

class CarElementDoVisitor implements CarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("Kicking my "+ wheel.getName() + " wheel");
    }
 
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }
 
    public void visit(Body body) {
        System.out.println("Moving my body");
    }
 
    public void visit(Car car) {
        System.out.println("Starting my car");
    }
}
