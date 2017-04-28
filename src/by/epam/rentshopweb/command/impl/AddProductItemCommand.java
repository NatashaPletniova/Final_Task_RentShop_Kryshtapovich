package by.epam.rentshopweb.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
//import by.epam.rentshopweb.controller.PageName;
import by.epam.rentshopweb.service.ServiceFactory;
import by.epam.rentshopweb.service.exception.ServiceException;

public class AddProductItemCommand implements Command {
	private final static String MAKE_PRODUCT_PAGE_URL = "Controller?command=go-to-make-product-page";

	private final static String GO_TO_ERROR_PAGE_URL = "Controller?command=go-to-error-page";

	private final static String PRODUCT_ID = "productID";
	private final static String MANUFACTURING_YEAR = "manufacturingYear";
	private final static String ITEM_NOTE = "itemNote";
	private final static String STATUS = "status";
	private final static String WEAR_RATE = "wearRate";
	private final static String PRODUCT_CATEGORY_ID = "productCategoryID";
	private final static String PRODUCT_NAME = "productName";
	private final static String PRODUCT_BASE_PRICE = "productBasePrice";

	@Override

	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {

		String productID = request.getParameter(PRODUCT_ID);
		String manufacturingYear = request.getParameter(MANUFACTURING_YEAR);
		String itemNote = request.getParameter(ITEM_NOTE);
		String status = request.getParameter(STATUS);
		String wearRate = request.getParameter(WEAR_RATE);
		String productCategoryID = request.getParameter(PRODUCT_CATEGORY_ID);
		String productName = request.getParameter(PRODUCT_NAME);
		String productBasePrice = request.getParameter(PRODUCT_BASE_PRICE);

		Double basePrice = new Double(productBasePrice);

		ServiceFactory factory = ServiceFactory.getInstance();
		try {
			factory.getRentShopService().addProductItem(Integer.valueOf(productID), Integer.valueOf(manufacturingYear),
					itemNote, Integer.valueOf(status), Integer.valueOf(wearRate), Integer.valueOf(productCategoryID),
					productName, basePrice);
		} catch (ServiceException e) {

			return GO_TO_ERROR_PAGE_URL;
		}
		return MAKE_PRODUCT_PAGE_URL;

	}
}
