package com.code.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.code.Model.Photo;

public class FileUploadUtils {

	/**
	 * 文件上传返回一个FilesInfo对象
	 * 
	 * @param cfile文件对象
	 * @param path
	 *            上传路径
	 * @param request
	 * @return
	 */
	public static Photo fileupload(MultipartFile cfile, String path,
			HttpServletRequest request) {
		Photo ph = new Photo();
		try {
			byte[] bfile = cfile.getBytes();
			String fileName = "";
			// 获得当前时间的最小精度
			SimpleDateFormat saveTime = new SimpleDateFormat(
					"yyyy-MM-dd-HH:mm:ss");
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			fileName = format.format(new Date());
			// 获得三位随机数
			Random random = new Random();
			for (int i = 0; i < 3; i++) {
				fileName = fileName + random.nextInt(9);
			}
			// 获得原始文件名
			String origFileName = cfile.getOriginalFilename();
			// XXX.jpg
			String suffix = origFileName.substring(origFileName
					.lastIndexOf("."));
			// 拿到项目的部署路径 path,使用MultipartFile的文件写入
			cfile.transferTo(new File(path + fileName + suffix));
			// 上传文件信息封装

			String url = path + fileName + suffix;
			ph.setUrl(url);
			ph.setMark(fileName);
			System.out.println("上传成功:" + path + ".." + fileName + suffix);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ph;
	}
}
