package com.gyf.service.UserServiceImp;

import com.gyf.mapper.CustomerMapper;
import com.gyf.service.UserService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImp  implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    @Transactional
    public void insert(String username, String tel) {
        customerMapper.insert(username,tel);
    }
}
