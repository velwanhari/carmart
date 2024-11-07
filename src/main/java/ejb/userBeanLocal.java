/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entities.Order1;
import entities.OrderItems;
import entities.Payment;
import entities.Review;
import entities.User;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author maharaja
 */
@Local
public interface userBeanLocal {

    /*   ====   user ====  */
    void addUser(String name, String email, String password, String address, String phonenumber);

    void updateUser(Integer id, String name, String email, String password, String address, String phonenumber);

    void deleteUser(Integer id);

    User findUserById(Integer id);

    User findUserByName(String name);

    User FindUserByEmail(String email);

    Collection<User> getAllUsers();

    /*   ====   review =====    */
    void addReview(Integer carID, Integer userID, Integer rating, String comment, Date reviewDate);

    void updateReview(Integer id, Integer carID, Integer userID, Integer rating, String comment, Date reviewDate);

    void removeReview(Integer id);

    Review findReviewById(Integer id);

//     Collection<Candidates> getCandidatesByJobId(Integer jid);
//    Collection<Candidates> getCandidatesByUserId(Integer uid);
    Collection<Review> getAllReviews();

    Collection<Review> getReviewsByCarId(Integer carID);

    Collection<Review> getReviewsByUserId(Integer userID);

    /*    === payment ====    */
    void addPayment(Integer orderID, Integer paymentAmount, Date paymentDate, String paymentMethod);

    void updatePayment(Integer id, Integer orderID, Integer paymentAmount, Date paymentDate, String paymentMethod);

    void deletePayment(Integer id);

    Payment findPaymentById(Integer id);

    Collection<Payment> getAllPayments();

    /* ==== order ====    */
    void addOrder(Integer carID, Integer userID, Integer itemID, String shippmentAddress, Integer shippingPrice, Integer totalPrice, Date orderDate, Integer isPaid, Date paidAt, Integer isDelivered, String deliveredAt);

    void updateOrder(Integer id, Integer carID, Integer userID, Integer itemID, String shippmentAddress, Integer shippingPrice, Integer totalPrice, Date orderDate, Integer isPaid, Date paidAt, Integer isDelivered, String deliveredAt);

    void deleteOrder(Integer id);
    
    Order1 getOrder1byId(Integer id);

    Collection<Order1> getAllOrder1s();
    Collection<Order1> getOrder1sByCarId(Integer carID);
    Collection<Order1> getOrder1sByUserId(Integer userID);
    

    /*   === order item === */
    void addOrderItem(Integer order_id, Integer carid, String carname, String carpic);

    void updateOrderItem(Integer item_id, Integer order_id, Integer carid, String carname, String carpic);

    void deleteOrderItem(Integer item_id);
    
    OrderItems getOrderItemsById(Integer item_id);

    Collection<OrderItems> getOrderItemses();
    Collection<OrderItems> getOrderItemsesByOrderId(Integer order_id);

}
