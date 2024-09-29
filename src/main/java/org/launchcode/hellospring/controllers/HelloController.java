package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<label>Name: " +
                "<input type='text' name='name'>" +
                "</label>" +
                //"<label>Language: " +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='welsh'>Welsh</option>" +
                "<option value='italian'>Italian</option>" +
                //"</label>" +
                "<input type='submit' value='Greet me!'" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
