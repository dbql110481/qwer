package com.sds.frame;

public class SQL {
	public static String insertCustomer = "INSERT INTO CUSTOMER VALUES (?,?,?)";
	public static String getCustomer = "SELECT * FROM CUSTOMER WHERE ID = ?";
	public static String getCustomerItem = "SELECT * FROM CUSTOMERITEM WHERE ID = ?";
	public static String insertItem = "INSERT INTO CUSTOMERITEM VALUES (?,?,?)";
	public static String selectALL = 
			"SELECT c.ID, c.PWD, c.NAME, ci.NAME AS ITEMNAME, ci.PRICE FROM CUSTOMER c,\r\n" + 
			"CUSTOMERITEM ci\r\n" + 
			"WHERE c.ID = ci.ID";
	
}