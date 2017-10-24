<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<!--网页文档声明为html-->
<html lang="en">
<!--语言为英语-->
<head>
    <!--头部标签-->
    <meta charset="UTF-8">
    <!--字符编码：utf-8国际编码  gb2312中文编码-->
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <!--网页编写者-->
    <meta name="Keywords" content="关键字">
    <!--seo将使用-->
    <meta name="Description" content="">
    <!--网页说明-->
    <title>CUITPF-Blog</title>
    <!--css样式引入标签-->
    <%@include file="/basePages/links.html"%>
    <%@include file="/basePages/scripts.html"%>

    <script id="jalendarUtil" src="${pageContext.request.contextPath}/js/jalendar.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jslendaeUtil.js"></script>
    <script src="${pageContext.request.contextPath}/js/functions.js"></script>
    <script type="text/javascript">
        var user = "${userinfo.user.userName}";
        var _contextPath = "${pageContext.request.contextPath}";
    </script>
    <script src="${pageContext.request.contextPath}/js/utils.js"></script>
    <style type="text/css" media="screen">
    </style>
</head>
<body class="theme">
<jsp:include page="/basePages/nav.jsp"/>
<div class="page-content">
    <div class="container">
        <div class="row">
            <!-- left info start -->
            <div class="col-lg-8 col-md-7 page-left">
                <div class="row page-banner">
                    <div class="col-lg-12 col-md-12">
                        <div id="banner" class="row">
                            <div class="col-lg-12 col-md-12">
                                <img src="${pageContext.request.contextPath}/img/banner.jpg"
                                     alt="">
                            </div>
                        </div>
                        <div class="row" style="margin-left: -8px">
                            <div class="col-lg-4 col-md-4">
                                <img src="${pageContext.request.contextPath}/img/banner-1.jpg"
                                     alt="">
                            </div>
                            <div class="col-lg-4 col-md-4">
                                <img src="${pageContext.request.contextPath}/img/banner-2.jpg"
                                     alt="">
                            </div>
                            <div class="col-lg-4 col-md-4">
                                <img src="${pageContext.request.contextPath}/img/banner-3.jpg"
                                     alt="">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row left-articles">
                    <div class="col-lg-12 col-md-12">
                        <ul>
                            <li><a href="#newArticle" title="">最新文章</a></li>
                            <li><a href="#hotArticle" title="">最热文章</a></li>
                            <li><a href="#likeArticle" title="">项目相关</a></li>
                            <li><a href="#more" title="">&raquo;</a></li>
                        </ul>
                        <ul class="clear-class">
                            <li>
                                <div class="article-abstract">
                                    <div class="left-img">
                                        <img
                                                src="${pageContext.request.contextPath}/img/banner-1.jpg"
                                                alt="">
                                    </div>
                                    <div class="article-info">
                                        <article>
                                            <h1>
                                                <a href="#toArticle" title="">Internet Explorer 9</a>
                                            </h1>
                                            <p>Windows Internet Explorer 9（简称 IE9）于 2011 年 3 月 14
                                                日发布.....</p>
                                            <footer>
                                                <a href="#0" title=""><i class="fa fa-eye"></i>&nbsp;10&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-comment"></i>&nbsp;30&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-clock-o"></i>&nbsp;2017/8/4</a>
                                            </footer>
                                        </article>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="article-abstract">
                                    <div class="left-img">
                                        <img
                                                src="${pageContext.request.contextPath}/img/banner-2.jpg"
                                                alt="">
                                    </div>
                                    <div class="article-info">
                                        <article>
                                            <h1>
                                                <a href="#toArticle" title="">Internet Explorer 9</a>
                                            </h1>
                                            <p>Windows Internet Explorer 9（简称 IE9）于 2011 年 3 月 14
                                                日发布.....</p>
                                            <footer>
                                                <a href="#0" title=""><i class="fa fa-eye"></i>&nbsp;10&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-comment"></i>&nbsp;30&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-clock-o"></i>&nbsp;2017/8/4</a>
                                            </footer>
                                        </article>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="article-abstract">
                                    <div class="left-img">
                                        <img
                                                src="${pageContext.request.contextPath}/img/banner-3.jpg"
                                                alt="">
                                    </div>
                                    <div class="article-info">
                                        <article>
                                            <h1>
                                                <a href="#toArticle" title="">Internet Explorer 9</a>
                                            </h1>
                                            <p>Windows Internet Explorer 9（简称 IE9）于 2011 年 3 月 14
                                                日发布.....</p>
                                            <footer>
                                                <a href="#0" title=""><i class="fa fa-eye"></i>&nbsp;10&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-comment"></i>&nbsp;30&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-clock-o"></i>&nbsp;2017/8/4</a>
                                            </footer>
                                        </article>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="article-abstract">
                                    <div class="left-img">
                                        <img src="${pageContext.request.contextPath}/img/banner.jpg"
                                             alt="">
                                    </div>
                                    <div class="article-info">
                                        <article>
                                            <h1>
                                                <a href="#toArticle" title="">Internet Explorer 9</a>
                                            </h1>
                                            <p>Windows Internet Explorer 9（简称 IE9）于 2011 年 3 月 14
                                                日发布.....</p>
                                            <footer>
                                                <a href="#0" title=""><i class="fa fa-eye"></i>&nbsp;10&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-comment"></i>&nbsp;30&nbsp;</a>
                                                <a href="#0" title=""><i class="fa fa-clock-o"></i>&nbsp;2017/8/4</a>
                                            </footer>
                                        </article>
                                    </div>
                                </div>
                            </li>
                        </ul>
                        <div class="pagination">
                            <ul id="pagination-digg">
                                <li class="previous-off">&laquo;Previous</li>
                                <li class="active">1</li>
                                <li><a href="">2</a></li>
                                <li><a href="">3</a></li>
                                <li><a href="">4</a></li>
                                <li><a href="">5</a></li>
                                <li><a href="">6</a></li>
                                <li><a href="">7</a></li>
                                <li class="next"><a href="">Next &raquo;</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- left info end -->
            <!-- content no info -->
            <div class="col-lg-1 col-md-1"></div>
            <!-- right info start -->
            <div class="col-lg-3 col-md-4 page-right">
                <div id="" class="">
                    <div id="yourId" class="jalendar">
                        <!-- 登陆后ajax添加 start 下面是测试数据 -->
                        <!-- 登陆后ajax添加 end -->
                    </div>
                    <p></p>
                    <img src="holder.js/292x600" alt="">
                    <p></p>
                    <img src="holder.js/292x200" alt="">
                </div>
            </div>
            <!-- right info end -->
        </div>
    </div>
</div>

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
