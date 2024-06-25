package com.acc.lkm.exceptions;
@SuppressWarnings("serial")
public class InvalidUpdateOperationException extends Exception {
public InvalidUpdateOperationException() {
	super("Entered EmployeeId doesn't exist,Please give a valid EmployeeId to update");
}
}
