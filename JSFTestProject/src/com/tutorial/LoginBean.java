package com.tutorial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1922305136989288990L;
	
	private String name;
    private String password;    

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (final String password) {
        this.password = password;
    }
    
    public String getErrMessage() {
    	return "Required field missing";
    }
    
    public void nameChangeListener() {
    	System.out.println("We are in nameChangeListener");
    }
        
    public String checkCredentials() {
    	System.out.println("We are in checkCredentials");
    	
    	// TODO: We would verify username and password here
    	
    	// Return the page to navigate to, i.e. welcome.xhtml
    	return "welcome";
    }
	
	private String selectedUser;
	private ArrayList<String> myUsers;
	
	public ArrayList<String> getMyUsers()throws Exception {
		myUsers = new ArrayList<String>();
		myUsers.add("Jason");
		myUsers.add("Amanda");
		myUsers.add("Nathan");
		myUsers.add("Jade");	    
	    return myUsers;
	}

	public String getSelectedUser() throws Exception {
	     if (this.selectedUser==null)
	    	 return this.getMyUsers().get(0);

	     return this.selectedUser;  
	}


	public void setSelectedUser(String s) {
	    this.selectedUser = s;
	}	
    
	
		
	/*
	 * These items populate the SelectedManyCheckbox component
	 */
	private SelectItem[] myItems = {
		new SelectItem("Phone","Phone"),
		new SelectItem("Laptop","Laptop"),
		new SelectItem("Poo","Poo"),
		new SelectItem("Ants","Ants")
	};
	
    /*
     * Return the items for the SelectedManyCheckbox
     */
    public SelectItem[] getMyItems() {
        return myItems;
    }
    
	/*
	 * This holds the items selected from the SelectedManyCheckbox by the user
	 */
    private Set<String> items = new TreeSet<String>();
	
    /*
     * set the items selected by the user from the SelectedManyCheckbox
     */
    public void setItems(Set<String> items) {
        this.items = items;
    }     

    /*
     * Return the items from the SelectedManyCheckbox selected by the user
     */
    public Set<String> getItems() {
        return items;
    }
}