package com.hhf.common.exception;

public class TechException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -653586815223207558L;

	public TechException() {
		super();
	}

	public TechException(Throwable e) {
		super(e);
	}

	public TechException(String msg) {
		super(msg);
	}

	public TechException(String msg, Throwable e) {
		super(msg, e);
	}
}
