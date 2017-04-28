package by.epam.rentshopweb.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.rentshopweb.command.Command;
import by.epam.rentshopweb.command.exception.CommandException;
import by.epam.rentshopweb.controller.PageName;

public class GoToMakeRentPageCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {

		return PageName.MAKE_RENT_PAGE;
	}

}
