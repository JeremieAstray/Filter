package com.jeremie.dp.filter;

public class FaceFilter implements Filter {

	public String doFilter(String str) {
		String r = str.replace(":)", "^V^");
		return r;
	}

}
