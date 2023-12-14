package com.company.application.controller;

import com.company.commons.props.AppHttpClientsProps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {
    private final AppHttpClientsProps props;

    public Controller(AppHttpClientsProps props) {
        this.props = props;
    }

    @GetMapping("test")
    public String test() {
        return props.getTest().getUrl();
    }

}
