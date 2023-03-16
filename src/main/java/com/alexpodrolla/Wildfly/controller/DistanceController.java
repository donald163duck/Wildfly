package com.alexpodrolla.Wildfly.controller;

import com.alexpodrolla.Wildfly.Model.Distance;
import com.alexpodrolla.Wildfly.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/distance")
public class DistanceController {
    @Autowired
    DistanceService userService;

    @GetMapping("")
    public List<Distance> list() {
        return userService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Distance> get(@PathVariable Integer id) {
        try {
            Distance distance = userService.getDistance(id);
            return new ResponseEntity<Distance>(distance, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Distance>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Distance user) {
        userService.saveDistance(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Distance distance, @PathVariable Integer id) {
        try {
            Distance existUser = userService.getDistance(id);
            distance.setId(id);
            userService.saveDistance(distance);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        userService.deleteDistance(id);
    }
}
