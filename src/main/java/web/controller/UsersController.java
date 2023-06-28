package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
   }

    @GetMapping()
    public String listUser(ModelMap modelMap) {
        modelMap.addAttribute("list",userService.getAllUsers());
        return "getUserList";
    }

    @GetMapping("/create")
    public String newUser(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "create";
    }

    @PostMapping(value = "/create")
    public String newUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/user/";
    }

    @GetMapping(value = "/update/{id}")
    public String editUser(@PathVariable("id") Long id, ModelMap modelMap) {
        modelMap.addAttribute("user", userService.getById(id));
        return "updateUser";
    }

    @PostMapping(value = "/update/{id}")
    public String editUser(@ModelAttribute User user) {
        userService.update(user);
        return "redirect:/user/";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/user/";
    }
}
