<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="javax.xml.ws.Response"%>
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="java.time.LocalDate"%>

  <%@ page import="java.text.SimpleDateFormat" %>  <%--for date --%>
  <%@ page import="java.util.*" %>
  <%@ page import="java.sql.Connection,java.sql.DriverManager,java.sql.SQLException,java.sql.PreparedStatement,java.sql.ResultSet,java.sql.Statement" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="card text-center " style="height: 100%; background-image: linear-gradient(160deg,orange,white,green);font-family: 'Times New Roman', Times, serif; font-size: 23px; position: sticky; top:0; z-index:9999;">


 <div class="card-header" style="height: 20%">
                <div class="row">
                <label class=" col-2 font-weight-bolder text-dark"for="exampleInputEmail1">Date :</label>
                <% SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                		Date date = new Date();
                		//System.out.println(formatter.format(date)) ;
                		%>    <%--******date Print***** --%>
                <label class=" col-2 font-weight-bolder text-dark"for="exampleInputEmail1"><%=formatter.format(date) %></label>
                </div>

                <div class="row mt-3">
                        <label class=" col-2 font-weight-bolder text-dark"for="exampleInputEmail1">Service :</label>
                        <select id="select" name="select1" class="form-control " onchange="this.form.submit()" required style="box-shadow: 1px 2px 3px 4px #4cc912; width:250px">
                                <option value="-1">Choose option</option>
<%--
	
	    try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu","root","");	
            PreparedStatement s = con.prepareStatement("select service from service");
           // System.out.println(request.getParameter("select1"));
            ResultSet rs = s.executeQuery();
            while(rs.next()) 
               {
 --%>
          <option value="<%--rs.getString("service")--%>"><%--rs.getString("service")--%></option>
<%--
                }
            rs.close();
            con.close();

            }
      catch(SQLException | ClassNotFoundException ex){
	            System.out.println(ex);
            }

--%>                          
                     </select>                  
                </div>



 <div class="card-body" style="height:80%; width:100%">
            <div class="row mt-3">
                            <div class="col-3"></div>
                            <div class="col-6">
                                <button onclick="window.location.href = 'ListDisplay.htm';" type="button" class="btn btn-primary col-2" >Retrive</button>
                                <button  type="button" class="btn btn-secondary col-2">Alter Menu</button>
                                <button  type="button" class="btn btn-secondary col-2" onclick="myfun();">Print</button>
                                <button  type="button" class="btn btn-secondary col-2">Close</button>
        
                            </div>
                            <div class="col-3"></div>
                      </div>



</div>





</div>











<a href="scroll.htm">List</a>
</body>
</html>