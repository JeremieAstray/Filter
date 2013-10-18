package com.jeremie.dp.filter;

public interface Filter {
	
	public void doFilter(Request request,Response response,FilterChain chain);
}
