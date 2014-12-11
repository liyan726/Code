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
	 * �ļ��ϴ�����һ��FilesInfo����
	 * 
	 * @param cfile�ļ�����
	 * @param path
	 *            �ϴ�·��
	 * @param request
	 * @return
	 */
	public static Photo fileupload(MultipartFile cfile, String path,
			HttpServletRequest request) {
		Photo ph = new Photo();
		try {
			byte[] bfile = cfile.getBytes();
			String fileName = "";
			// ��õ�ǰʱ�����С����
			SimpleDateFormat saveTime = new SimpleDateFormat(
					"yyyy-MM-dd-HH:mm:ss");
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			fileName = format.format(new Date());
			// �����λ�����
			Random random = new Random();
			for (int i = 0; i < 3; i++) {
				fileName = fileName + random.nextInt(9);
			}
			// ���ԭʼ�ļ���
			String origFileName = cfile.getOriginalFilename();
			// XXX.jpg
			String suffix = origFileName.substring(origFileName
					.lastIndexOf("."));
			// �õ���Ŀ�Ĳ���·�� path,ʹ��MultipartFile���ļ�д��
			cfile.transferTo(new File(path + fileName + suffix));
			// �ϴ��ļ���Ϣ��װ

			String url = path + fileName + suffix;
			ph.setUrl(url);
			ph.setMark(fileName);
			System.out.println("�ϴ��ɹ�:" + path + ".." + fileName + suffix);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ph;
	}
}
