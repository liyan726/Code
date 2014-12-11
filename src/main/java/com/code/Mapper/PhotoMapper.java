package com.code.Mapper;

import com.code.Model.Photo;

public interface PhotoMapper {
	void SavePhoto(Photo ph);
	
	Photo find(String mark);
}
