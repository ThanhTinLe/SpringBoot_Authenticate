package com.tinlt.security.auth;


import com.tinlt.security.user.User;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    )throws Exception{

        try {
            return ResponseEntity.ok(service.register(request));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody AuthenticationRequest request
    ) throws Exception{
        return ResponseEntity.ok(service.authentication(request));
    }

    @GetMapping("/test")
    public ResponseEntity<List<User>> test(){

        List<User> list = new ArrayList<>();
        list = service.getAll();

        return ResponseEntity.ok(list);
    }


}
