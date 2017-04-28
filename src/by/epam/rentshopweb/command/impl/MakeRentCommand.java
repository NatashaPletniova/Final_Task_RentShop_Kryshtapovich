package by.epam.rentshopweb.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
import by.epam.rentshopweb.service.ServiceFactory;
import by.epam.rentshopweb.service.exception.ServiceException;

public class MakeRentCommand implements Command {
	private final static String GO_TO_RENT_ITEM_URL = "Controller?command=go-to-make-rent-page";
	private final static String GO_TO_ERROR_PAGE_URL = "Controller?command=go-to-error-page";
	private final static String PRODUCT_ITEM_ID = "productItemID";
	private final static String RENT_PERIOD = "rentPeriod";
	private final static String CLIENT_NAME = "clientName";

	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {

		String productItemID = request.getParameter(PRODUCT_ITEM_ID);
		String rentPeriod = request.getParameter(RENT_PERIOD);
		String clientName = request.getParameter(CLIENT_NAME);

		ServiceFactory factory = ServiceFactory.getInstance();
		try {

			factory.getRentShopService().rentProductItem(Integer.valueOf(productItemID), Integer.valueOf(rentPeriod),
					clientName);
		} catch (ServiceException e) {

			return GO_TO_ERROR_PAGE_URL;
		}

		return GO_TO_RENT_ITEM_URL;
	}

}
