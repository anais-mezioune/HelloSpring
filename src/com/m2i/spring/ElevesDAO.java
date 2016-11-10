package com.m2i.spring;

import java.util.List;
import javax.sql.DataSource;

public interface ElevesDAO {

	public void setDataSource(DataSource ds);
	public void create(String name, Integer age);
	public Eleve getEleve(Integer id);
	public List<Eleve>listEleves();
	public void delete(Integer id);
	public void update(Integer id, Integer age);
}

