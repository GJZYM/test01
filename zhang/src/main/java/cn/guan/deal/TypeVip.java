package cn.guan.deal;

import cn.guan.control.Type;

public class TypeVip extends Type {
	
	private String suspect;
	private String called;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuspect() {
		return suspect;
	}

	public void setSuspect(String suspect) {
		this.suspect = suspect;
	}

	public String getCalled() {
		return called;
	}

	public void setCalled(String called) {
		this.called = called;
	}

	public String printout() {
		return message+suspect+called;
	}

}
