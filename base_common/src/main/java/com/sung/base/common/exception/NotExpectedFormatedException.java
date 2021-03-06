package com.sung.base.common.exception;

/**
 * @author 银时：yinshi.nc / yinshi.nc@taobao.com
 * @Date Jan 4, 2012
 */
public class NotExpectedFormatedException extends BaseException{
	private static final long serialVersionUID = 9129117998948166073L;

	public NotExpectedFormatedException() {
		super();
	}

	public NotExpectedFormatedException(String message) {
		super( message );
	}

	public NotExpectedFormatedException(String message, Throwable cause) {
		super( message, cause );
	}
}
