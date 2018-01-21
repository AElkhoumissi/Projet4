package amine.elkhoumissi.gestionProjets.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import amine.elkhoumissi.gestionProjets.entities.Message;


/*
 * Réalisé par: AMINE EL KHOUMISSI
 */

public interface MessageRepository extends JpaRepository<Message, Long> {

}
