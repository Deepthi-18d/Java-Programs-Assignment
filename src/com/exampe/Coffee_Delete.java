//Read all the existing records from the table coffee which is from the database test and delete an
//existing coffee product from the table with its id.
package com.exampe;
import java.sql.*;
import java.util.Properties;

public class Coffee_Delete
{
public static void main(String[] args)
{
try
{
Connection dbConnection = null;

String url = "jdbc:mysql://localhost/test";
Properties info = new Properties();
info.put("user", "root");
info.put("password", "Dhhh@63788182");

dbConnection = DriverManager.getConnection(url, info);

if (dbConnection != null)
{
System.out.println("Successfully connected to MySQL database test");
}

// SQL SELECT query
String query = "SELECT * FROM coffee";

Statement st = dbConnection.createStatement();
ResultSet rs = st.executeQuery(query);

while (rs.next())
{
int id = rs.getInt("id");
String coffee_name = rs.getString("coffee_name");
int price= rs.getInt("price");

System.out.format("\n%d, %s, %d", id,coffee_name,price);
}

// Deleting records
String query3 = "delete from coffee where id=264";
PreparedStatement preparedStmt2 = dbConnection.prepareStatement(query3);

preparedStmt2.executeUpdate();   // ✅ fixed

preparedStmt2.close();           // ✅ fixed order
dbConnection.close();            // ✅ fixed order

}
catch (Exception e)
{
System.err.println("Got an exception! ");
System.err.println(e.getMessage());
}
}
}
