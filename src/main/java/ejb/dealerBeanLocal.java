/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;


import entities.Cars;
import java.util.Collection;
import javax.ejb.Local;


/**
 *
 * @author maharaja
 */
@Local
public interface dealerBeanLocal {
    
//     void addSkill(String name, String description, String status);
//
//    void updateSkill(Integer sid, String name, String description, String status);
//
//    void removeSkill(Integer sid);
//
//    boolean findSkillByName(String name);
//
//    Skills findSkillById(Integer id);
//
//    Collection<Skills> getAllSkills();
    
    
//    ===== Cars Table ======
    
    void addCar(String name,String image,String brand,String category,String description,Integer price,String model,Integer milage,String color,Integer vin,Integer dealerID,String reviewID,Integer inStock);
    
    void updateCar(Integer id,String name,String image,String brand,String category,String description,Integer price,String model,Integer milage,String color,Integer vin,Integer dealerID,String reviewID,Integer inStock);
    
    void removeCar(Integer id);
    
    Collection<Cars> getAllCarses();
    
    
    
    
}
