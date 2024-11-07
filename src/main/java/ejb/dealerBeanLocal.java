/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entities.Appointment;
import entities.Cars;
import entities.Inventory;
import java.util.Collection;
import java.util.Date;
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
    /*   ===== Cars Table ======     */
    void addCar(String name, String image, String brand, String category, String description, Integer price, String model, Integer milage, String color, Integer vin, Integer dealerID, String reviewID, Integer inStock);

    void updateCar(Integer id, String name, String image, String brand, String category, String description, Integer price, String model, Integer milage, String color, Integer vin, Integer dealerID, String reviewID, Integer inStock);

    void removeCar(Integer id);
    Cars findCarsById(Integer id);
    Cars findCarsByName(String name);

    Collection<Cars> getAllCarses();
    Collection<Cars> getcaCarsesByDealerId(Integer dealerID);
    Collection<Cars> getCarsesByreviewId(Integer reviewID);

    /*    === Inventory Table ======     */
    void addInventory(Integer carID, Integer dealerID, Integer quantity, Date dateAdded);

    void updateInventory(Integer id, Integer carID, Integer dealerID, Integer quantity, Date dateAdded);

    void deleteInventory(Integer id);
    
    Inventory finInventoryById(Integer id);
            

    Collection<Inventory> getAllInventorys();
    Collection<Inventory> getInventorysByCarId(Integer carID);
    Collection<Inventory> getInventorysByDealerId(Integer dealerID);

    /*  === appointment table ====    */
    void addAppointment(Integer userID, Integer dealerID, Integer carID, Date appointmentDate, Date appointmentTime);

    void updateAppointment(Integer id, Integer userID, Integer dealerID, Integer carID, Date appointmentDate, Date appointmentTime);

    void deleteAppointment(Integer id);
    
    Appointment findAppointmentById(Integer id);

    Collection<Appointment> getAllAppointments();
    Collection<Appointment> getAppointmentsByUserId(Integer userID);
    Collection<Appointment> getAppointmentsByDealerId(Integer dealerID);

}
