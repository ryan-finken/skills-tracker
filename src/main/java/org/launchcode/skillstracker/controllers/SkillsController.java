package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillsPage() {
        return "<h1>Skills tracker</h1>" +
                "<h2>Here are some skills to learn:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<a href src='./form'>Select some skills to learn</a>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<form action = '/formResults' method = 'post'>" +
                "Name:" +
                "<input type = 'text' name = 'name'><br>" +
                "My favorite language:" +
                "<select name = 'language1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "My second favorite language:" +
                "<select name = 'language2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "My third favorite language:" +
                "<select name = 'language3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit Form'>" +
                "</form>";
    }

    @PostMapping("formResults")
    public String formSent(
            @RequestParam String name,
            @RequestParam String language1,
            @RequestParam String language2,
            @RequestParam String language3
    ) {
        return "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr><th>Language</th></tr>" +
                "<tr><td>" + language1 + "</tr></td>" +
                "<tr><td>" + language2 + "</tr></td>" +
                "<tr><td>" + language3 + "</tr></td>" +
                "</table>";
    }

}
