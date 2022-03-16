package com.itwillwork.worker.controller;

import com.itwillwork.worker.dao.UserRepo;
import com.itwillwork.worker.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class MyController {
    @Autowired
    UserRepo userRepo;

    @RequestMapping("")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pages/home.jsp");
        ArrayList<User> users = new ArrayList<User>(){
            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for(User u : this){
                    sb.append(u.getId()+". ");
                    sb.append("name = "+ u.getName() + ", ");
                    sb.append(u.getLocation()+" //");
                    sb.append("\n");
                }
                return sb.toString();
            }
        };
        for (User i:userRepo.findAll()){
            users.add(i);
        }
        mv.addObject("users",users);
        return mv;
    }

    @RequestMapping("/addUser")
    public ModelAndView addComment(User user){
        userRepo.save(user);
        return home();
    }
    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(Long id){
        userRepo.deleteById(id);
        return home();
    }
}
