package com.myro.java.Observer2;

import com.myro.java.Observer2.Button.OnClickListener;

public class Main {
	
	public static void main(String[] args) {
		
		Button button = new Button();
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(Button button) {
				System.out.println(button + " is clicked");
				
			}
		});
		
		button.onClick();
		
	}

}


//class ButtonClick implements OnClickListener {
//
//	@Override
//	public void onClick(Button button) {
//		System.out.println(button + " is clicked!");
//		
//	}
//	
//}