package com.wxpay.utils;

import java.io.Serializable;

/**
 * 创建时间：2015年10月13日 下午11:10:52
 * 
 * @author andy
 * @version 2.2
 */

public class JsonResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5285923032395587357L;
	private Integer code;
	private String msg;
	private ResponseData response;

	public JsonResult() {
		super();
	}

	public JsonResult(Integer code, String msg, ResponseData response) {
		super();
		this.code = code;
		this.msg = msg;
		this.response = response;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ResponseData getResponse() {
		return response;
	}

	public void setResponse(ResponseData response) {
		this.response = response;
	}

}
