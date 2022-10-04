package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Operaciones;
import com.example.demo.DaoImpl.OrdenDaoImpl;
import com.example.demo.Entity.Ordenes;

@Service
public class OrdenService implements Operaciones<Ordenes>{
	@Autowired
     private OrdenDaoImpl DaoImpl;

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
		return DaoImpl.readAll2();
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
