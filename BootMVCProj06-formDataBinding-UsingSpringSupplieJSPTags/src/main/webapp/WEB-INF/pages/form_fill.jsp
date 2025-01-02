
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.container{
  justify-content: center;
  height:100vh;
  align-items: center;
  display: flex;
}
.for-cl
{
 border:1px solid grey;
 padding:20px;
  border-radius: 10px;
}

</style>
<body>

<div class=container>
<frm:form modelAttribute="stud" class="for-cl">
    <dl>
    <dt>Enter your RollNo</dt>
    <dd><frm:input path="sRollNo"></frm:input>
    <dt>Enter your Name</dt>
    <dd><frm:input path="sName"></frm:input>
     <dt>Enter your Dept</dt>
     <dd><frm:input path="sDept"></frm:input>
      <dt> Percentage</dt>
    <dd><frm:input path="sPer"></frm:input>
    </dl>
    <button>Submit</button>
</frm:form>
</div>
</body>
</html>