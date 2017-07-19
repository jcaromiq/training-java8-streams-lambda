package training.java8.templateMethod.birthOfLambdas;

import training.java8.templateMethod.JobParameters;
import training.java8.more.fake.Service;
import training.java8.templateMethod.JobResults;

@Service
public class SimplerJob1 {

	public JobResults doWork(JobParameters params) {
		System.out.println("Do Job1 with params");
		return JobResults.success();
	}

}
