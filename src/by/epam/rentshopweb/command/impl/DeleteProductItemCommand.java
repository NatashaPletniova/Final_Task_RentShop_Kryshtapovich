package by.epam.rentshopweb.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
import by.epam.rentshopweb.service.ServiceFactory;
import by.epam.rentshopweb.service.exception.ServiceException;

public class DeleteProductItemCommand implements Command {
	private final static String MAKE_DELETION_PAGE_URL = "Controller?command=go-to-make-deletion-page";
	private final static String GO_TO_ERROR_PAGE_URL = "Controller?command=go-to-error-page";
	private final static String PRODUCT_ITEM_ID = "productItemID";

	@Override

	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {

		String productID = request.getParameter(PRODUCT_ITEM_ID);

		ServiceFactory factory = ServiceFactory.getInstance();
		try {
			factory.getRentShopService().deleteProductItemByID(Integer.valueOf(productID));

		} catch (ServiceException e) {

			return GO_TO_ERROR_PAGE_URL;
		}
		return MAKE_DELETION_PAGE_URL;

	}

}
