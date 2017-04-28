package by.epam.rentshopweb.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.rentshopweb.bean.entity.ProductItem;
import by.epam.rentshopweb.bean.listbean.JSPListBean;
import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
import by.epam.rentshopweb.controller.PageName;
import by.epam.rentshopweb.service.ServiceFactory;
import by.epam.rentshopweb.service.exception.ServiceException;

public class ShowAvailableItemCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		List<ProductItem> itemList = null;
		String page = null;

		String[] tokens = request.getParameter("product").split("-");
		ServiceFactory factory = ServiceFactory.getInstance();
		int productId = Integer.valueOf(tokens[0]);

		int status = 0;
		int availableQuantity = Integer.valueOf(tokens[2]);

		try {
			itemList = factory.getRentShopService().showProductItemAvailability(productId, status, availableQuantity);
		} catch (ServiceException e) {

			page = PageName.ERROR_PAGE;
			return page;

		}

		JSPListBean jspList = new JSPListBean(itemList);

		if (!itemList.isEmpty()) {

			request.setAttribute("productName", itemList.get(0).getName());
			request.setAttribute("basePrice", itemList.get(0).getProductBasePrice());
			request.setAttribute("items", jspList);

			return PageName.ALL_ITEM_PAGE;
		} else {
			page = PageName.ERROR_PAGE;
			return page;
		}
	};

}
