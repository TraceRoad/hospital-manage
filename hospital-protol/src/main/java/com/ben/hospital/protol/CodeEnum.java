package com.ben.hospital.protol;

public enum CodeEnum {

	FAIL(0, "SHIBAI");
	
	
	
	private CodeEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	private Integer code;
	private String message;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	 public static String getValue(int key) {  
		 CodeEnum[] enums = CodeEnum.values();  
	        for (int i = 0; i < enums.length; i++) {  
	            if (enums[i].getCode() == key) {  
	                return enums[i].getMessage();  
	            }  
	        }  
	        return "";  
	    }  
}
