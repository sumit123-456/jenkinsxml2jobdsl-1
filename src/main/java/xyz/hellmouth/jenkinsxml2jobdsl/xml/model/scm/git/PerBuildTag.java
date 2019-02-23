package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.scm.git;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class PerBuildTag implements Buildable{

	@Override
	public void build(Builder builder) {
		builder.createMethod("perBuildTag").endMethod();
		
	}

}
