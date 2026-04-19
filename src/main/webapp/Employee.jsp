<%@ page import="java.sql.*" %>

<%

String empno = request.getParameter("empno");

String empname = request.getParameter("empname");

String basicsalary = request.getParameter("basicsalary");



Connection con = null;

PreparedStatement ps = null;

Statement st = null;

ResultSet rs = null;



int grandTotal = 0;



try {

    Class.forName("com.mysql.cj.jdbc.Driver");

    con = DriverManager.getConnection(

        "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC",

        "root",

        "Dhhh@63788182"

    );



    if(empno != null && empname != null && basicsalary != null){

        String insertQuery = "INSERT INTO Emp VALUES (?, ?, ?)";

        ps = con.prepareStatement(insertQuery);

        ps.setInt(1, Integer.parseInt(empno));

        ps.setString(2, empname);

        ps.setInt(3, Integer.parseInt(basicsalary));

        ps.executeUpdate();

    }



    st = con.createStatement();

    rs = st.executeQuery("SELECT * FROM Emp");

%>



<pre>

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

<%

    while(rs.next()){

        int no = rs.getInt("Emp_NO");

        String name = rs.getString("Emp_Name");

        int sal = rs.getInt("Basicsalary");



        grandTotal += sal;

%>

Emp_No : <%= no %>

Emp_Name: <%= name %>

Basic : <%= sal %>

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

<%

    }

%>

Grand Salary : <%= grandTotal %>

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

</pre>



<%

} catch(Exception e){

    out.println(e);

} finally {

    if(rs!=null) rs.close();

    if(st!=null) st.close();

    if(ps!=null) ps.close();

    if(con!=null) con.close();

}

%>