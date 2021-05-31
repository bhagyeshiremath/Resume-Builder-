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

    public resume (String Name , String EmailId , int ContactNo )
    {
        this.Name = Name;
        this.EmailId = EmailId;
        this.ContactNo = ContactNo;
        //this.GithubURL = GithubURL;
        //this.LinkedinURL = LinkedinURL;
        //this.Website = Website;
        //this.CareerObjective = CareerObjective;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getEmailId()
    {
        return EmailId;
    }

    public void setEmailId(String EmailId)
    {
        this.getEmailId = getEmailId;
    }

    public int getContactNo()
    {
		return ContactNo;
	}

    public void setContactNo(int ContactNo)
    {
        this.ContactNo = ContactNo;
    }

    public String getGithubURL() 
    {
		return GithubURL;
	}

    public void setGithub(String GithubURL)
    {
		this.GithubURL = GithubURL;
	}


    public String getLinkedinURL() 
    {
		return LinkedinURL;
	}

    public void setLinkedin(String Linkedin)
    {
		this.linkedin = linkedin;
	}

    public String getWebsite()
    {
        return Website;
    }

    public void setWebsite(String Website) 
    {
		this.Website = Website;
	}
}
