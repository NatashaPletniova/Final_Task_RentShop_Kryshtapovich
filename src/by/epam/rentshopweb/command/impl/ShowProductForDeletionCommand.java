package by.epam.rentshopweb.command.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.rentshopweb.bean.entity.Product;
import by.epam.rentshopweb.bean.listbean.JSPListBean;
import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
import by.epam.rentshopweb.controller.PageName;
import by.epam.rentshopweb.service.ServiceFactory;
import by.epam.rentshopweb.service.exception.ServiceException;

public class ShowProductForDeletionCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		List<Product> productList = null;
		ServiceFactory factory = ServiceFactory.getInstance();

		try {
			productList = factory.getRentShopService().showAllProduct();
		} catch (ServiceException e) {
			return PageName.ERROR_PAGE;
		}
		JSPListBean jspList = new JSPListBean(productList);

		request.setAttribute("products", jspList);

		return PageName.PRODUCT_FOR_ITEM_DELETION_PAGE;

	}

}
