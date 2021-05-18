package kodlamaio.northwind.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;


import kodlamaio.northwind.entities.concretes.Job;

@Service
public interface JobService {

	List<Job> getAll();
	
	
	

}
