package training.java8.templateMethod.birthOfLambdas;

import training.java8.more.fake.Service;
import training.java8.templateMethod.JobParameters;
import training.java8.templateMethod.JobResults;

@Service
public class SimplerJob2 {

	public JobResults doWork(JobParameters params) {
		System.out.println("Do Job2 with params");
		return JobResults.success();
	}

}
