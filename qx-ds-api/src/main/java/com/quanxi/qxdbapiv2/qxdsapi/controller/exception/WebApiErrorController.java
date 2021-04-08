package com.quanxi.qxdbapiv2.qxdsapi.controller.exception;

import com.alibaba.fastjson.JSONArray;
import com.quanxi.qxdbapiv2.qxcommon.common.api.ResultBody;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class WebApiErrorController implements ErrorController {

    private static final String PATH = "";
    private static final JSONArray rows = new JSONArray();

    @RequestMapping(value = PATH)
    @ResponseBody
    public Object error(HttpServletRequest req, HttpServletResponse res, Exception ex) {
        int status = res.getStatus();
        String msg = "";

        if(status >= 300 && status < 400){
            if (status == 301) {
                msg = "被请求的资源已永久移动到新位置。";
            } else if (status == 302) {
                msg = "请求的资源现在临时从不同的 URI 响应请求。";
            }
        } else if (status >= 400 && status < 500) {
            if (status == 404) {
                msg = "请求失败，请求所希望得到的资源未被在服务器上发现。";
            } else if (status == 403) {
                msg = "服务器已经理解请求，但是拒绝执行它。";
            }
        } else if (status >= 500 && status < 600) {
            if (status == 500) {
                msg = "服务器遇到了一个未曾预料的状况，导致了它无法完成对请求的处理。";
            }
        }

        return ResultBody.jsonResult(status, msg, 0, rows);
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
