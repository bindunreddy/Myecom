<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="resources/js/angular.js"></script>
<script src="resources/js/product.js"></script>

<link href="resources/css/bootstrap.css" rel="stylesheet">
    <link href="resources/css/app.css" rel="stylesheet">

</head>
<body>
<%@include file="header.jsp" %>

<div class="item active" align="center">
        <img src="resources/images/img_br01.jpg" alt="Wallpaper" width="1060px" height="400px">
        </div>

<div class="container">

<div ng-app="bnrApp" ng-controller="bnrctrl">
       <h1>Products</h1> 
       
            <table class="table table-bordred">
              <thead>
              
          <tr>
           <th>id</th>
           <th>name</th>
           <th>price</th>
         </tr>
         
        </thead>
        
        <tbody>
        <tr ng-repeat="x in mydata">
        <td>{{x.id}}</td>
        <td>{{x.name}}</td>
        <td>{{x.price}}</td>
        <td><a href="#" class="btn btn-info" role="button">view</a>
        <a href="#" class="btn btn-info" role="button">add to cart</a>
        
        
        
        </tr>
        </tbody>
      </table>
          </div>
          </div>
         <%@include file="footer.jsp" %>
       </body>
        </html>