package test.springdataredis;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by joshua on 17/3/20.
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String orderNo;
    private double price;
    private Date createDate;

    public Order() {
    }

    public Order(String id, String orderNo, double price, Date createDate) {
        this.id = id;
        this.orderNo = orderNo;
        this.price = price;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                '}';
    }
}
