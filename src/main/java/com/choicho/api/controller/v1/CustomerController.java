package com.choicho.api.controller.v1;

import com.choicho.api.entity.Customer;
import com.choicho.api.repository.CustomerJpaRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"Customer"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class CustomerController {

    private final CustomerJpaRepo customerJpaRepo;

    @ApiOperation(value = "회원 조회", notes = "모든 회원을 조회한다")
    @GetMapping(value = "/customer")
    public List<Customer> findAllUser() {
        return customerJpaRepo.findAll();
    }

    @ApiOperation(value = "회원 입력", notes = "회원을 입력한다.")
    @PostMapping(value = "/customer")
    public Customer save(@ApiParam(value = "회원아이디", required = true) @RequestParam String uid,
                     @ApiParam(value = "회원이름", required = true) @RequestParam String name) {
        Customer user = Customer.builder()
                .uid(uid)
                .name(name)
                .build();
        return customerJpaRepo.save(user);
    }
}
