package com.myro.java.Decorate2;

/**
 * // abstract decorator class - note that it implements Window
 * @author A
 *
 */
public abstract class WindowDecorator implements Window {

	protected  Window decorateWindow;
	
	public WindowDecorator(Window decorateWindow) {
		this.decorateWindow = decorateWindow;
	}
	
	@Override
	public void draw() {
		decorateWindow.draw();
	}
}

class VerticalWindowScrollbar extends WindowDecorator {

	public VerticalWindowScrollbar(Window decorateWindow) {
		super(decorateWindow);
	}

	@Override
	public void draw() {
		decorateWindow.draw();
		drawVerticalWindowScrollbar();
		//super.draw();
	}

	private void drawVerticalWindowScrollbar() {
		// drawVerticalWindow
	}

	@Override
	public String getDescription() {
		return decorateWindow.getDescription() + " including Vertical Window Scrollbar";
	}
}

class HorizontalWindowScrollbar extends WindowDecorator {

	public HorizontalWindowScrollbar(Window decorateWindow) {
		super(decorateWindow);
	}

	@Override
	public String getDescription() {
		return decorateWindow.getDescription() + " including Horizonal Window Scrollbar";
	}

	@Override
	public void draw() {
//		super.draw();
		decorateWindow.draw();
		drawHorizontalWindowScrollbar();
	}

	private void drawHorizontalWindowScrollbar() {
		//drawHorizontalWindowScrollbar
	}
}