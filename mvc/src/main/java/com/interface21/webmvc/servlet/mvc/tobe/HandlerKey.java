package com.interface21.webmvc.servlet.mvc.tobe;

import java.util.Objects;

import com.interface21.web.bind.annotation.RequestMethod;
import com.interface21.webmvc.servlet.mvc.tobe.support.PathPatternUtil;

public class HandlerKey {

    private final String url;
    private final RequestMethod requestMethod;

    public HandlerKey(final String url, final RequestMethod requestMethod) {
        this.url = url;
        this.requestMethod = requestMethod;
    }

    public boolean isMatch(final HandlerKey handlerKey) {
        if (!requestMethod.equals(handlerKey.getRequestMethod())) {
            return false;
        }
        return PathPatternUtil.isUrlMatch(url, handlerKey.getUrl());
    }

    public String getUrl() {
        return url;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    @Override
    public String toString() {
        return "HandlerKey [url=" + url + ", requestMethod=" + requestMethod + "]";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof final HandlerKey that)) return false;
        return Objects.equals(url, that.url) && requestMethod == that.requestMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, requestMethod);
    }
}
