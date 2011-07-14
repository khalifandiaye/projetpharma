package corepharma.dao.interfaces;

import java.util.List;

import corepharma.domain.Commandes;

public interface CommandesDAO {

	/**
	 * Ajout d'une commande dans la base
	 * @param commande
	 * @return
	 */
	public Commandes addCommande(Commandes commande);
	
	/**
	 * Lister la liste des commandes
	 * @return
	 */
	public List<Commandes> listCommande();
}
