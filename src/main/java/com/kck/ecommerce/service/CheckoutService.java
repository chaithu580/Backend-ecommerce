package com.kck.ecommerce.service;

import com.kck.ecommerce.dto.Purchase;
import com.kck.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
