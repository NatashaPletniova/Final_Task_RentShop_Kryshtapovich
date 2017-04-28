package by.epam.rentshopweb.usertag;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

import by.epam.rentshopweb.bean.entity.ProductItem;

public class ProductItemRentDetailTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	private String productItemID;
	private String productName;
	private String clientName;
	private String rentPeriod;
	private String pricePerDay;
	private String rentAmount;
	private ProductItem item;

	public int doStartTag() throws JspTagException {

		if (item == null) {
			try {
				pageContext.getOut().write("<p> There are no items matched to this product.</p>");
				return SKIP_BODY;
			} catch (IOException e) {
				throw new JspTagException(e.getMessage());
			}
		} else {
			try {
				pageContext.getOut().write("<table border='1' cellpadding='5' cellspacing='3'>");
				pageContext.getOut().write("<tr><th>");
				pageContext.getOut().write("#" + "</th>");

				pageContext.getOut().write("<th>" + productItemID + "</th>");
				pageContext.getOut().write("<th>" + productName + "</th>");
				pageContext.getOut().write("<th>" + clientName + "</th>");
				pageContext.getOut().write("<th>" + rentPeriod + "</th>");

				pageContext.getOut().write("<th>" + pricePerDay + "</th>");
				pageContext.getOut().write("<th>" + rentAmount + "</th>");

				pageContext.getOut().write("</th></tr>");

				ProductItem rentItem = (ProductItem) item;

				pageContext.getOut().write("<tr>");
				pageContext.getOut().write("<td>");
				pageContext.getOut().write(new Integer(1).toString());
				pageContext.getOut().write("</td>");

				pageContext.getOut().write("<form action='Controller' method='post' name='rent-productitem'>");
				pageContext.getOut().write("<input type='hidden' name='command' value='rent-productitem' />");
				pageContext.getOut().write("<input type='hidden' name='productItemID' value='"
						+ Integer.valueOf(item.getProductItemID()).toString() + "'/>");

				pageContext.getOut().write("<input type='hidden' name='rentPeriod' value='"
						+ Integer.valueOf(item.getRentPeriod()).toString() + "'/>");

				pageContext.getOut().write(
						"<input type='hidden' name='clientName' value='" + item.getClientName().toString() + "'/>");

				pageContext.getOut().write("<td align='center'>");
				pageContext.getOut().write(Integer.valueOf(item.getProductItemID()).toString());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td align='center'>");
				pageContext.getOut().write(rentItem.getName());
				pageContext.getOut().write("</td align='center'>");
				pageContext.getOut().write("<td align='center'>");
				pageContext.getOut().write(rentItem.getClientName());
				pageContext.getOut().write("</td>");
				pageContext.getOut().write("<td align='center'>");
				pageContext.getOut().write(Integer.valueOf(rentItem.getRentPeriod()).toString());
				pageContext.getOut().write("</td>");

				pageContext.getOut().write("<td align='center'>");
				pageContext.getOut().write(rentItem.getPricePerDay().toString());
				pageContext.getOut().write("<td>");

				pageContext.getOut().write(rentItem.getRentAmount().toString());
				pageContext.getOut().write("<td>");
				pageContext.getOut().write("<button type='submit' style='top:0px; left:0px;'>Rent</button>");
				pageContext.getOut().write("</form>");
				pageContext.getOut().write("</tr>");

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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getRentPeriod() {
		return rentPeriod;
	}

	public void setRentPeriod(String rentPeriod) {
		this.rentPeriod = rentPeriod;
	}

	public String getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(String pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public String getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

	public ProductItem getItem() {
		return item;
	}

	public void setItem(ProductItem item) {
		this.item = item;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
