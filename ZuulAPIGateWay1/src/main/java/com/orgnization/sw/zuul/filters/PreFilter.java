package com.orgnization.sw.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.REQUEST_URI_KEY;

public class PreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext context = RequestContext.getCurrentContext();
        Object originalRequestPath = context.get(REQUEST_URI_KEY);
        String modifiedRequestPath = "/oauth" + originalRequestPath;
        context.put(REQUEST_URI_KEY, modifiedRequestPath);
        HttpServletRequest request = context.getRequest();
        String auth = request.getHeader("Authorization");
        // Determine if the client request contained an OAuth Authorization
        boolean haveOauth2Token = (auth != null) && auth.startsWith("Bearer");
        boolean haveAccessToken = request.getParameter("access_token")!=null;
        if( haveOauth2Token || haveAccessToken) {
            System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString()+
            "Authorization "+auth);
        }
        return null;
    }
}
