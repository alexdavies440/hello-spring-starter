package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

@Controller
public class HelloController {
    @GetMapping()
    @ResponseBody
    public String hello() {
        return "root";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring";
    }

    @RequestMapping(value = "hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hellogoodbye() {
        return "Hello Spring. Goodbye Spring.";
    }

   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
   @ResponseBody
   public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
   }

    @GetMapping("hello/{name}")
    @ResponseBody

    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // If no name given, redirects to root
    @GetMapping("hello/")
    public String redirect() {
        return "redirect:/";
    }

    @GetMapping("form")
    @ResponseBody
    public String hellowForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<input type='text' name ='name'>" + //submit request to /hello
                "<input type='submit' value='greet me'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
