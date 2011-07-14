package corepharma.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import corepharma.dao.impl.CommandesDAOImpl;
import corepharma.dao.interfaces.CommandesDAO;
import corepharma.domain.Commandes;

public class CommandesAction extends ActionSupport implements ModelDriven<Commandes>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6749059535498385329L;
	
	private CommandesDAO commandesDAO = new CommandesDAOImpl();
	private Commandes commandes;
	private List<Commandes> commandesList = new ArrayList<Commandes>();

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	//@Override
	public Commandes getModel() {
		commandes= new Commandes();
		return commandes;
	}
	
	public String addCommande(){
		System.out.println(commandes.getNumeroCommande());
		try {
			commandesDAO.addCommande(commandes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	

}
