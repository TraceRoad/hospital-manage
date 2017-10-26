package com.ben.hospital.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.hospital.protol.CodeEnum;
import com.ben.hospital.protol.response.BaseResponse;

public class BaseController {
	@RequestMapping("500")
	public Model internalError(Model model) {
		return createErrorMessage(model);
	}
	@RequestMapping("404")
	public Model error(Model model) {
		return createErrorMessage(model);
	}
	public Model createMessage(BaseResponse baseResponse, Model model) {
		return baseResponse.push(model);
	}
	public Model createErrorMessage(Model model) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setCodeEnum(CodeEnum.FAIL);
		return baseResponse.push(model);
	}
	public Model createErrorMessage(String message, Model model) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setMessage(message);
		return baseResponse.push(model);
	}
}
