/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entities.Dealer;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author maharaja
 */
@Local
public interface adminBeanLocal {

    /*  ==== dealer table ====    */
    void addDealer(String name, String address, String phonenumber, String email);

    void updateDealer(Integer id, String name, String address, String phonenumber, String email);

    void deleteDealer(Integer id);

    Dealer findDealerById(Integer id);
    Dealer findDealerByName(String name);
    
    
    Collection<Dealer> getAllDealers();

}
