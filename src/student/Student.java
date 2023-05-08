package Student_Registration;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class Student implements  Serializable{

    
    private String Sname;
    private String Fname;
    private String Mname;
    private Date dob;
    private String gender;
    private String mailId;
    private String mobileNo;
    private String password;
    private String rePassword;
    private String encPassword;//Encrypted password
    private String PId;
    private Timestamp addDate;

    public Student() {
    }

    public Student(String Pid,String sname,String fname,String mname, Date dob, String gender, String mailId, String mobileNo, String password, String rePassword) {
        
        this.PId = Pid;
        this.Sname = sname;
        this.Fname = fname;
        this.Mname = mname;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.rePassword = rePassword;
        
       
    }

    public Student( String Pid,String sname,String fname,String mname, Date dob, String gender, String mailId, String mobileNo, String password, String rePassword, Timestamp addDate) {
        
        this.PId = Pid;
        this.Sname = sname;
        this.Fname = fname;
        this.Mname = mname;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.rePassword = rePassword;
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Student{" + ", pid=" + PId+ ", sname=" + Sname+ ", fname=" + Fname + ", mname=" + Mname+ ", dob=" + dob + ", gender=" + gender + ", mailId=" + mailId + ", mobileNo=" + mobileNo + ", password=" + password + ", rePassword=" + rePassword +  '}';
    }

    public String getPid() {
        return PId;
    }

    public void setPid(String Pid) {
        this.PId = Pid;
    }

    public String getName() {
        return Sname;
    }
    public void setName(String name) {
        this.Sname = name;
    }
    
    public String getFName() {
        return Fname;
    }
    public void setFName(String name) {
        this.Fname = name;
    }
    
    public String getMName() {
        return Mname;
    }

    public void setMName(String name) {
        this.Mname = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

   

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public String getEncPassword() {
        return encPassword;
    }

    public void setEncPassword(String encPassword) {
        this.encPassword = encPassword;
    }

}
