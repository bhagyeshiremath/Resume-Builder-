public class total; 
{
	private Resume resume ;
	private ArrayList<Education> education;
	private ArrayList<Project> projects;

    public Resume getresume() 
    {
		return resume;
	}

	public void setHeader(Header header) 
    {
		this.header = header;
	}

	public ArrayList<Education> getEducation() 
    {
		return education;
	}

	public void setEducation(ArrayList<Education> education) 
    {
		this.education = education;
	}

	public ArrayList<Project> getProjects() 
    {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
}
