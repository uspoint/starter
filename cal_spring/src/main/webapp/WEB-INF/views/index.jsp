<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap 101 Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${_resources}/css/bootstrap.min.css" rel="stylesheet" media="screen">
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한) -->
<script src="//code.jquery.com/jquery.js"></script>
<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="${_resources}/js/bootstrap.js"></script>
<script src="${_resources}/js/bootstrap.min.js"></script>
<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="${_resources}/js/respond.js"></script>
<script src="${_resources}/js/test.js"></script>
<script type="text/javascript">
	$(document).ready(
		function(){
			$('#saveBtn_pop').click(function(){
				alert("저장");
			});	
			$('#moveDesign').click(function(){
				location.href="http://localhost:8800/cal/design/index.html";
			});
	});
</script>
</head>
<body>
	<h1>Hello, world!</h1>

	

	<!-- Button trigger modal -->
	<button id="moveDesign" class="btn btn-primary btn-lg" data-toggle="modal"
		data-target="#myModal">Move DarkAdmin</button>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title">Modal title</h4>
				</div>
				<div class="modal-body">재미있게 살아보까나~</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button id="saveBtn_pop" type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
</body>
</html>