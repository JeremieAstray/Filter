package com.jeremie.dp.filter;

public class SensitiveFilter implements Filter {

	public void doFilter(Request request, Response response,FilterChain chain) {
		//process the sensitive words
		request.requestStr = request.requestStr.replaceAll("wtf", "***").replaceAll("敏感", "") + "---SensitiveFilter()";
		chain.doFilter(request, response);
		response.responseStr += "---SensitiveFilter()";
	}

}
