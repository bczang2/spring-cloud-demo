package com.yz.cloud.service.imp;

import com.yz.cloud.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

    @Override
    public String test() {
        return "OK";
    }
}
