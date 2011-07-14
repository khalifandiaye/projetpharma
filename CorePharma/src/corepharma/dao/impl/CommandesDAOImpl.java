package corepharma.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import corepharma.dao.HibernateUtil;
import corepharma.dao.interfaces.CommandesDAO;
import corepharma.domain.Commandes;

public class CommandesDAOImpl implements CommandesDAO {

	//@Override
	public Commandes addCommande(Commandes commande) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(commande);
		session.getTransaction().commit();
		return commande;
	}

	@SuppressWarnings("unchecked")
	//@Override
	public List<Commandes> listCommande() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Commandes> commandesList=null;
		try{
			commandesList = (List<Commandes>)session.createQuery("from User").list();
		}catch (HibernateException e) {
			e.toString();
			session.getTransaction().rollback();
		}
		return commandesList;
	}

}
