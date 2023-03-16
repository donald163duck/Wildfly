package com.alexpodrolla.Wildfly.service;

import com.alexpodrolla.Wildfly.Model.Distance;
import com.alexpodrolla.Wildfly.repository.DistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DistanceService {

    @Autowired
    private DistanceRepository userRepository;
    public List<Distance> listAllUser() {
        return userRepository.findAll();
    }

    public void saveDistance(Distance distance) {
        userRepository.save(distance);
    }

    public Distance getDistance(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteDistance(Integer id) {
        userRepository.deleteById(id);
    }
}
