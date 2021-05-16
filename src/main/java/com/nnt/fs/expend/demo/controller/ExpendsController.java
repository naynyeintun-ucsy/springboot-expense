package com.nnt.fs.expend.demo.controller;

import com.nnt.fs.expend.demo.model.entity.Expends;
import com.nnt.fs.expend.demo.service.ExpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpendsController {

    @Autowired
    ExpendService expendService;


    @CrossOrigin
    @GetMapping (value = "/expends")
    public List<Expends>  findAll(){
        return expendService.findAll();
    }

    @CrossOrigin
    @PostMapping ( value = "/expend")
    public Expends save(@RequestBody Expends expends){
        return expendService.save(expends);
    }

    @CrossOrigin
    @GetMapping (value = "/expend/{id}")
    public Expends findById(@PathVariable long id){
        return expendService.findById(id);
    }

    @CrossOrigin
    @DeleteMapping (value = "expend/{id}")
    public void deleteById(@PathVariable long id){
        expendService.deleteById(id);


    }

    @CrossOrigin
    @PutMapping (value = "/expend")
    public Expends updateExpend(@RequestBody Expends expends)
    {
        Expends expends1 = expendService.findById(expends.getId());
        if(expends1 == null){
            return null;
        }
        else {
            expends1.setAmount(expends.getAmount());
            expends1.setDescription(expends.getDescription());
            expends1.setExpends(expends.getExpends());
        }

        return expendService.save(expends);
    }

    
}
