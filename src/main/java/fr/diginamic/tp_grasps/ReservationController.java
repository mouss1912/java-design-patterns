package fr.diginamic.tp_grasps;


import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;


public class ReservationController {

	/** DAO permettant d'accéder à la table des clients */
	private InterfaceReservationBeans reservationBeans = new ReservationBeans();

	
	/** DAO permettant d'accéder à la table des types de réservation */
	
	public Reservation creerReservation(Params params) {
		
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();
		
		return ReservationBeans.getReservation(identifiantClient, typeReservation, dateReservationStr, nbPlaces);
		
	}



	
}
