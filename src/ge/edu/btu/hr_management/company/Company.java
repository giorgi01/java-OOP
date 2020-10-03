package ge.edu.btu.hr_management.company;

abstract public class Company {
    private String companyName;
    private String companyIndustry;

    public Company() {}

    public Company(String companyName, String companyIndustry) {
        this.companyName = companyName;
        this.companyIndustry = companyIndustry;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyIndustry(){
        return this.companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry){
        this.companyIndustry = companyIndustry;
    }

}
