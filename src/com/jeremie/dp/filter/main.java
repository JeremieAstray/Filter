package com.jeremie.dp.filter;

public class main {

	public static void main(String[] args) {
		String msg = "大家好:),<script>敏感，wtf!";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new SensitiveFilter());
		
		fc.addFilter(new HTMLFilter())
		.addFilter(fc2)
		.addFilter(new FaceFilter());
		
		mp.setFc(fc);
		
		String result = mp.process();
		System.out.println(result);
		
	}

}
