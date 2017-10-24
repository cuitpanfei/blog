<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

    <script src="${pageContext.request.contextPath}/dist/js/jquery.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/js/ajaxfileupload.min.js"></script>
</head>
<body>
<h3>通过ajax插件 ajaxfileupload.js 来异步上传文件</h3>
<form name="form5" action="/" method="post"
      enctype="multipart/form-data">
    <input type="file" id="file_AjaxFile" name="file_AjaxFile"> <input
        type="button" value="upload" onclick="fileUploadAjax()"/><span
        id="sp_AjaxFile"></span><br> <br> 上传进度：<span
        id="sp_fileUploadProgress">0%</span>
</form>
<script type="text/javascript">
    function fileUploadAjax() {
        if ($("#file_AjaxFile").val().length > 0) {
            progressInterval = setInterval(getProgress, 500);
            $.ajaxFileUpload({
                url: '${pageContext.request.contextPath}/FileUpload/fileUpload_ajax', //用于文件上传的服务器端请求地址
                type: "post",
                secureuri: false, //一般设置为false
                fileElementId: 'file_AjaxFile', //文件上传空间的id属性  <input type="file" id="file1" name="file" />
                dataType: 'application/json', //返回值类型 一般设置为json
                success: function (data) //服务器成功响应处理函数
                {
                    var jsonObject = eval('(' + data + ')');
                    $("#sp_AjaxFile").html(
                        " Upload Success ！ filePath:"
                        + jsonObject.filePath);
                },
                error: function (data, status, e)//服务器响应失败处理函数
                {
                    alert(e);
                }
            });//end ajaxfile
        } else {
            alert("请选择文件!");
        }
    }

    var progressInterval = null;
    var i = 0;
    var getProgress = function () {
        $.get(
            "${pageContext.request.contextPath}/FileUpload/fileUpload_progress",
            {},
            function (data) {
                $("#sp_fileUploadProgress").html(i++ + data);
                if (data == 100 || i == 100)
                    clearInterval(progressInterval);
            });
    }
</script>
</body>
</html>