package com.code.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.code.InfoService.Impl.UserInfoImpl;
import com.code.Mapper.PhotoMapper;
import com.code.Mapper.UserMapper;
import com.code.Model.Photo;
import com.code.Model.User;
import com.code.utils.FileUploadUtils;

@Controller
@RequestMapping("/info")
public class UserInfo {

	@Resource
	// ×¢Èë
	private PhotoMapper photoMapper;

	@Resource
	// ×¢Èë
	private UserMapper userMapper;
	@Resource
	private UserInfoImpl infimpl;

	@RequestMapping("/photo")
	private String UserInf(@RequestParam("attachs") MultipartFile[] attachs,
			HttpServletRequest req) {
		if (attachs.length > 0) {
			Photo fe = null;
			String realpath = req.getSession().getServletContext()
					.getRealPath("upload/pho/")
					+ "//";
			for (MultipartFile at : attachs) {
				if (at.isEmpty())
					continue;
				fe = FileUploadUtils.fileupload(at, realpath, req);
			}
			User u = (User) req.getSession().getAttribute("user");
			infimpl.SavePhoto(fe, u);
			return "/suc";
		} else
			return "/error";
	}

	@RequestMapping("/pho")
	private String UserInf2() {
		return "/user/uploadPhoto";
	}
}
