package com.jeremie.dp.filter;

public class SensitiveFilter implements Filter {

	public String doFilter(String str) {
		//process the sensitive words
			String r= str.replaceAll("wtf", "***").replaceAll("敏感", "");
		return r;
	}

}
