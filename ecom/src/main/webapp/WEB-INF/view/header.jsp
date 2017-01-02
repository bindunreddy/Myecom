<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="">Aryan Books World</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/index"/>">Home</a></li>
            <li><a href="<c:url value="/about"/>">About</a></li>
            <li><a href="<c:url value="/contact"/>">Contact</a></li>
            
     
              </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="<c:url value="/login"/>"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="<c:url value="/adminform"/>">Admin</a></li>
         <li><a href="<c:url value="/register"/>">Register</a></li>
      </ul>
        
        </div><!--/.nav-collapse -->
      </div>
    </nav>
