package sampleautomation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LearnDatabaseTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/selenium";					

		//Database Username		
		String username = "root";	
        
		//Database Password		
		String password = "Meyyar2610@";				

		//Query to Execute		
		String query = "select *  from employee;";	
        
 	    //Load mysql jdbc driver		
   	   // Class.forName("com.mysql.jdbc.Driver");		
   	    Class.forName("com.mysql.cj.jdbc.Driver");
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myid = rs.getString(1);								        
                    String myname = rs.getString(2);	
                    String mydept =rs.getString(3);
                    String salary=  rs.getString(4);
                    System. out.println(myid+"  "+myname+ " "+mydept + " " +salary );		
            }		
			 // closing DB Connection	
		    rs.close();
		    stmt.close();
			con.close();			
}

	}




