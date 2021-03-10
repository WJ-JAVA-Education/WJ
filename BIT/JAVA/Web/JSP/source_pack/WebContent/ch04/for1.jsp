<%@page contentType="text/html; charset=EUC-KR"%>
1.1~10까지의 합을 식과 함께 출력하시오.(표현식만 사용)
<br>
ex-(1 + 2 + 3....10 = 55)
<br>
<%
	int sum = 0;
	for (int i = 1; i < 11; i++) {
		if (i < 10) {
%>
	<%=i + " + "%>
<%
		} else {
%>
	<%=i + " = "%>
<%
		}
		sum += i;
	} //for
%>
<%=sum%>
<hr>
2.1~10까지의 합을 식과 함께 출력하시오.(out.println 사용)<br>
<%
		sum=0;
		for (int i = 1; i < 11; i++) {
			if(i<10)
				out.println(i + " + ");
			else
				out.println(i + " = ");
			sum+=i;
		}
		out.println(sum);
%>

















