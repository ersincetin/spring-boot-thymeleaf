package com.springbootthymeleaf.springboot.thymeleaf.Controllers;

import com.springbootthymeleaf.springboot.thymeleaf.Business.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WorkerController {
    private IWorkerService workerService;
    @Autowired
    public WorkerController(IWorkerService workerService) {
        this.workerService = workerService;
    }

    @RequestMapping(value = "/")
    public String viewHomePage(Model model) {
        model.addAttribute("allWorkerList",workerService.getAll());
        return "index";
    }
}
