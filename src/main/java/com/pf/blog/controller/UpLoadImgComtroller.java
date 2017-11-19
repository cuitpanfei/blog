package com.pf.blog.controller;

import com.pf.util.Files_Utils_DG;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;


@RequestMapping("/FileUpload")
@Controller
public class UpLoadImgComtroller {

    /**
     * 采用 fileUpload_multipartFile ， file.transferTo 来保存上传的文件
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "fileUpload_multipartFile")
    @ResponseBody
    public String fileUpload_multipartFile(HttpServletRequest request, @RequestParam("file_upload") MultipartFile multipartFile) {
        //调用保存文件的帮助类进行保存文件，并返回文件的相对路径
        String filePath = Files_Utils_DG.FilesUpload_transferTo_spring(request, multipartFile, "/files/upload");
        return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }

    /**
     * 采用 fileUpload_multipartRequest file.transferTo 来保存上传文件
     * 参数不写 MultipartFile multipartFile 在request请求里面直接转成multipartRequest，从multipartRequest中获取到文件流
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "fileUpload_multipartRequest")
    @ResponseBody
    public String fileUpload_multipartRequest(HttpServletRequest request) {
        //将request转成MultipartHttpServletRequest
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        //页面控件的文件流，对应页面控件 input file_upload
        MultipartFile multipartFile = multipartRequest.getFile("file_upload");
        //调用保存文件的帮助类进行保存文件，并返回文件的相对路径
        String filePath = Files_Utils_DG.FilesUpload_transferTo_spring(request, multipartFile, "/files/upload");
        return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }

    /**
     * 通过流的方式上传文件
     *
     * @param request
     * @param multipartFile
     * @return
     */
    @RequestMapping("fileUpload_stream")
    @ResponseBody
    public String upFile(HttpServletRequest request, @RequestParam("file_upload") MultipartFile multipartFile) {
        String filePath = Files_Utils_DG.FilesUpload_stream(request, multipartFile, "/files/upload");
        return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }

    /**
     * @param request
     * @param multipartFile
     * @return
     */
    @RequestMapping(value = "fileUpload_ajax", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String fileUpload_ajax(HttpServletRequest request, @RequestParam("file_AjaxFile") MultipartFile multipartFile) {
        //调用保存文件的帮助类进行保存文件，并返回文件的相对路径
        String filePath = Files_Utils_DG.FilesUpload_transferTo_spring(request, multipartFile, "/files/upload");
        return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }

}
