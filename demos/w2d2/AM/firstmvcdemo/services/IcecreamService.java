package com.heidichen.firstmvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heidichen.firstmvcdemo.models.Icecream;
import com.heidichen.firstmvcdemo.repositories.IcecreamRepository;

@Service
public class IcecreamService {

	//OPTION 1
    private final IcecreamRepository icecreamRepo;
    
    public IcecreamService(IcecreamRepository icecreamRepo) {
        this.icecreamRepo = icecreamRepo;
    }
    
    //OPTION 2
//    @Autowired
//    private IcecreamRepository icecreamRepo;
    
    
    // FindAll
    public List<Icecream> allIcecreams(){
    	return icecreamRepo.findAll();
    }
        
    // create
    public Icecream createIcecream(Icecream icecream) {
    	return icecreamRepo.save(icecream);
    }
    
    
    // ShowOne
    
    
    
    // updateOne
    
    // deleteOne
	
}
