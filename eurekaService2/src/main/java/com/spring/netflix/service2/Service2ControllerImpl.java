package com.spring.netflix.service2;

import com.spring.netflix.service2.api.Service2Controller;
import com.spring.netflix.service2.api.Service2Pojo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Service2ControllerImpl implements Service2Controller {

    @Override
    @RequestMapping("/service2")
    public @ResponseBody
    Service2Pojo getSomePojo() {
        System.out.println("Received request");
        return new Service2Pojo("Hello from the other side!");
    }

}
