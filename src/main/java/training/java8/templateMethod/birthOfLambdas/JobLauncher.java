package training.java8.templateMethod.birthOfLambdas;

import training.java8.templateMethod.JobParameters;
import training.java8.more.fake.Autowired;
import training.java8.more.fake.Service;

@Service
public class JobLauncher {

	@Autowired
	private SimplerJob1 job1;
	
	@Autowired
	private SimplerJob2 job2;
	
	@Autowired
	private JobService jobService;
	
	public void start(String jobName, JobParameters params) {
		switch (jobName) {
		case "job1": jobService.start(() -> job1.doWork(params)); break;
		case "job2": jobService.start(() -> job2.doWork(params)); break;
		}
	}
}
