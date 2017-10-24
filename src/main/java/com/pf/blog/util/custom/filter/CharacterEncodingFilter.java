package com.pf.blog.util.custom.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

    private FilterConfig config;

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 获取filter初始化的参数值
        String encoding = config.getInitParameter("encoding");
        if (null != encoding && !"".equalsIgnoreCase(encoding)) {
            request.setCharacterEncoding(encoding);
            response.setCharacterEncoding(encoding);
        }
        // 把请求和响应传给过滤链中的下一个调用者或servlet
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}
