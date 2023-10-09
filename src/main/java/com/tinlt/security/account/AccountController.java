package com.tinlt.security.account;

import com.tinlt.security.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @GetMapping("gets")
    public ResponseEntity<List<User>> getAll(){
        try {

        }catch (Exception e){

        }
        return ResponseEntity.ok(accountService.getAll());
    }
}
