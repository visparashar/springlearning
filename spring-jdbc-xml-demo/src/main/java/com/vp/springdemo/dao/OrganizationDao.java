package com.vp.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vp.springdemo.domain.Organization;

public interface OrganizationDao {
	
	
	
	public void setDataSource(DataSource ds);
	
//	method to get all the organization
	public List<Organization> getAllOrganization();
	
	
	public boolean createOrganization(Organization org);
	
	public int updateOrganization();
	
	public boolean deleteOrganication(int id);
	
	

}
