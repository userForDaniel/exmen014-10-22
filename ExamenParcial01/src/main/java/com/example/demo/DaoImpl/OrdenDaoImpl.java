package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Operaciones;
import com.example.demo.Entity.Ordenes;
@Component
public class OrdenDaoImpl implements Operaciones<Ordenes>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Ordenes t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Ordenes t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ordenes read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ordenes> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select  C.Country AS pais, O.OrderID AS orden from orders O inner join customers C \r\n"
				+ "on O.CustomerID = C.CustomerID;");
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll5() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
