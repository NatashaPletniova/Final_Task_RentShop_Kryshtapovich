package by.epam.rentshopweb.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.epam.rentshopweb.bean.entity.ProductItem;
import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
import by.epam.rentshopweb.controller.PageName;
import by.epam.rentshopweb.service.ServiceFactory;
import by.epam.rentshopweb.service.exception.ServiceException;

public class BookProductItemCommand implements Command {
	private final static String PRODUCT_ITEM_ID = "productItemID";

	@Override

	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {

		ProductItem item = null;
		String page = null;

		String productItemID = request.getParameter(PRODUCT_ITEM_ID);

		ServiceFactory factory = ServiceFactory.getInstance();
		try {

			item = factory.getRentShopService().showParticularProductItem(productItemID);
		} catch (ServiceException e) {

			page = PageName.ERROR_PAGE;
			return page;

		}

		request.setAttribute("item", item);

		return PageName.BOOK_ITEM_PAGE;

	}
}
