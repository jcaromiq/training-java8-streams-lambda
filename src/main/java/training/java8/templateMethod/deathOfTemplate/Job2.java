package training.java8.templateMethod.deathOfTemplate;

import training.java8.templateMethod.JobParameters;
import training.java8.more.fake.Service;
import training.java8.templateMethod.JobResults;

@Service
public class Job2 extends BaseJob {

	@Override
	protected JobResults doWork(JobParameters params) {
		System.out.println("Do Job2 with params");
		return JobResults.success();
	}

}
