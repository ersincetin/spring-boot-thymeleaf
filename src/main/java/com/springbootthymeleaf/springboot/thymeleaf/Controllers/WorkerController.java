package com.springbootthymeleaf.springboot.thymeleaf.Controllers;

import com.springbootthymeleaf.springboot.thymeleaf.Business.IWorkerService;
import com.springbootthymeleaf.springboot.thymeleaf.Entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WorkerController {
    private IWorkerService workerService;

    @Autowired
    public WorkerController(IWorkerService workerService) {
        this.workerService = workerService;
    }

    @RequestMapping(value = "/")
    public String viewHomePage(Model model){
        model.addAttribute("allWorkerList", workerService.getAll());
        return "index";
    }
    @RequestMapping(value = "/workerlist")
    public String viewWorkerListPage(Model model) {
        model.addAttribute("allWorkerList", workerService.getAll());
        return "worker_list";
    }

    @RequestMapping(value = "/addworker")
    public String viewAddWorkerPage(Model model) {
        Worker worker = new Worker();
        model.addAttribute("worker", worker);
        return "new_worker";
    }

    @RequestMapping(value = "/save")
    public String saveWorker(@ModelAttribute("worker") Worker worker) {
        workerService.add(worker);
        return "redirect:/";
    }

    @RequestMapping(value = "/updateworker/{id}")
    public String updateWorker(@PathVariable(value = "id") long id, Model model) {
        Worker worker = workerService.getById(id);
        model.addAttribute("worker",worker);
        return "update_worker";
    }

    @RequestMapping(value = "/deleteworker/{id}")
    public String deleteWorker(@PathVariable(value = "id") long id) {
        workerService.delete(id);
        return "redirect:/";
    }
}
