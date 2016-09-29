package com.panda.action;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

/*
* @author MrC
* @date 2016��9��26������8:41:34
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class FileAction extends ActionSupport {
	private File[] photo;//�ļ���
	private String[] photoFileName;//�������ύ�ļ���+FileName
	private String[] photoContentType;//�������ύ�ļ���+ContentType
	
	public File[] getPhoto() {
		return photo;
	}

	public void setPhoto(File[] photo) {
		this.photo = photo;
	}

	public String[] getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String[] photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String[] getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String[] photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String DealFile() throws Exception {
		//ѭ�������ļ�
		for (int i = 0 ; i < photo.length ; i++) {
			File target = new File("D:\\java",
					photoFileName[i]);
			FileUtils.copyFile(photo[i], target);
		}
		
		return SUCCESS;
	}
}

