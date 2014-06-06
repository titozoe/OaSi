package org.titozoe.oasi.core.service;

import java.util.List;

import org.titozoe.oasi.core.domain.Job;

public interface JobService {
	
	public void add(Job job);

	public void edit(Job job);
	
	public Job fetch(int jobId);

	public Job delete(int jobId);

	public List<Job> search(Job job);

	public List<Job> list();
	
	public int count();	


}
