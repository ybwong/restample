/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packpub.mmj.restsample.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ybwong
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
