package com.jeremie.dp.filter;

public class HTMLFilter implements Filter {

	public void doFilter(Request request, Response response,FilterChain chain) {
		//process the html tag <>
		
		request.requestStr = request.requestStr.replaceAll("<", "[").replaceAll(">", "]") + "---HTMLFilter()";
		chain.doFilter(request,response,chain);
		response.responseStr += "---HTMLFilter()";
	}

}
