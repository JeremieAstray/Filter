package com.jeremie.dp.filter;

public class MsgProcessor {

	private String msg;
	private FilterChain fc;

	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {
		return fc.doFilter(msg);
	}
}
