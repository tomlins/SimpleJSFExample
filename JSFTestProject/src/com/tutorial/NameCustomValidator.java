package com.tutorial;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.tutorial.NameCustomValidator")
public class NameCustomValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent comp, Object obj)
			throws ValidatorException {
		
		// TODO Auto-generated method stub
    	System.out.println("We are in NameCustomValidator");
    	if(((String)obj).equalsIgnoreCase("jason")) {
  	    	FacesMessage msg =  new FacesMessage("Name validation failed.", "Jason is banned!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
    	}

	}

}
