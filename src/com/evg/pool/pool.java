package com.evg.pool;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class pool {
	
	private static BasicDataSource ds = null;
	
	public static DataSource getDataSource() {
		if (ds == null) {
			ds = new BasicDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUsername("root");
			ds.setPassword("sneider0418");
			ds.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&verifyServerCertificate=false&serverTimezone=UTC");
			//?useSSL=false&
			//se define el tamaño del pool de conexiones
			ds.setInitialSize(50);
			ds.setMaxIdle(10);
			ds.setMaxTotal(20);
			ds.setMaxWaitMillis(5000);
		}
		return (DataSource) ds;
	}
	
	public static Connection getConexion() throws SQLException {
		
		return getDataSource().getConnection();
	}

}
