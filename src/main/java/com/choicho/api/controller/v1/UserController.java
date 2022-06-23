package com.choicho.api.controller.v1;

import com.choicho.api.entity.User;
import com.choicho.api.repository.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "v1")
public class UserController {
    private final UserJpaRepo userJpaRepo;

    @GetMapping(value = "/user")
    public List<User> findAllUser() {
        return userJpaRepo.findAll();
    }

    @PostMapping(value = "/user")
    public User save(@RequestBody User user){  // 여기서 User는 Entity 니까 다른 object를 만들어서 사용하는게 좋다
//        User user = User.builder().uid("jy0307@gmail.com").name("junyoung Choi").build();
        return userJpaRepo.save(user);
    }
}
