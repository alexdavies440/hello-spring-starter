package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
//

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring";
    }

    @RequestMapping(value = "hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})

    public String hellogoodbye() {
        return "Hello Spring. Goodbye Spring.";
    }

   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")

   public String helloWithQueryParam(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
   }

    @GetMapping("hello/{name}")

    public String helloWithPathParam(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    // If no name given, redirects to root
    @GetMapping("hello/")
    public String redirect() {
        return "redirect:/";
    }

    @GetMapping("form")

    public String helloForm() {
        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Aldo");
        names.add("Lucy");
        names.add("Looney");

        model.addAttribute("names", names);

        return "hello-list";
    }

}
