<%@page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<form id="searchTxtForm">
	<input type="hidden" name="viewCount" id="viewCount" value="0">
	<input type="hidden" name="startCount" id="startCount" value="0">
	<div class="tableList">
		<table id="more_list">
			<caption>������ ��� �����ϱ�</caption>
			<colgroup>
				<col>
				<col style="width: 14.19%">
			</colgroup>
			<thead>
				<tr>
					<th scope="col">����</th>
					<th scope="col">�ۼ���</th>
				</tr>
			</thead>
			<tbody>
				<!-- �ݺ����� -->
				<c:forEach items="${resultList}" var="resultVO" varStatus="status">
					<tr>
						<!-- ����, �ۼ��� -->
						<td>${resultVO.title}</td>
						<td>${resultVO.reg_date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<div id="more_btn_div" align="center">
			<hr>
			<a id="more_btn_a" href="javascript:moreContent('more_list', 10);">������(More) </a>
			<hr>
		</div>
	</div>
</form>
<script> function moreContent(id, cnt){ 
	var list_length = $("#"+id+" tr").length-1; 
	//tr���� ���ϱ� , 1�� ���� ������ ����,�ۼ��� tr�� �ϳ� �����ϱ� ����. 
	var aname = id+"_btn"; 
	var callLength = list_length; 
	$('#startCount').val(callLength); 
	$('#viewCount').val(cnt); 
	$.ajax({ type : "post", url : "/getMoreContents_ajax.do", 
		data : $('#searchTxtForm').serialize(), 
		dataType: "json", success : 
			function(result) { 
			if(result.resultCnt > 0){ var list = result.resultList; 
			if(resultVO.title != '') { 
				$('#'+aname).attr('href',"javascript:moreContent('"+id+"', "+cnt+");"); 
				getMoreList(list); 
				}else{ 
					$("#"+id+"_div").remove(); }
			} 
			}else{ } }, 
			error : 
				function(request,status,error){ 
				alert("code = "+ request.status + " message = " 
						+ request.responseText + " error = " + error); // ���� �� ó�� 
						} }); 
	function getMoreList(list){ var content = ""; 
	var length = list.length; for(i=0; i<list.length; i++){ 
		var resultVO = list[i]; if(resultVO.title != ''){ 
			content += "<tr>"; content += "<td>"+resultVO.title+"</td>"; 
			content += "<td>"+resultVO.reg_date+"</td>"; 
			content += "</tr>"; } } $("#more_list tr:last").after(content); 
			// id�� more_list �� tr�� �������� content ���� �߰��� } 
	</script>