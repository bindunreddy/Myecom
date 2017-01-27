
<%@include file="header.jsp"%>


<!-- Adding the carousel and Thumbnail code -->



<div class="container">

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>


		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="resources/images/img_wallpaper.jpg" alt="Wallpaper"
					width="1700px" height="560px">
			</div>

			<div class="item">
				<img src="resources/images/img_wallpaper2.jpg" alt="WAllpaper"
					width="1700px" height="560px">
			</div>

			<div class="item">
				<img src="resources/images/ss1.jpg" alt="Book" width="1700px"
					height="560px">
			</div>

			<div class="item">
				<img src="resources/images/ss2.jpg" alt="Book" width="1700px"
					height="560px">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>

	</div>
	<!-- End of the carousel -->


	<br /> <br /> <br />


	<div class="row">
		<div class="col-sm-4 col-md-4">

			<div class="thumbnail">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Fiction novels <a href="${cp}/fictionnovels"><img
					src="resources/images/fiction novels.jpg"
					alt="Generic placeholder thumbnail" /></a>
			</div>
		</div>
		<div class="col-sm-4 col-md-4">
			<div class="thumbnail">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Love novels <a href="${cp}/lovenovels"><img
					src="resources/images/love.jpg" 
					alt="Generic placeholder thumbnail" /></a>
			</div>
		</div>
		<div class="col-sm-4 col-md-4">
			<div class="thumbnail">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Comics <a href="${cp}/comics"><img
					src="resources/images/comics.jpg"
					alt="Generic placeholder thumbnail" /></a>
			</div>
		</div>
	</div>
	<!-- End of the thumbnail -->

</div>
<!-- End of the thumbnail -->
<%@include file="footer.jsp"%>
</body>
</html>
