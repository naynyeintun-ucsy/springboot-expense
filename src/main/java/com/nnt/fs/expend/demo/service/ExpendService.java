package com.nnt.fs.expend.demo.service;

import com.nnt.fs.expend.demo.model.entity.Expends;
import com.nnt.fs.expend.demo.repository.ExpendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpendService {

    @Autowired
    ExpendsRepository expendsRepository;

    public List<Expends>  findAll(){
        return  expendsRepository.findAll();
    }

    public Expends save(Expends expends){
        return expendsRepository.save(expends);
    }


    public Page<Expends> findAll(Pageable pageable){
        return expendsRepository.findAll(pageable);
    }


    public  void remove(Expends expends){
        expendsRepository.delete(expends);
    }


    public void deleteById(long id){
        if(findById(id)!=null)
        expendsRepository.deleteById(id);
    }

    public Expends findById(long id ){
        return expendsRepository.findById(id).orElse(null);
    }
}
