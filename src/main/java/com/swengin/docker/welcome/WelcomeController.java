package com.swengin.docker.welcome;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody WelcomeMessage getWelcome(@RequestParam String name) {
        return new WelcomeMessage("Welcome " + name + "!");
    }
}
