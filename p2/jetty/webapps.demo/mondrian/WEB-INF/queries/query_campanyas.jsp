<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery 
id="query01" 
jdbcDriver="org.postgresql.Driver" 
jdbcUrl="jdbc:postgresql://postgres.mat.ub.edu/dquitata12"
catalogUri="/WEB-INF/queries/Privalia.xml"
jdbcUser="dquitata12_adm" jdbcPassword="curs1415" connectionPooling="false">

select 
	{
		[Measures].[num_ventas],
		[Measures].[devuelto],
		[Measures].[importe],
		[Measures].[impuestos],
		[Measures].[coste_venta]

	} ON columns,

	{
		[Campanya].[Todas las campanyas]
	} ON rows
from [Ventas]

</jp:mondrianQuery>
<c:set var="title01" scope="session">Campanyas</c:set>
