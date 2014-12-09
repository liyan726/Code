package com.code.Model;

import org.springframework.stereotype.Service;

@Service
public class Mes {

	private String mes_name;

	public String getMes_name() {
		return mes_name;
	}

	public void setMes_name(String mes_name) {
		this.mes_name = mes_name;
	}
	
}
