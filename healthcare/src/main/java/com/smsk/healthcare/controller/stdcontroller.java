package com.smsk.healthcare.controller;

import com.smsk.healthcare.entity.std;
import com.smsk.healthcare.service.stdSer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class stdcontroller{



    private final stdSer con;

    @GetMapping("/all")
    public List<std> getall(){
        return con.get();
    }

    @PutMapping("/update")
    public std update(@PathVariable Long id,@RequestBody std new_std){
        return con.update(id,new_std);
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable Long id){
        con.delete(id);
    }
}