package com.gl.javafsd.dsa.milkshakes;

public class Result {

	private int noOfSeconds;
	private String status;

	public Result() {
		noOfSeconds = 0;
		status = "";
	}
	
	public int getNoOfSeconds() {
		return noOfSeconds;
	}

	public void setNoOfSeconds(int noOfSeconds) {
		this.noOfSeconds = noOfSeconds;
	}

	public void incrementNoOfSeconds(int noOfSeconds) {
		
		setNoOfSeconds(
			getNoOfSeconds() + noOfSeconds);
		
		// noOfSeconds = noOfSeconds + 1
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean isDone() {
		if (status.equals("DONE")) {
			return true;
		}else {
			return false;
		}
	}
}
