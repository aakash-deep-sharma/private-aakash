package com.customtag;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class OnlineUserTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		
		PageContext ctx= (PageContext)getJspContext();
		ServletContext sctx = ctx.getServletContext();
		String j =(String) sctx.getAttribute("onlineUser");
		Integer i= Integer.parseInt(j);
		sctx.setAttribute("onlineUser",i+1);
	}
	
}
