package by.epam.rentshopweb.controller;

import java.util.HashMap;
import java.util.Map;
import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.CommandName;
import by.epam.rentshopweb.command.impl.AddProductItemCommand;
import by.epam.rentshopweb.command.impl.BookProductItemCommand;
import by.epam.rentshopweb.command.impl.DeleteProductItemByIDCommand;
import by.epam.rentshopweb.command.impl.DeleteProductItemCommand;
import by.epam.rentshopweb.command.impl.GoToAddProductItemCommand;
import by.epam.rentshopweb.command.impl.GoToErrorPageCommand;
import by.epam.rentshopweb.command.impl.GoToMakeDeletionPageCommand;
import by.epam.rentshopweb.command.impl.GoToMakeProductPageCommand;
import by.epam.rentshopweb.command.impl.GoToMakeRentPageCommand;
import by.epam.rentshopweb.command.impl.MakeRentCommand;
import by.epam.rentshopweb.command.impl.RentProductItemCommand;
import by.epam.rentshopweb.command.impl.ShowAvailableItemCommand;
import by.epam.rentshopweb.command.impl.ShowAvailableProductCommand;
import by.epam.rentshopweb.command.impl.ShowProductByNameCommand;
import by.epam.rentshopweb.command.impl.ShowProductForDeletionCommand;

public class CommandProvider {

	private final Map<CommandName, Command> provider = new HashMap<>();

	CommandProvider() {
		provider.put(CommandName.SHOW_PRODUCT_BY_NAME, new ShowProductByNameCommand());
		provider.put(CommandName.SHOW_AVAILABLE_PRODUCTS, new ShowAvailableProductCommand());
		provider.put(CommandName.SHOW_PRODUCT_ITEM_AVAILABILITY, new ShowAvailableItemCommand());
		provider.put(CommandName.BOOK_PRODUCT_ITEM, new BookProductItemCommand());
		provider.put(CommandName.RENT_PRODUCT_ITEM, new RentProductItemCommand());
		provider.put(CommandName.RENT_PRODUCTITEM, new MakeRentCommand());
		provider.put(CommandName.ADD_PRODUCT_ITEM, new AddProductItemCommand());
		provider.put(CommandName.GO_TO_ERROR_PAGE, new GoToErrorPageCommand());
		provider.put(CommandName.GO_TO_MAKE_RENT_PAGE, new GoToMakeRentPageCommand());
		provider.put(CommandName.GO_TO_ADD_PRODUCT_ITEM, new GoToAddProductItemCommand());
		provider.put(CommandName.GO_TO_MAKE_PRODUCT_PAGE, new GoToMakeProductPageCommand());
		provider.put(CommandName.DELETE_PRODUCTITEM_BY_ID, new DeleteProductItemByIDCommand());
		provider.put(CommandName.SHOW_PRODUCTS_FOR_DELETION, new ShowProductForDeletionCommand());
		provider.put(CommandName.DELETE_PRODUCT_ITEM, new DeleteProductItemCommand());
		provider.put(CommandName.GO_TO_MAKE_DELETION_PAGE, new GoToMakeDeletionPageCommand());

	}

	public Command getCommand(String commandName) {
		commandName = commandName.toUpperCase().replaceAll("-", "_");

		Command command = provider.get(CommandName.valueOf(commandName));
		return command;
	}

}
