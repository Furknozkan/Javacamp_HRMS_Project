package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobService;
import kodlamaio.northwind.dataAccess.abstracts.JobDao;
import kodlamaio.northwind.entities.concretes.Job;
@Service
public class JobManager implements JobService{
	private JobDao jobDao;
	
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao=jobDao;
			
	}
	
	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return this.jobDao.findAll();
	}

}
