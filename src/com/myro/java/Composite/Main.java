package com.myro.java.Composite;

public class Main {
	public static void main(String[] args) {

		Folder 
			root = new Folder("root"), 
			A = new Folder("A"), 
			B = new Folder("B"),  
			C = new Folder("C"), 
			D = new Folder("D");
		
		File 
			a = new File("aa"), 
			b = new File("bb"), 
			c = new File("cc"), 
			d = new File("dd");
		
		root.addComponent(A);
			A.addComponent(B);
				B.addComponent(a);
				B.addComponent(b);
		root.addComponent(C);
				C.addComponent(D);
					D.addComponent(c);
					D.addComponent(d);
					
		

	}
}
