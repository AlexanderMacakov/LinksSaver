package ru.macakov.linkSaver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.macakov.linkSaver.model.User;
import ru.macakov.linkSaver.services.UserService;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

   @RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView showAll() {
       ModelAndView modelAndView = new ModelAndView("all");
       modelAndView.addObject("users", userService.getAll());
       return modelAndView;
   }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView showAddForm(@ModelAttribute("user") User user) {
        return new ModelAndView("add_form", user.getFirstName() + " " + user.getLastName(), new User());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);

        return "redirect:/";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView showEditForm(@RequestParam(required = true) String login) {

       User user = userService.get(login);
        System.out.println(user);
        return new ModelAndView("add_form", "user", userService.get(login));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam(required = true) String login) {
        userService.remote(login);
        return "redirect:/";
    }


}
