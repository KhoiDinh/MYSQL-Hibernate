package cs157B_hibernate;

import java.sql.*;

public class demo {

	public static void main(String[] args) {
		//make connection 
		Connection conn = MakeConnection.getconnection();
		
		//create table sales
		createTable.create(conn);
		
		
		/*
		 * Create a Java object (â€œsales transactionâ€� record/object 
		 * -including <Date, ProductName, Quantity, UnitCost, TotalCost>) 
		 * with a method to save() the sales transaction record object in 
		 * the RDBMS â€œSalesâ€� Table through Hibernate. 
		 * For simplicity assume date is your primary key.
		 * DONE!!!!!!!!!!!!!!
		 */
		
		Insert.insertData();
		
		
		/*
		 * Store in the â€œSalesâ€� table multiple instances of the 
		 * â€œsales transactionâ€� objects where each â€œsales transactionâ€� 
		 * object representing a different â€œsale transaction.â€�
		 */
		
		
		/*
		 * Create another Java object with a method to query the â€œSalesâ€� 
		 * RDBMS table including:
		 * i. Retrieve a single â€œsales transactionâ€� as a Java object and 
		 * print the transaction attributes from the Java object.
		 * ii. Retrieve sales transactions for a given product over given 
		 * time interval.
		 * iii. Perform aggregate operation on the sales transaction objects, e.g., how much sales of a given product item in the last month?
		 */
		
		Queries.queries();
	}

}
