package training.java8.templateMethod.deathOfTemplate;

import training.java8.templateMethod.JobParameters;
import training.java8.more.fake.Autowired;
import training.java8.more.fake.Service;

@Service
public class JobLauncher {

	@Autowired
	private Job1 job1;
	
	@Autowired
	private Job2 job2;
	
	public void start(String jobName, JobParameters params) {
		switch (jobName) {
		case "job1": job1.start(params); break;
		case "job2": job2.start(params); break;
		}
	}
}
