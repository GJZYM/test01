package cn.guan.deal;

import cn.guan.control.Type;

public class TypeTravel extends Type {
	
	private String called;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCalled() {
		return called;
	}

	public void setCalled(String called) {
		this.called = called;
	}

	public String printout() {
		return message+called;
	}

}
