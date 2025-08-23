package com.kck.ecommerce.dto;

import com.kck.ecommerce.entity.Address;
import com.kck.ecommerce.entity.Customer;
import com.kck.ecommerce.entity.Order;
import com.kck.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
