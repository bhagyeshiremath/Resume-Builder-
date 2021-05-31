package ResumeBuilder;
import java.util.*;

public class education 
{
    private String Qualification;
	private String SchoolName;
    private String University;
    private int Percentage;
	private String PassingYear;
	
    public education (String Qualification , String SchoolName , String University , String PassingYear)
    {
        this.Qualification = Qualification;
        this.SchoolName = SchoolName;
        this.University = University;
        //this.Percentage = Percentage;
        this.PassingYear = PassingYear;
	}

	public String getQualification() 
    {
		return Qualification;
	}

	public void setQualification(String Qualification) 
    {
		this.Qualification = Qualification;
	}

	public String getSchoolName() 
    {
		return SchoolName;
	}

	public void setSchoolName(String SchoolName) 
    {
		this.SchoolName = SchoolName;
	}


	public String getUniversity() 
    {
		return University;
	}

	public void setUniversity(String University) 
    {
		this.University = University;
	}

    public int Percentage() 
    {
		return Percentage;
	}

	public void setPercentage(int Percentage) 
    {
		this.Percentage = Percentage;
	}

    public String getPassingYear() 
    {
		return PassingYear;
	}
	
	public void setPassingYear(String PassingYear) 
    {
		this.PassingYear = PassingYear;
	}
}