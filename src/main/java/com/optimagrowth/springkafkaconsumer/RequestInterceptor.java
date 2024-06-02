package com.optimagrowth.springkafkaconsumer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestInterceptor implements HandlerInterceptor {


    private TenantResolver tenantResolver;

    public RequestInterceptor(TenantResolver tenantResolver) {
        this.tenantResolver = tenantResolver;
    }

    public RequestInterceptor() {
    }

    private static final Logger log= LoggerFactory.getLogger(RequestInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //* Business logic just when the request is received and intercepted by this interceptor before reaching the controller
        try {


            System.out.println("Method Type: " + request.getMethod());
            System.out.println("Request URL: " + request.getRequestURI());
        }
        //* If the Exception is caught, this method will return false
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        try {
            System.out.println("2 - postHandle() : After the Controller serves the request (before returning back response to the client)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //* Business logic after request and response is Completed
        try {
            log.debug("after completion");
           // System.out.println("3 - afterCompletion() : After the request and Response is completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
