package corepharma.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginLogoutAction extends ActionSupport implements SessionAware, ServletRequestAware {
	
	private static final long serialVersionUID = 1L;
	private String userLogin, userPassword;//login et password saisis dans le formulaire d'authentification
	private Map session;
	
	/**
	 * @return the userLogin
	 */
	public String getUserLogin() {
		return userLogin;
	}
	/**
	 * @param userLogin the userLogin to set
	 */
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	/**
	 * @return the session
	 */
	public Map getSession() {
		return session;
	}
	/**
	 * @param session the session to set
	 */
	public void setSession(Map session) {
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	public String connexion() throws Exception {
	
		System.out.println("Login saisi : " + userLogin);
		System.out.println("Pass saisi : " + userPassword);

		if (userLogin.compareToIgnoreCase("admin") == 0 && userPassword.compareToIgnoreCase("admin") == 0) {
		      session = ActionContext.getContext().getSession();
		      session.put("userId", 7);
		      session.put("userLogin", userLogin);
		      session.put("categorie", 0);//Super Utilisateur
		      session.put("etatConnexion", "true");//Etat de la connexion; true si connecté sinon false
		      System.out.println("Succes dans la connexion");
		      return SUCCESS;
	    }
	    else{
	    	System.out.println("Echec dans la connexion");
	    	addActionError(getText("login.erreur"));//Message d'erreur.
	    	return ERROR;
	    }
	}
	
	public String deconnexion() throws Exception {

	    session = ActionContext.getContext().getSession();
	    session.remove("userId");
	    session.remove("userLogin");
	    session.remove("categorie");
	    session.remove("etatConnexion");
	    return SUCCESS;
    }
	
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
	}
	
}
