/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author maharaja
 */
@Entity
@Table(name = "order_items")
@NamedQueries({
    @NamedQuery(name = "OrderItems.findAll", query = "SELECT o FROM OrderItems o"),
    @NamedQuery(name = "OrderItems.findByItemId", query = "SELECT o FROM OrderItems o WHERE o.itemId = :itemId"),
    @NamedQuery(name = "OrderItems.findByCarname", query = "SELECT o FROM OrderItems o WHERE o.carname = :carname"),
    @NamedQuery(name = "OrderItems.findByCarpic", query = "SELECT o FROM OrderItems o WHERE o.carpic = :carpic")})
public class OrderItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Size(max = 255)
    @Column(name = "carname")
    private String carname;
    @Size(max = 255)
    @Column(name = "carpic")
    private String carpic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private Collection<Order1> order1Collection;
    @JoinColumn(name = "carid", referencedColumnName = "id")
    @ManyToOne
    private Cars carid;
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    @ManyToOne
    private Order1 orderId;

    public OrderItems() {
    }

    public OrderItems(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarpic() {
        return carpic;
    }

    public void setCarpic(String carpic) {
        this.carpic = carpic;
    }

    public Collection<Order1> getOrder1Collection() {
        return order1Collection;
    }

    public void setOrder1Collection(Collection<Order1> order1Collection) {
        this.order1Collection = order1Collection;
    }

    public Cars getCarid() {
        return carid;
    }

    public void setCarid(Cars carid) {
        this.carid = carid;
    }

    public Order1 getOrderId() {
        return orderId;
    }

    public void setOrderId(Order1 orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItems)) {
            return false;
        }
        OrderItems other = (OrderItems) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OrderItems[ itemId=" + itemId + " ]";
    }
    
}
