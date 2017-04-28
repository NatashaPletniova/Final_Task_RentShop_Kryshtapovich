package by.epam.rentshopweb.usertag;

import java.io.IOException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

import by.epam.rentshopweb.bean.entity.ProductItem;
import by.epam.rentshopweb.bean.listbean.JSPListBean;

public class ProductDetailsTableTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	private String productItemID;
	private String manufacturingYear;
	private String itemNote;
	private String wearRate;
	private JSPListBean items;

	public int doStartTag() throws JspTagException {

		if (items.getSize() == 0) {
			try {
				pageContext.getOut().write("<p> There are no items matched to this product.</p>");
				return SKIP_BODY;
			} catch (IOException e) {
				throw new JspTagException(e.getMessage());
			}
		} else {
			int size = new Integer(items.getSize());
			try {
				pageContext.getOut().write("<table border='1' cellpadding='5' cellspacing='3'>");
				pageContext.getOut().write("<tr><th>");
				pageContext.getOut().write("#" + "</th>");

				pageContext.getOut().write("<th>" + productItemID + "</th>");
				pageContext.getOut().write("<th>" + manufacturingYear + "</th>");
				pageContext.getOut().write("<th>" + itemNote + "</th>");
				pageContext.getOut().write("<th>" + wearRate + "</th>");
				pageContext.getOut().write("</th></tr>");

				for (int i = 0; i < size; i++) {
					ProductItem item = (ProductItem) items.getElement();
					pageContext.getOut().write("<tr>");
					pageContext.getOut().write("<td>");
					pageContext.getOut().write(new Integer(i + 1).toString());
					pageContext.getOut().write("</td>");
					pageContext.getOut().write("<form action='Controller' method='get' name='book-product-item'>");
					pageContext.getOut().write("<input type='hidden' name='command' value='book-product-item' />");
					pageContext.getOut().write("<input type='hidden' name='productItemID' value='"
							+ Integer.valueOf(item.getProductItemID()).toString() + "'/>");

					pageContext.getOut().write("<td align='center'>");
					pageContext.getOut().write(Integer.valueOf(item.getProductItemID()).toString());
					pageContext.getOut().write("</td>");
					pageContext.getOut().write("<td align='center'>");
					pageContext.getOut().write(Integer.valueOf(item.getManufacturingYear()).toString());
					pageContext.getOut().write("</td align='center'>");
					pageContext.getOut().write("<td align='center'>");
					String note = null;
					if (item.getItemNote() == null) {
						note = "No notes.";
					} else {
						note = item.getItemNote();
					}
					pageContext.getOut().write(note);
					pageContext.getOut().write("</td>");
					pageContext.getOut().write("<td align='center'>");
					pageContext.getOut().write(Integer.valueOf(item.getWearRate()).toString());
					pageContext.getOut().write("</td>");
					pageContext.getOut().write("<td>");

					pageContext.getOut().write("<button type='submit' style='top:0px; left:0px;'>Rent</button>");
					pageContext.getOut().write("</form>");
					pageContext.getOut().write("</tr>");
				}
				pageContext.getOut().write("</tr>");
				pageContext.getOut().write("</table>");
			} catch (IOException e) {
				throw new JspTagException(e.getMessage());
			}
		}
		return SKIP_BODY;
	}

	public String getProductItemID() {
		return productItemID;
	}

	public void setProductItemID(String productItemID) {
		this.productItemID = productItemID;
	}

	public String getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(String manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public String getItemNote() {
		return itemNote;
	}

	public void setItemNote(String itemNote) {
		this.itemNote = itemNote;
	}

	public String getWearRate() {
		return wearRate;
	}

	public void setWearRate(String wearRate) {
		this.wearRate = wearRate;
	}

	public JSPListBean getItems() {
		return items;
	}

	public void setItems(JSPListBean items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
