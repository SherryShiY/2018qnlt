<%@ page pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML>
<HEAD>
<TITLE>����ѧԱ��̳--��������</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gbk">
<Link rel="stylesheet" type="text/css" href="style/style.css" />
<script type="text/javascript">
function check(){
	if(document.postForm.title.value=="") {
		alert("���ⲻ��Ϊ��");
		return false;
	}
	if(document.postForm.content.value=="") {
		alert("���ݲ���Ϊ��");
		return false;
	}
	if(document.postForm.content.value.length>1000) {
		alert("���Ȳ��ܴ���1000");
		return false;
	}
}
</script>
</HEAD>

<BODY>
<DIV>
	<IMG src="image/logo.gif">
</DIV>
<!--      �û���Ϣ����¼��ע��        -->

<DIV class="h">
	����δ��<a href="login.html">��¼</a>
	&nbsp;| &nbsp; <A href="reg.html">ע��</A> |
</DIV>


<!--      ����        -->
<DIV><BR/>
	<!--      ����        -->
	<DIV>
		&gt;&gt;<B><a href="index.html">��̳��ҳ</a></B>&gt;&gt;
		<B><a href="list.html">C#����</a></B>
	</DIV><BR/>
	<DIV>
		<FORM name="postForm" onsubmit="return check()" action="manage/doPost_new.html" method="POST"> 
			<INPUT type="hidden" name="boardId" value="4"/>
			<INPUT type="hidden" name="topicId" value=""/>
			<DIV class="t">
				<TABLE cellSpacing="0" cellPadding="0" align="center">
				    <TR>
					    <TD class="h" colSpan="3"><B>��������</B></TD>
				    </TR>
	
				    <TR class="tr3">
					    <TH width="20%"><B>����</B></TH>
					    <TH><INPUT class="input" style="PADDING-LEFT: 2px; FONT: 14px Tahoma" tabIndex="1" size="60" name="title"></TH>
				    </TR>
	
				    <TR class="tr3">
					    <TH vAlign=top>
					      <DIV><B>����</B></DIV>
					    </TH>
					    <TH colSpan=2>
					        <DIV>	
						        <span><textarea style="WIDTH: 500px;" name="content" rows="20" cols="90" tabIndex="2" ></textarea></span>
						    </DIV>
					      (���ܴ���:<FONT color="blue">1000</FONT>��)
					    </TH>
					</TR>
				</TABLE>
			</DIV>		
	
			<DIV style="MARGIN: 15px 0px; TEXT-ALIGN: center">
				<INPUT class="btn" tabIndex="3" type="submit" value="�� ��"> 
				<INPUT class="btn" tabIndex="4" type="reset"  value="�� ��">
			</DIV>
		</FORM>	
	</DIV>
</DIV>
<!--      ����        -->
<BR/>
<CENTER class="gray">2007 Beijing Aptech Beida Jade Bird
Information Technology Co.,Ltd ��Ȩ����</CENTER>

</BODY>
</HTML>