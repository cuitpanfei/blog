<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="renderer" content="webkit">
    <meta name="keywords" content="">
    <meta name="description" content="">

    <title>登录</title>

    <%@include file="links.html"%>
    <style type="text/css">
        .welcome-message{
            margin-top:20px;
            height:50px;
        }
    </style>
    <%@include file="bootstrap-jquery.html"%>
    <script type="application/javascript">
        var admin_error_msg = "${admin_login_error_msg}";
    </script>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen ">
    <div>
        <div>

            <h1 class="logo-name text-gradient animated fadeInDown">简阅</h1>

        </div>
        <form class="m-t" role="form" action="${pageContext.request.contextPath}/admin/adminLogin.action" method="post">
            <div class="form-group animated fadeInLeftBig">
                <input type="email" class="form-control" placeholder="管理员账号" name="accountNumber" required="">
            </div>
            <div class="form-group animated fadeInRightBig">
                <input type="password" class="form-control" placeholder="管理员密码" name="accountPassword" required="">
            </div>
            <div id="error_msg" class="form-group animated fadeInRightBig" style="color:red">
                ${admin_login_error_msg}
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b animated fadeInUp">登 录</button>

        </form>

        <h3 class="welcome-message animated fadeInUp">欢迎使用 简阅</h3>
    </div>
</div>
</body>

</html>
