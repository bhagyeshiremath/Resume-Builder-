package ResumeBuilder;
import java.util.*;

public class total
{
	
	private resume Resume ;
	private ArrayList<education> Education;
	private ArrayList<project> Projects;

    public resume getresume() 
    {
		return Resume;
	}

	public void setresume(resume Resume) 
    {
		this.Resume = Resume;
	}

	public ArrayList<education> getEducation() 
    {
		return Education;
	}

	public void setEducation(ArrayList<education> Education) 
    {
		this.Education = Education;
	}

	public ArrayList<project> getProjects() 
    {
		return Projects;
	}

	public void setProjects(ArrayList<project> Projects) 
	{
		this.Projects = Projects;
	}
}
