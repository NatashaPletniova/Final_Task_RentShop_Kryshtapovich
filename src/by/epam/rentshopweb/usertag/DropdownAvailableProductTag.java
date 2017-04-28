package by.epam.rentshopweb.usertag;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

import by.epam.rentshopweb.bean.entity.Product;
import by.epam.rentshopweb.bean.listbean.JSPListBean;

public class DropdownAvailableProductTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	private JSPListBean list;

	public int doStartTag() throws JspTagException {
		if (list.getSize() == 0) {
			try {
				pageContext.getOut().write("<p> There are no available product.</p>");
				return SKIP_BODY;
			} catch (IOException e) {
				throw new JspTagException(e.getMessage());
			}
		} else {
			int size = list.getSize();
			try {

				pageContext.getOut().write("<input list='products' name='product'>");

				pageContext.getOut().write("<datalist id='products'>");
				for (int i = 0; i < size; i++) {
					Product currentProduct = list.getElement();

					pageContext.getOut()
							.write("<option value='" + new Integer(currentProduct.getProductID()).toString() + "-"
									+ currentProduct.getName() + "-"
									+ new Integer(currentProduct.getAvailableQuantity()).toString() + "'>");
					pageContext.getOut().write(currentProduct.getName()); 
					pageContext.getOut().write("</option>");
				}
				pageContext.getOut().write("</datalist>");

			} catch (IOException e) {
				throw new JspTagException(e.getMessage());
			}
			return SKIP_BODY;
		}
	}

	public JSPListBean getList() {
		return list;
	}

	public void setList(JSPListBean list) {
		this.list = list;
	}

}
