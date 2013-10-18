package com.jeremie.dp.filter;

public class main {

	public static void main(String[] args) {
		
		String msg = "大家好:),<script>敏感，wtf!";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		
		FilterChain fc = new FilterChain();
		
		fc.addFilter(new HTMLFilter())
		.addFilter(new FaceFilter());
		
		fc.doFilter(request, response);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
		
	}

}
