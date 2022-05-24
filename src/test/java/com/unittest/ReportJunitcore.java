package com.unittest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ReportJunitcore {

	@Test
	public void tcres() {
		Result r = JUnitCore.runClasses(Sample.class, Sam1.class);
		System.out.println("Total no of tc:" + (r.getRunCount() + r.getIgnoreCount()));
		System.out.println("Run count:" + r.getRunCount());
		System.out.println("Failure count:" + r.getFailureCount());
		System.out.println("Ignore count:" + r.getIgnoreCount());
		System.out.println("Passed count:" + (r.getRunCount() - r.getFailureCount()));

		List<Failure> fails = r.getFailures();

		for (Failure x : fails) {
			System.out.println(x);
		}

	}

}
