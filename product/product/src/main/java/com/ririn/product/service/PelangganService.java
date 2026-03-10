package com.ririn.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ririn.product.repository.PelangganRepository;
import com.ririn.product.model.Pelanggan;

@Service
public class PelangganService {
    @Autowired
    private PelangganRepository pelangganRepository;

    public List<Pelanggan> getAllPelanggan(){
        return pelangganRepository.findAll();
    }

    public Pelanggan getPelangganById(Long Id){
        return pelangganRepository.findById(Id).orElse(null);
    }

    public Pelanggan createPelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }

    public void deletePelanggan(Long Id){
        pelangganRepository.deleteById(Id);
    }
}