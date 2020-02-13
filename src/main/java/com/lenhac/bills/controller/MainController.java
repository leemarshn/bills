package com.lenhac.bills.controller;

import com.lenhac.bills.model.Bill;
import com.lenhac.bills.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage() {

        return "greetings";
    }


    @Autowired
    private BillService billService;


    @RequestMapping(value = "/createbill", method = RequestMethod.GET)
    public ModelAndView createbill() {
        ModelAndView modelAndView = new ModelAndView();
        Bill bill = new Bill();
        modelAndView.addObject("bill", bill);
        modelAndView.setViewName("createbill");
        return modelAndView;
    }

    @RequestMapping(value = "/createbill", method = RequestMethod.POST)
    public ModelAndView createNewBill(@Valid Bill bill, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
//        Bill billExists = //userService.findUserByEmail(user.getEmail());
//        if (billExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a user registered with the email provided");
//        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("createbill");
        } else {
            //userService.saveUser(user);
            billService.CreateBill(bill);
            modelAndView.addObject("successMessage", "Bill has been registered successfully");
            modelAndView.addObject("bill", new Bill());
            modelAndView.setViewName("createbill");

        }

        return modelAndView;
    }
}
