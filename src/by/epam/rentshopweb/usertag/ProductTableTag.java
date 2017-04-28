  package by.epam.rentshopweb.usertag;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

import by.epam.rentshopweb.bean.entity.Product;
import by.epam.rentshopweb.bean.listbean.JSPListBean;


public class ProductTableTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	
	private JSPListBean list;

	private String colunmName1;
	private String colunmName2;
	private String colunmName3;
	private String colunmName4;
	private String colunmName5;
	
	public int doStartTag() throws JspTagException {
		int size = Integer.valueOf(list.getSize());
		try {
			pageContext.getOut().write("<table border='1' cellpadding='5' cellspacing='3'>");
			pageContext.getOut().write("<tr><th>");
			pageContext.getOut().write("#" +"</th>");
			
			pageContext.getOut().write("<th>" + colunmName1 + "</th>");
			pageContext.getOut().write("<th>" + colunmName2 + "</th>");
			pageContext.getOut().write("<th>" + colunmName3 + "</th>");
			pageContext.getOut().write("<th>" + colunmName4 + "</th>");
			pageContext.getOut().write("<th>" + colunmName5);
			pageContext.getOut().write("</th></tr>");

			for(int i=0; i<size; i++) {
				Product product = list.getElement();
				pageContext.getOut().write("<tr>");
				pageContext.getOut().write("<td>");
				pageContext.getOut().write(Integer.valueOf(i+1).toString());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td>");
				pageContext.getOut()
						.write(Integer.valueOf(product.getProductID()).toString());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td>");
				pageContext.getOut().write(product.getName());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td>");
				pageContext.getOut().write(product.getProductBasePrice().toString());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td>");
				pageContext.getOut().write(Integer.valueOf(product.getQuantity()).toString());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td>");
				pageContext.getOut().write(Integer.valueOf(product.getAvailableQuantity()).toString());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("</tr>");
			}
			pageContext.getOut().write("</tr>");
			pageContext.getOut().write("</table>");
			
		} catch (IOException e) {
			throw new JspTagException(e);
		}
		return SKIP_BODY;
	}
	
	
	public JSPListBean getList() {
		return list;
	}
	public void setList(JSPListBean list) {
		this.list = list;
	}


	public String getColunmName1() {
		return colunmName1;
	}


	public void setColunmName1(String colunmName1) {
		this.colunmName1 = colunmName1;
	}


	public String getColunmName2() {
		return colunmName2;
	}


	public void setColunmName2(String colunmName2) {
		this.colunmName2 = colunmName2;
	}


	public String getColunmName3() {
		return colunmName3;
	}


	public void setColunmName3(String colunmName3) {
		this.colunmName3 = colunmName3;
	}


	public String getColunmName4() {
		return colunmName4;
	}


	public void setColunmName4(String colunmName4) {
		this.colunmName4 = colunmName4;
	}


	public String getColunmName5() {
		return colunmName5;
	}


	public void setColunmName5(String colunmName5) {
		this.colunmName5 = colunmName5;
	}

	}
