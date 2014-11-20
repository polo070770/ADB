<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%--
  the values for "arrow=xxx" are the names of the images jpivot/jpivot/table/arrow-xxx.gif
--%>

<jp:mondrianQuery 
id="query01" 
jdbcDriver="org.postgresql.Driver" 
jdbcUrl="jdbc:postgresql://postgres.mat.ub.edu/dquitata12"
catalogUri="/WEB-INF/queries/Privalia.xml"
jdbcUser="dquitata12_adm" jdbcPassword="curs1415" connectionPooling="false">

select {[Measures].[importe], [Measures].impuestos} ON columns,
  {([Producto].[Todos los Productos],[Cliente].[Todos los Clientes])} ON rows
from [Ventas]
</jp:mondrianQuery>

<c:set var="title01" scope="session">Arrows</c:set>
