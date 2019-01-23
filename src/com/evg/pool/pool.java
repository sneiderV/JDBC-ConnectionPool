package com.evg.pool;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class pool {
private static BasicDataSource ds = null; 

	public pool() {
		if (ds == null) {
			ds = new BasicDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUsername("root");
			ds.setPassword("sneider0418");
			ds.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC");
			//se define el tamaño del pool de conexiones
			ds.setInitialSize(50);
			ds.setMaxIdle(10);
			ds.setMaxTotal(20);
			ds.setMaxWaitMillis(5000);
		}
	}

}
