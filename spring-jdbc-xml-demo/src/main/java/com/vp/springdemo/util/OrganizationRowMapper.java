package com.vp.springdemo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vp.springdemo.domain.Organization;

public class OrganizationRowMapper implements ResultSetExtractor<Organization> {

	public Organization extractData(ResultSet arg0) throws SQLException, DataAccessException {
		
		
	}
	
	
	
	

}
