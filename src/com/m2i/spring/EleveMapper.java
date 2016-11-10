package com.m2i.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EleveMapper implements RowMapper{

	public Eleve mapRow(ResultSet rs, int rowNum) throws SQLException{
		Eleve eleve = new Eleve();
		eleve.setId(rs.getInt("id"));
		eleve.setAge(rs.getInt("age"));
		eleve.setNom(rs.getString("nom"));
		
		return eleve;
	}
}
