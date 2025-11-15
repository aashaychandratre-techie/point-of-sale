package com.aashay.pos.controller;

import com.razorpay.RazorpayException;
import com.aashay.pos.io.OrderResponse;
import com.aashay.pos.io.PaymentRequest;
import com.aashay.pos.io.PaymentVerificationRequest;
import com.aashay.pos.io.RazorpayOrderResponse;
import com.aashay.pos.service.OrderService;
import com.aashay.pos.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}
