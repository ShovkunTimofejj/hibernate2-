package com.hibernateTwo.dao;

import com.hibernateTwo.domein.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment>{
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
