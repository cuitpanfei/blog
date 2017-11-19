<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简阅 - 后台管理</title>
    <%@include file="links.html"%>
    <%@include file="bootstrap-jquery.html"%>
</head>
<body class="fixed-sidebar full-height-layout gray-bg  pace-done">
<div id="wrapper">
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close">
            <i class="fa fa-times-circle"></i>
        </div>
        <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;">
            <div class="sidebar-collapse" style="width: auto; height: 100%;">
            <ul class="nav" id="side-menu">
                <li class="nav-header">

                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="img/profile_small.jpg" />
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">Beaut-zihan</strong>
                             </span> <span class="text-muted text-xs block">超级管理员 <b class="caret"></b></span> </span>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="#">修改头像</a>
                            </li>
                            <li><a href="#">个人资料</a>
                            </li>
                            <li><a href="#">联系我们</a>
                            </li>
                            <li><a href="#">信箱</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="${pageContext.request.contextPath}/admin/loginout.action">安全退出</a>
                            </li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        简阅
                    </div>

                </li>
                <li class="active">
                    <a href="#"><i class="fa fa-th-large"></i> <span class="nav-label">主页</span> <span class="fa arrow"></span></a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-columns"></i> <span class="nav-label">用户管理</span><span class="label label-danger pull-right">2.0</span></a>
                </li>
                <li>
                    <a href="#"><i class="fa fa fa-globe"></i> <span class="nav-label">板块管理</span><span class="fa arrow"></span></a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">文章管理</span><span class="fa arrow"></span></a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">评论回复</span><span class="label label-warning pull-right">16</span></a>
                    <ul class="nav nav-second-level">
                        <li><a href="mailbox.action">收件箱</a>
                        </li>
                        <li><a href="mail_detail.action">查看邮件</a>
                        </li>
                        <li><a href="mail_compose.action">写信</a>
                        </li>
                    </ul>
                </li>
            </ul>

        </div>
        </div>
    </nav>
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" method="get" action="search_results.action">
                        <div class="form-group">
                            <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                        </div>
                    </form>
                </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <span class="m-r-sm text-muted welcome-message"><a href="${pageContext.request.contextPath}" title="返回首页"><i class="fa fa-home"></i></a>欢迎使用简阅后台主题</span>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope"></i> <span class="label label-warning">16</span>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
                            <li>
                                <div class="dropdown-messages-box">
                                    <a href="profile.action" class="pull-left">
                                        <img alt="image" class="img-circle" src="img/a7.jpg">
                                    </a>
                                    <div class="media-body">
                                        <small class="pull-right">46小时前</small>
                                        <strong>小四</strong> 项目已处理完结
                                        <br>
                                        <small class="text-muted">3天前 2014.11.8</small>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="dropdown-messages-box">
                                    <a href="profile.action" class="pull-left">
                                        <img alt="image" class="img-circle" src="img/a4.jpg">
                                    </a>
                                    <div class="media-body ">
                                        <small class="pull-right text-navy">25小时前</small>
                                        <strong>国民岳父</strong> 这是一条测试信息
                                        <br>
                                        <small class="text-muted">昨天</small>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a href="mailbox.action">
                                        <i class="fa fa-envelope"></i> <strong> 查看所有消息</strong>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                            <i class="fa fa-bell"></i> <span class="label label-primary">8</span>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="mailbox.action">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> 您有16条未读消息
                                        <span class="pull-right text-muted small">4分钟前</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="profile.action">
                                    <div>
                                        <i class="fa fa-qq fa-fw"></i> 3条新回复
                                        <span class="pull-right text-muted small">12分钟前</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a href="notifications.action">
                                        <strong>查看所有 </strong>
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/admin/loginout.action">
                            <i class="fa fa-sign-out"></i> 退出
                        </a>
                    </li>
                </ul>

            </nav>
        </div>
        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content" style="margin-left: 0px;">
                    <a href="javascript:;" class="J_menuTab" data-id="index_v1.html">首页</a>
                    <a href="javascript:;" class="active J_menuTab" data-id="index_v2.html">主页示例二 <i class="fa fa-times-circle"></i></a></div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabShowActive">
                        <a>定位当前选项卡</a>
                    </li>
                    <li class="divider"></li>
                    <li class="J_tabCloseAll">
                        <a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther">
                        <a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="login.html" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
        </div>
        <div class="row  border-bottom white-bg dashboard-header" id = "content-main">
            <div class="col-sm-12">
                <blockquote class="text-warning" style="font-size:14px">
                    <h4 class="text-danger">简阅</h4>
                    欢迎使用简阅后台管理。
                </blockquote>

                <hr>

                <div class="row">
                    <div class="col-lg-12">
                        <div class="wrapper wrapper-content">
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="ibox float-e-margins">
                                        <div class="ibox-title">
                                            <h5>简阅 开发文档</h5>
                                        </div>
                                        <div class="ibox-content">
                                            <p>简阅从v2.2.0版本以后，提供了开发文档，如下图所示：</p>
                                            <p>
                                                <img src="http://cdn.zi-han.net/theme/hplus/hplus-docs.png" width="100%">
                                            </p>
                                            <p>开发文档位于压缩包中的docs目录下。</p>
                                        </div>
                                    </div>

                                    <div class="ibox float-e-margins">
                                        <div class="ibox-title">
                                            <h5>二次开发</h5>
                                        </div>
                                        <div class="ibox-content">
                                            <p>我们提供基于简阅的二次开发服务，具体费用请联系作者。</p>
                                            <p>同时，我们也提供以下服务：</p>
                                            <ol>
                                                <li>基于WordPress的网站建设和主题定制</li>
                                                <li>PSD转WordPress主题</li>
                                                <li>PSD转XHTML</li>
                                                <li>Html页面（CSS+XHTML+jQuery）制作</li>
                                            </ol>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="ibox float-e-margins">
                                        <div class="ibox-title">
                                            <h5>联系信息</h5>

                                        </div>
                                        <div class="ibox-content">
                                            <p><i class="fa fa-send-o"></i> 博客：<a href="http://www.zi-han.net" target="_blank">http://www.zi-han.net</a>
                                            </p>
                                            <p><i class="fa fa-qq"></i> QQ：<a href="http://wpa.qq.com/msgrd?v=3&uin=516477188&site=qq&menu=yes" target="_blank">516477188</a>
                                            </p>
                                            <p><i class="fa fa-weixin"></i> 微信：<a href="javascript:;">zheng-zihan</a>
                                            </p>
                                            <p><i class="fa fa-credit-card"></i> 支付宝：<a href="javascript:;" class="支付宝信息">zheng-zihan@qq.com / *子涵</a>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="ibox float-e-margins">
                                        <div class="ibox-title">
                                            <h5>更新日志</h5>
                                        </div>
                                        <div class="ibox-content no-padding">

                                            <div class="panel-body">
                                                <div class="panel-group" id="version">
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h5 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v22">v2.2</a><code class="pull-right">2015.05.01更新</code>
                                                            </h5>
                                                        </div>
                                                        <div id="v22" class="panel-collapse collapse in">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h5 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v21">v2.1</a>
                                                            </h5>
                                                        </div>
                                                        <div id="v21" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h5 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v20">v2.0</a>
                                                            </h5>
                                                        </div>
                                                        <div id="v20" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h5 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v18">v1.8</a>
                                                            </h5>
                                                        </div>
                                                        <div id="v18" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h5 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v17">v1.7</a>
                                                            </h5>
                                                        </div>
                                                        <div id="v17" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h5 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v16">v1.6</a>
                                                            </h5>
                                                        </div>
                                                        <div id="v16" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v15">v1.5</a>
                                                            </h4>
                                                        </div>
                                                        <div id="v15" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#version" href="#v14">v1.4</a>
                                                            </h4>
                                                        </div>
                                                        <div id="v14" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v13">v1.3</a>
                                                            </h4>
                                                        </div>
                                                        <div id="v13" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v12">v1.2</a>
                                                            </h4>
                                                        </div>
                                                        <div id="v12" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#version" href="#v11">v1.1</a>
                                                            </h4>
                                                        </div>
                                                        <div id="v11" class="panel-collapse collapse">
                                                            <div class="panel-body">
                                                                <ol>
                                                                    <li>
                                                                    </li>
                                                                </ol>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

            </div>
            <div class="footer">
                <div class="pull-right">
                    By：
                </div>
                <div>
                    <strong>Copyright</strong> 简阅 &copy; 2014
                </div>
            </div>
        </div>
    </div>
</div>

</body>

</html>
