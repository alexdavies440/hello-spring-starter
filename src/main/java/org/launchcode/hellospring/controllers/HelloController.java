package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

@Controller
@ResponseBody
@RequestMapping("form")
public class HelloController {

    @GetMapping
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label>Name: " +
                "<input type='text' name='user'>" +
                "</label>" +
                //"<label>Language: " +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='welsh'>Welsh</option>" +
                "<option value='italian'>Italian</option>" +
                //"</label>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping
    public static String createMessage(String user) {
        return "Hello, " + user + "!";
    }

}
