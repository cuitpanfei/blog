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
    <!--css样式引入标签-->
    <%@include file="/basePages/links.html"%>
    <%@include file="/basePages/scripts.html"%>
    <%@include file="/basePages/jalendarJS.html"%>
</head>
<body class="theme">
<jsp:include page="/basePages/nav.jsp"/>
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
