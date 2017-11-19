<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!--网页文档声明为html-->
<html lang="en">
<!--语言为英语-->
<head>
    <!--头部标签-->
    <meta charset="UTF-8"/>
    <!--字符编码：utf-8国际编码  gb2312中文编码-->
    <meta name="Generator" content="EditPlus&reg;"/>
    <meta name="Author" content="cuitpf"/>
    <!--网页编写者-->
    <meta name="Keywords" content="微小说,短文,简约"/>
    <!--seo将使用-->
    <meta name="Description" content=""/>
    <!--网页说明-->
    <title>简阅-登录</title>
    <!--css样式引入标签-->
    <!-- ace style -->
    <link rel="stylesheet" href="assets/css/ace.min.css"/>
    <link rel="stylesheet" href="assets/css/ace-rtl.min.css"/>
    <!-- basic styles -->
    <link href="/blog/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="assets/css/font-awesome.min.css"/>

</head>
<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <h1>
                            <i class="icon-leaf green"></i>
                            <span class="red"><a style="text-decoration:none" href="">简阅</a></span>
                            <span class="white">网上短文</span>
                        </h1>
                        <h4 class="blue">&copy; Cuit-All-We Team</h4>
                    </div>
                    <div class="space-6"></div>
                    <div class="position-relative">
                        <div id="login-box" class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header blue lighter bigger">
                                        <i class="icon-coffee green"></i> 请输入你的信息
                                    </h4>
                                    <div class="space-6"></div>
                                    <form method="post" action="${pageContext.request.contextPath}/user/login.action">
                                        <fieldset>
                                            <label class="block clearfix"> <span
                                                    class="block input-icon input-icon-right"> <input name="accountNumber"
                                                                                                      type="text"
                                                                                                      class="form-control"
                                                                                                      placeholder="邮箱/用户名"/>
                            <i class="icon-user"></i> </span> </label>
                                            <label class="block clearfix">
                                              <span class="block input-icon input-icon-right">
                                                  <input name="accountPassword" type="password" class="form-control" placeholder="密&nbsp;&nbsp;&nbsp;码"/>
                                                  <i class="icon-lock" id="panfei" onmouseover="see()" onmouseout="nosee()"></i>
                                              </span>
                                            </label>
                                            <%if(request.getSession().getAttribute("error_msg")!=null){%>
                                            <label class="block clearfix">
                                              <span class="block input-icon input-icon-right">
                                                  <p name="msg"  readonly="readonly" style="color: #ff4330" >${error_msg}</p>
                                              </span>
                                            </label>
                                            <%}%>
                                            <div class="space"></div>
                                            <div class="clearfix">
                                                <label class="inline"> <input type="checkbox"
                                                                              class="ace"/> <span
                                                        class="lbl"> 记住我 </span> </label>
                                                <button type="submit"
                                                        class="width-35 pull-right btn btn-sm btn-primary">
                                                    <i class="icon-key"></i> 登录
                                                </button>
                                            </div>
                                            <div class="space-4"></div>
                                        </fieldset>
                                    </form>

                                </div>
                                <!-- /widget-main -->
                                <div class="toolbar clearfix">
                                    <div>
                                        <a href="#" onclick="show_box('forgot-box'); return false;"
                                           class="forgot-password-link"> <i class="icon-arrow-left"></i>
                                            忘记密码 </a>
                                    </div>
                                    <div>
                                        <a href="#" onclick="show_box('signup-box'); return false;"
                                           class="user-signup-link"> 我要注册 <i
                                                class="icon-arrow-right"></i> </a>
                                    </div>
                                </div>
                            </div>
                            <!-- /widget-body -->
                        </div>
                        <!-- /login-box -->
                        <div id="forgot-box" class="forgot-box widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header red lighter bigger">
                                        <i class="icon-key"></i> 找回密码
                                    </h4>
                                    <div class="space-6"></div>
                                    <p>请输入你的邮箱</p>
                                    <form>
                                        <fieldset>
                                            <label class="block clearfix"> <span
                                                    class="block input-icon input-icon-right"> <input
                                                    type="email" name="Email" class="form-control" placeholder="邮箱"/>
                            <i class="icon-envelope"></i> </span> </label>
                                            <div class="clearfix">
                                                <button type="button"
                                                        class="width-35 pull-right btn btn-sm btn-danger">
                                                    <i class="icon-lightbulb"></i> 发送给我 !
                                                </button>
                                            </div>
                                        </fieldset>
                                    </form>
                                </div>
                                <!-- /widget-main -->
                                <div class="toolbar center">
                                    <a href="#" onclick="show_box('login-box'); return false;"
                                       class="back-to-login-link"> 返回登录 <i
                                            class="icon-arrow-right"></i> </a>
                                </div>
                            </div>
                            <!-- /widget-body -->
                        </div>
                        <!-- /forgot-box -->
                        <div id="signup-box" class="signup-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header green lighter bigger">
                                        <i class="icon-group blue"></i> 注册
                                    </h4>
                                    <div class="space-6"></div>
                                    <p>请输入你的信息:</p>
                                    <form action="${pageContext.request.contextPath}/user/reg.action" method="post" id="reg_form">
                                        <fieldset>
                                            <label class="block clearfix"> <span
                                                    class="block input-icon input-icon-right"> <input type="accountNumber"
                                                                                                      class="form-control"
                                                                                                      name="email"
                                                                                                      placeholder="邮箱"/> <i
                                                    class="icon-envelope"></i> </span> </label> <label
                                                class="block clearfix"> <span class="block input-icon input-icon-right"> <input
                                                type="text" class="form-control" name="username"
                                                placeholder="用户名"/> <i class="icon-user"></i> </span> </label> <label
                                                class="block clearfix"> <span class="block input-icon input-icon-right"> <input
                                                type="password"
                                                class="form-control" name="accountPassword"
                                                placeholder="密&nbsp;&nbsp;&nbsp;码"/> <i class="icon-lock"
                                                                                        onmouseover="see()"
                                                                                        onmouseout="nosee()"></i> </span>
                                        </label> <label class="block"> <input type="checkbox" class="ace"
                                                                              id="checkbox_ace"/>
                                            <span class="lbl"> 我接受 <a href="#">用户协议</a> </span> </label>
                                            <div class="space-24"></div>
                                            <div class="clearfix">
                                                <button type="reset" class="width-30 pull-left btn btn-sm">
                                                    <i class="icon-refresh"></i> 重写
                                                </button>
                                                <button id="register_ok" type="submit"
                                                        class="width-65 pull-right btn btn-sm btn-success"
                                                        disabled="disabled">
                                                    注册 <i class="icon-arrow-right icon-on-right"></i>
                                                </button>
                                            </div>
                                        </fieldset>
                                    </form>
                                </div>
                                <div class="toolbar center">
                                    <a href="#" onclick="show_box('login-box'); return false;"
                                       class="back-to-login-link"> <i class="icon-arrow-left"></i> 我要登录</a>
                                </div>
                            </div>
                            <!-- /widget-body -->
                        </div>
                        <!-- /signup-box -->
                    </div><!-- /position-relative -->
                </div>
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div>
</div><!-- /.main-container -->
<script src="${pageContext.request.contextPath}/dist/js/jquery.min.js"></script>
<script type="text/javascript">
    function show_box(id) {
        jQuery('.widget-box.visible').removeClass('visible');
        jQuery('#' + id).addClass('visible');
    }
</script>
<script type="text/javascript">
    function see() {
        var ps = $("i.icon-lock").prev();
        if (ps.val() != "") {
            ps.attr("type", "text")//设置文本框是文本框（显示密码）
        }
    }

    function nosee() {
        var ps = $("i.icon-lock").prev();
        if (ps.attr("type") == "text") {
            ps.attr("type", "password")//设置文本框是文本框（显示密码）
        }
    }
</script>
<script type="text/javascript">
    var name = '${param.name}';
    $(function () {
        if ('login-box' == name) {
            show_box(name);
        }
    });
    $("input[type='checkbox']").click(
        function regSubmit() {
            if ($("input[type='checkbox']").is(':checked')) {
                $("#register_ok").attr("disabled", false);
            } else {
                $("#register_ok").attr("disabled", true);
            }
            $("#user_reg_regForm input").bind(
                "keyup",
                function (event) {/* 增加回车提交功能 */
                    if (event.keyCode == "13" && $("input[type='checkbox']").is(':checked')){
                        $("#reg_form").submit();
                    }else{
                        alert("aaaaa")
                    }
                });
        });
</script>
</body>
</html>
