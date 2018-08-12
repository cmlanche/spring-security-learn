package io.bloogle.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by cmlanche on 2018/8/12.
 */
@Component
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("myfilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("begin to do filter");
        long st = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("finish to do filter, cost: " + (System.currentTimeMillis() - st));
    }

    @Override
    public void destroy() {
        System.out.println("my filter destroy");
    }
}
