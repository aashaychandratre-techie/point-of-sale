package com.aashay.pos.service;

import com.razorpay.RazorpayException;
import com.aashay.pos.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
