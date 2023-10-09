package com.tinlt.security.account;

import com.tinlt.security.user.User;
import com.tinlt.security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final UserRepository userRepository;
    public List<User> getAll(){
        List<User> listUser = new ArrayList<>();

        listUser = userRepository.findAll();

        return listUser;

    }
}
