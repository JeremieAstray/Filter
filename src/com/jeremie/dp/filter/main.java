package com.jeremie.dp.filter;

public class main {

	public static void main(String[] args) {
		
		String msg = "大家好:),<script>敏感，wtf!";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		
		FilterChain fc = new FilterChain();
		
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new SensitiveFilter())
		.addFilter(new HTMLFilter());
		
		fc.addFilter(new HTMLFilter())
		.addFilter(fc2)
		.addFilter(new FaceFilter());
		
		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
		
	}

}
