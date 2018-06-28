package com.agricult.app.exception;

public class SequenceException extends RuntimeException {

	private String errorCode;
	
	private String errorMsg;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public SequenceException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
	
}
