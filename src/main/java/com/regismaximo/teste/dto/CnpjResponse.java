package com.regismaximo.teste.dto;


import org.springframework.stereotype.Service;
import com.regismaximo.teste.model.CNPJ;

@Service
public class CnpjResponse {

	public CNPJ cnpjBuild(String RequestCnpj) {
		
		CNPJ cnpj = new CNPJ(RequestCnpj, "12/01/2017", "IASMIM SANTINA 10066615909",
				"ME", "IASMIM IT LTDA", "47.24-5-00 - Comércio varejista de hortifrutigranjeiros", 
				"47.55-5-03 - Comercio varejista de artigos de cama, mesa e banho", 
				"213-5 - Empresário (Individual)", "R MARIA IZAURA S. OLIVEIRA", 180, 
				"******", "84.550-000", "Vila Elter", "Rebouças", "------", "(45) 9000-0001", 
				"*****", "Ativa", "12/01/2017", "------", "********", "********");
		return cnpj;
	}
}
