package com.bratablessza.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bratablessza.model.bensinEntity;
import com.bratablessza.repositories.BensinRepository;

@RestController
@RequestMapping(value ="bensin")
public class BensinController {
	@Autowired
	BensinRepository bensinRepo;
	
	@PostMapping(value = "insert")
	public String postData(@RequestBody bensinEntity bensin) {
		bensinRepo.save(bensin);
		return "Produk bensin berhasil ditambahkan";
	}
	
	@GetMapping(value ="index")
	public List<bensinEntity> tampilAllData(){
		return bensinRepo.findAll();
	}
	
	@GetMapping(value ="getById/{id}")
	public Optional<bensinEntity> getByID(@PathVariable(value = "id" ) Long id) {
		return bensinRepo.findById(id);
	}
	
	@GetMapping(value = "getByPerusahaan/{perusahaan}")
	public List<bensinEntity> getDataByPerusahaan(@PathVariable String perusahaan){
		return bensinRepo.findByPerusahaan(perusahaan);
	}
	
	@GetMapping(value = "getByOktan/{oktan}")
	public List<bensinEntity> getDataByPerusahaan(@PathVariable int oktan){
		return bensinRepo.findByOktan(oktan);
	}
	
//	@Transactional
	@GetMapping(value = "getByNama-Perusahaan")
	public List<bensinEntity> getBensinByPerusahaan(@RequestParam(value = "nama") String nama, @RequestParam (value = "perusahaan") String perusahaan){
		return bensinRepo.findByNamaAndPerusahaan(nama, perusahaan);
	}
	
	@PostMapping(value ="update")
	public String UpdateData(@RequestBody bensinEntity data) {
		 bensinRepo.save(data);
		 return  "Data bensin berhasil diubah";
	}
	
	@Transactional
	@PostMapping(value = "deleteByNama-Perusahaan")
	public String deleteNamadanPerusahaan(@RequestParam(value = "nama") String nama, @RequestParam(value = "perusahaan") String perusahaan) {
		bensinRepo.removeByNamaOrPerusahaan(nama, perusahaan);
		return " Produk bensin " + perusahaan +" "+ nama + " Berhasil dihapus";
	}
	
}
