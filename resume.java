package ResumeBuilder;
import java.util.*;

public class resume
{
    private String Name;
    private String EmailId;
    private int ContactNo;
    private String GithubURL;
    private String LinkedinURL;
    private String Website;
    //private String CareerObjective;

    public resume (String Name , String EmailId , int ContactNo , int GithubURL , LinkedinURL)
    {
        this.Name = Name;
        this.EmailId = EmailId;
        this.ContactNo = ContactNo;
        this.GithubURL = GithubURL;
        this.LinkedinURL = LinkedinURL;
        this.Website = Website;
        //this.CareerObjective = CareerObjective;
    }

    public String getName()
    {
        return Name;
    }

    public String getEmailId()
    {
        return EmailId;
    }

    public int getContactNo()
    {
		return phoneNumber;
	}

    public String getGithubURL() 
    {
		return GithubURL;
	}

    public String getLinkedinURL() 
    {
		return LinkedinURL;
	}

    public String getWebsite()
    {
        return Website;
    }







}