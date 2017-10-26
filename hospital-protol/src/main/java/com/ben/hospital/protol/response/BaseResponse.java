package com.ben.hospital.protol.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;

import com.ben.hospital.protol.CodeEnum;

public class BaseResponse {
	private Integer code;
	private String message;
	private CodeEnum codeEnum;
	private Map<String, Object> data = new HashMap<String, Object>(16);
	
	public Integer getCode() {
		if(this.codeEnum == null) {
			return CodeEnum.FAIL.getCode();
		}
		return this.codeEnum.getCode();
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		if(this.codeEnum == null) {
			return CodeEnum.FAIL.getMessage();
		}
		return this.codeEnum.getMessage();
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	public CodeEnum getCodeEnum() {
		return codeEnum;
	}
	
	public void setCodeEnum(CodeEnum codeEnum) {
		this.codeEnum = codeEnum;
	}
	
	public void put(String key, String value) {
		this.data.put(key, value);
	}
	
	public Model push(Model model) {
		model.addAttribute("code", this.getCode());
		model.addAttribute("message", this.getMessage());
		model.addAttribute("data", this.data);
		return model;
	}
}
