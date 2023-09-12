package com.example.demo_ramanan.Service;

import com.example.demo_ramanan.Entity.MarksEntity;
import com.example.demo_ramanan.Repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    @Autowired
    private MarksRepository marksRepositoryObj;

    public void SaveMarks(MarksEntity marksEntityObj) {
        marksRepositoryObj.save(marksEntityObj);
    }

    public List<MarksEntity> marksEntityList(){
        return marksRepositoryObj.findAll();
    }
}