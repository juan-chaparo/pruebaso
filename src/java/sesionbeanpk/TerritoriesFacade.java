/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionbeanpk;

import entidades.Territories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jpchaparro
 */
@Stateless
public class TerritoriesFacade extends AbstractFacade<Territories> {

    @PersistenceContext(unitName = "practicadatosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TerritoriesFacade() {
        super(Territories.class);
    }
    
}
