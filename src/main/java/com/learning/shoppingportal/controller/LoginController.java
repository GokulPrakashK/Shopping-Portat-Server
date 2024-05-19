package com.learning.shoppingportal.controller;

import com.learning.shoppingportal.modal.io.LoginRequest;
import com.learning.shoppingportal.modal.io.LoginResponse;
import com.learning.shoppingportal.modal.io.ResponseWrapper;
import com.learning.shoppingportal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/auth/login")
    public Mono<ResponseWrapper<LoginResponse>> loginUser(@RequestBody LoginRequest loginRequest){
        return loginService.authenticateUser(loginRequest)
                .map(response->new ResponseWrapper<>(true,response,null));
    }

}
