<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!doctype html><!--网页文档声明为html-->
<html lang="en"><!--语言为英语-->
<head><!--头部标签-->
    <meta charset="UTF-8"><!--字符编码：utf-8国际编码  gb2312中文编码-->
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content=""><!--网页编写者-->
    <meta name="Keywords" content="关键字"><!--seo将使用-->
    <meta name="Description" content=""><!--网页说明-->
    <title>CUITPF-Blog</title>
    <!--css样式引入标签-->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/dist/css/bootstrap.min.css"/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/dist/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/theme.css"/>

    <script src="${pageContext.request.contextPath}/dist/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        var user = "${userinfo.user.userName}";
        var _contextPath = "${pageContext.request.contextPath}";
    </script>
    <script src="${pageContext.request.contextPath}/js/functions.js"></script>
    <script src="${pageContext.request.contextPath}/js/utils.js"></script>
</head>
<body class="theme">
<nav id="menu" class="navbar">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <ul class="nav navbar-nav pull-left">
                    <li><img src="${pageContext.request.contextPath}/img/ico.png"
                             width="48" height="48" alt="CUITPF-Blog"/></li>
                    <li><a href="#">首页</a></li>
                    <li><a href="#0">项目开发</a></li>
                    <li><a href="#1">系列文章</a></li>
                    <li><a href="#2">个人日志</a></li>
                </ul>
            </div>
            <div class="col-lg-6 col-md-6">
                <ul id="no-login" class="nav navbar-nav pull-right">
                    <li id="for-search"><input name="search" type="text"/> <i
                            class="fa fa-search"></i></li>
                    <li><a
                            href="${pageContext.request.contextPath}/login.jsp?name=login-box"><i
                            class="fa fa-user"></i>&nbsp;登录</a></li>
                    <li><a href="${pageContext.request.contextPath}/login.jsp"><i
                            class="fa fa-user-plus"></i>&nbsp;注册</a></li>
                </ul>
                <ul id="is-login" class="nav navbar-nav pull-right">
                    <li id="for-search"><input name="search" type="text"/> <i
                            class="fa fa-search"></i></li>
                    <li id="user-info"><a
                            href="${pageContext.request.contextPath}/user/userInfo.action"><i
                            class="fa fa-user"></i>&nbsp;${userinfo.user.userName}</a></li>
                    <li id="user-info"><a
                            href="${pageContext.request.contextPath}/user/logout.action"><i
                            class="fa fa-user"></i>注销</a></li>
                </ul>
            </div>
        </div>
    </div>
</nav>


<footer>
    <div class="contact-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6 footer-left-img">
                    <img src="${pageContext.request.contextPath}/img/fs.png"
                         width="400" height="400" alt="">
                </div>
                <div class="col-lg-6 col-md-6 col-sm-12">
                    <h3>留言:</h3>
                    <input type="text" class="text" value="Name"
                           onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Name';}"> <input
                        type="text" class="text" value="Email" onfocus="this.value = '';"
                        onblur="if (this.value == '') {this.value = 'Email';}">
                    <textarea name="Message" onfocus="this.value = '';"
                              onblur="if (this.value == '') {this.value = 'Message';}"></textarea>
                    <input type="submit" value="Send">
                </div>
            </div>
        </div>
    </div>
    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="pull-left">
                        <p>Copyright &copy; 2017.Company name All rights reserved.</p>
                    </div>

                    <div class="pull-right">
                        <ul>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
</body>
</html>
