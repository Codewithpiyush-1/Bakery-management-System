package com.BMS.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.BMS.Entity.Bakery;

public interface BakeryRepository extends JpaRepository<Bakery, Long> {

}
