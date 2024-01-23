package com.BMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BMS.Entity.Bakery;
import com.BMS.Repo.BakeryRepository;

@Service
public class DataService {
@Autowired
	private BakeryRepository bake;

public void saverOrder(Bakery mek) {
	bake.save(mek);
	
}

public void updateById(Bakery bakk) {
	Bakery bar = bake.findById(bakk.getId()).get();
     bar.setCustName(bakk.getCustName());
     bar.setItems(bakk.getItems());
     bar.setPrice(bakk.getPrice());
     bar.setQuantity(bakk.getQuantity());
     bake.save(bar);
}



public List<Bakery> getAllData() {
	List<Bakery> rajia =bake.findAll();
	return rajia;
}


}
