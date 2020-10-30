<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <!-- 遍历数据 -->
    <table>
        <#list users as user>
            <tr>
                <td>${user.t_id}</td>
                <td>${user.ename}</td>
                <td>${user.salary}</td>
                <td>${user.hiredate}</td>
            </tr>
        </#list>
    </table>

</body>
</html>