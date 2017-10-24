<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<nav id="menu" class="navbar">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <ul class="nav navbar-nav pull-left">
                    <li id="logo"><img src="${pageContext.request.contextPath}/img/ico.png"
                             width="48" height="48" alt="CUITPF-Blog"/></li>
                    <li><a href="${pageContext.request.contextPath}">首页</a></li>
                    <li><a href="${pageContext.request.contextPath}">项目开发</a></li>
                    <li><a href="${pageContext.request.contextPath}">系列文章</a></li>
                    <li><a href="${pageContext.request.contextPath}">个人日志</a></li>
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
                    <li id="user-info">
                        <a href="javascript:;"><i
                                class="fa fa-user"></i>&nbsp;${userinfo.user.userName}</a>
                        <ul class="user-menu">
                            <li>
                                <div>
                                    <a href="${pageContext.request.contextPath}/user/userInfo.action">
                                        <i class="fa fa-user"></i>&nbsp;${userinfo.user.userName}
                                    </a>
                                </div>
                            </li>
                            <li>
                                <div>
                                    <a href="${pageContext.request.contextPath}/user/logout.action"><i
                                    class="fa fa-user"></i>注销</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>
