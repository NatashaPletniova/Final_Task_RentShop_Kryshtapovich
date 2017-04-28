package by.epam.rentshopweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.rentshopweb.command.exception.CommandException;

public interface Command {

	String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException;

}
