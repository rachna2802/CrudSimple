package com.tm.service;

import com.tm.model.Dao.EmployeeDao;

public class EmployeeService {
private EmployeeDao empdao;

public EmployeeDao getEmpdao() {
	return empdao;
}

public void setEmpdao(EmployeeDao empdao) {
	this.empdao = empdao;
}
}
