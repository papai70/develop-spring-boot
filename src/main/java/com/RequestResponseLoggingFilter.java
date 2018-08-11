package com;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class RequestResponseLoggingFilter extends OncePerRequestFilter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("00000000");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		System.out.println("Logging Request  {} : {}"+ req.getMethod()+ req.getRequestURI());
		chain.doFilter(request, response);
		System.out.println("1111111111111");
		System.out.println("Logging Response :{}"+ res.getContentType()+res.toString());
	}

	// other methods
}