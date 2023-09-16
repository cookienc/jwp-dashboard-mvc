package com.techcourse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webmvc.org.springframework.web.servlet.ModelAndView;

public interface HandlerAdaptor {

    boolean supports(final Object handler);

    ModelAndView handle(final Object controller, final HttpServletRequest request, final HttpServletResponse response) throws Exception;
}
