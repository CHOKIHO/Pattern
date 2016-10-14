package com.myro.java.Composite;

public class File extends Component {
	
	public File(String name) {
		super(name);
	}
	
	public Object data;
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}

}
