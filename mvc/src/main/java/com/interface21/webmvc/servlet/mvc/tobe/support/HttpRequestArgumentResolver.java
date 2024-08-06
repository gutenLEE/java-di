package com.interface21.webmvc.servlet.mvc.tobe.support;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.interface21.core.MethodParameter;
import com.interface21.web.method.support.HandlerMethodArgumentResolver;

public class HttpRequestArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getType() == HttpServletRequest.class;
    }

    @Override
    public Object resolveArgument(
            MethodParameter methodParameter,
            HttpServletRequest request,
            HttpServletResponse response) {
        return request;
    }
}
