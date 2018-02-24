package com.github.slamdunk.javabase.designpattern.structure.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * in this class we can share connection instances
 * 
 * @author liuzhongda
 *
 */
public class ConnectionPool {
	private Vector<Connection> pool;

	/**
	 * public fields
	 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	Connection conn = null;

	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * release a connection and return it back into the pool
	 * 
	 * @param conn
	 */
	public synchronized void release(Connection conn) {
		pool.add(conn);
	}

	/**
	 * get a connection
	 * 
	 * @return
	 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}
}
