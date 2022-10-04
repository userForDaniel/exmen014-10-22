package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Operaciones;
import com.example.demo.Entity.Productos;
@Component
public class ProductoDaoImpl implements Operaciones<Productos>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Productos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Productos t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Productos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select c.CategoryName as categoria,count(p.CategoryID) as cantidad from products p \r\n"
				+ "inner join categories c\r\n"
				+ "on  p.CategoryID =c.CategoryID\r\n"
				+ "group by p.CategoryID order by 2;");
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
