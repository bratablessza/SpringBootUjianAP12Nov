package com.bratablessza.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bratablessza.model.bensinEntity;
@Repository
public interface BensinRepository extends JpaRepository<bensinEntity, Long>{
	
	List<bensinEntity> findByPerusahaan (String perusahaan);
	List<bensinEntity> findByOktan (int oktan);
	List<bensinEntity> findByNamaAndPerusahaan (String nama,String perusahaan);
	String removeByNamaOrPerusahaan (String nama,String perusahaan);
}
