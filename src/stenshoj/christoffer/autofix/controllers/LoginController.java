package stenshoj.christoffer.autofix.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import stenshoj.christoffer.autofix.Mechanic;
import stenshoj.christoffer.autofix.login.CheckLogin;
import stenshoj.christoffer.autofix.login.LoginCreater;

@SessionScoped
@ManagedBean
public class LoginController {
	Mechanic mechanic;
	CheckLogin checker = new CheckLogin();
	LoginCreater creater = new LoginCreater();
	public String checkLogin(String username, String password) {
		mechanic = new Mechanic();
		mechanic.setUsername(username);
		mechanic.setPassword(password);
		return checker.check(mechanic);
	}
	
	public String createLogin(String username, String password) {
		mechanic = new Mechanic();
		mechanic.setUsername(username);
		mechanic.setPassword(password);
		return creater.create(mechanic);
	}
	
	public String logout(){
		mechanic = null;
		return "Index";
	}
}