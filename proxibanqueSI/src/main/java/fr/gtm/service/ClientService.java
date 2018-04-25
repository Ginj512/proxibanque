package fr.gtm.service;

import fr.gtm.domaine.Client;

/**
 * @author Stagiaire
 *
 */
public class ClientService {
	
	/**
	 * @paramp Client : correspond � l'objet Client contenant les informations
	 *         rentr�es dans le formulaire.
	 * @param pConseiller
	 *            : correspond au conseiller identifier en session.
	 * @return retourne true si la requete bdd ne retoune pas d'exception (erreur).
	 *         M�thode permettant de cr�er un objet Client en bdd. il est necessaire
	 *         d'avoir egalement le conseiller mis en session.
	 */
	public boolean creationClient(Client pClient, Conseiller pConseiller) {
		// DECLARATION DES VARIABLES LOCALES
		ClientDAO maRefclientDAO = new ClientDAO();

		// appel de la couche DAO
		return maRefclientDAO.creationClient(pClient, pConseiller);
	}

}
