package com.jeremie.dp.filter;

public class HTMLFilter implements Filter {

	public String doFilter(String str) {
		//process the html tag <>
		String r = str.replaceAll("<", "[").replaceAll(">", "]");
		return r;
	}

}
