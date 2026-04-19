<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Result Form</title>

<script>
function validateForm() {
    let roll = document.forms["myForm"]["rollno"].value;
    let name = document.forms["myForm"]["sname"].value;
    let marks = ["sub1","sub2","sub3","sub4","sub5"];

    if (roll === "" || name === "") {
        alert("Roll No and Name must be filled!");
        return false;
    }

    for (let i = 0; i < marks.length; i++) {
        let val = document.forms["myForm"][marks[i]].value;

        if (val === "" || isNaN(val) || val < 0 || val > 100) {
            alert("Enter valid marks (0–100) for all subjects");
            return false;
        }
    }
    return true;
}
</script>

</head>
<body>

<h2>Student Marks Entry</h2>

<form name="myForm" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>
Student Name: <input type="text" name="sname"><br><br>

Sub1: <input type="text" name="sub1"><br><br>
Sub2: <input type="text" name="sub2"><br><br>
Sub3: <input type="text" name="sub3"><br><br>
Sub4: <input type="text" name="sub4"><br><br>
Sub5: <input type="text" name="sub5"><br><br>

<input type="submit" value="Calculate Result">

</form>

</body>
</html>