/**
 * 
 */
package com.virtusa.bean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

/**
 * @author Damodar Reddy11:03:18 AMApr 22, 2020
 * EmployeeDao.java
 */
public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	NamedParameterJdbcTemplate template;  
	  
	public EmployeeDao(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}  
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e)
	{
		String query ="insert into employee values('"+e.getId()+"','"+
				e.getName()+"','"+e.getSalary()+"')";  
		return jdbcTemplate.update(query);
	}
	public Boolean saveEmployeeByPreparedStatement(final Employee e){  
		String query="insert into employee values(?,?,?)";  
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
			public Boolean doInPreparedStatement(PreparedStatement ps)  
					throws SQLException, DataAccessException {  

				ps.setInt(1,e.getId());  
				ps.setString(2,e.getName());  
				ps.setFloat(3,e.getSalary());  
				return ps.execute();  
			}  
		});  
	}
	//Using Result SetExtractor
	public List<Employee> getAllEmployees()
	{
		return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>()
		{

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				while(rs.next()){  
					Employee e=new Employee();  
					e.setId(rs.getInt(1));  
					e.setName(rs.getString(2));  
					e.setSalary(rs.getInt(3));  
					list.add(e);  
				}  
				return list;


			}

		});
	}
	public List<Employee> getEmployeesRowMapper()
	{
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>()
		{

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));  
				e.setSalary(rs.getInt(3));  
				return e;

			}

		});
	}
	public  int saveByNamedParameter(Employee e){  
		String query="insert into employee values (:id,:name,:salary)";  
		  
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("id",e.getId());  
		map.put("name",e.getName());  
		map.put("salary",e.getSalary());  
		  
		int i=(Integer) template.execute(query,map,new PreparedStatementCallback<Object>() {  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		       return ps.executeUpdate();  
		    }  
		});
		return i;
	}
	public int[] batchUpdate(final List<Employee> employees) {
		 int[] updateCounts = jdbcTemplate.batchUpdate("update employee set name = ?  where id = ?",
		 new BatchPreparedStatementSetter() {
		 public void setValues(PreparedStatement ps, int i) throws SQLException {
		 ps.setString(1, employees.get(i).getName());
		 ps.setFloat(2, employees.get(i).getId());
		 }

		 public int getBatchSize() {
			 return employees.size();
			 }
		
		 });
		 return updateCounts;
		 }

}
