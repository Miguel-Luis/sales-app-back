package com.sales.app.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "payment_methods")
public class Payment_Method {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment_method")
    private Integer idPaymentMethod;

    private String name;

    private Boolean status;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Sale> sales;

    public Integer getIdProduct() {
        return idPaymentMethod;
    }

    public void setIdProduct(Integer idProduct) {
        this.idPaymentMethod = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getIdPaymentMethod() {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod(Integer idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
