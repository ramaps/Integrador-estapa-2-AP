package DAO;

import integador.Tecnico;
import jakarta.persistence.EntityManager;

public class TecnicoDAOImplement implements TecnicoDAO {

    private EntityManager entityManager;
    @Override
    public void create (Tecnico tecnico){

        entityManager.persist(tecnico);
    }

}
