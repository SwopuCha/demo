<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Form</title>
</head>
<body>
<form action="/saveEmp" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td>Designation:</td>
            <td><input type="text" name="designation"></td>
        </tr>

        <tr>
            <td>Address:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>Phone No:</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>Company Name:</td>
            <td><input type="text" name="companyName"></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Submit"></td>
        </tr>

    </table>

</form>

</body>
</html>