package webmvc.org.springframework.web.servlet.mvc.tobe;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webmvc.org.springframework.web.servlet.ModelAndView;

public class HandlerExecution {

    public ModelAndView handle(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
        final ModelAndView modelAndEmptyView = new ModelAndView(null);

        return modelAndEmptyView.addObject("id", request.getAttribute("id"));
    }
}
