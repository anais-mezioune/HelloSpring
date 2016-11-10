package com.m2i.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EleveJDBCTemplate implements ElevesDAO{

	private DataSource ds;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds){
		this.ds = ds;
		this.jdbcTemplate = new JdbcTemplate(ds);
	}
	
	
	public void create(String nom, Integer age){
		String sql = "insert into eleve(age, nom) values (?, ?)";
		jdbcTemplate.update(sql, age, nom);
		System.out.println("Création");
	}
	
	public Eleve getEleve(Integer id){
		String sql = "select * from eleve where id = ?";
		Eleve eleve = (Eleve)jdbcTemplate.queryForObject(sql, new Object[]{id}, new EleveMapper());
		return eleve;
	}
	
	public List<Eleve>listEleves(){
		String sql = "select * from eleve";
		List<Eleve> eleves = (List<Eleve>)jdbcTemplate.query(sql, new EleveMapper());
		return eleves;
	}
	
	public void delete(Integer id){
		String sql = "delete from elevewhere id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("Suppression");
	}
	
	public void update(Integer id, Integer age){
		String sql = "update eleve set age = ? where id = ?";
		jdbcTemplate.update(sql, age, id);
		System.out.println("Mise à jour");
	}
}
