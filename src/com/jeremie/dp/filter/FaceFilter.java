package com.jeremie.dp.filter;

public class FaceFilter implements Filter {

	public void doFilter(Request request, Response response,FilterChain chain) {
		request.requestStr = request.requestStr.replace(":)", "^V^") + "---FaceFilter()";
		chain.doFilter(request,response);
		response.responseStr += "---FaceFilter()";
	}

}
