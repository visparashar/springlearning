package com.vp.springdemo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vp.springdemo.dao.OrganizationDao;
import com.vp.springdemo.domain.Organization;

public class OrganizationDaoImpl implements OrganizationDao {

	JdbcTemplate jdbcTemplate  =null;
	public void setDataSource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	public List<Organization> getAllOrganization() {
		// TODO Auto-generated method stub
		String querystr ="select * from Organization";
		return jdbcTemplate.queryForList(querystr);
	}

	public boolean createOrganization(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public int updateOrganization() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteOrganication(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
