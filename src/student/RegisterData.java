package Student_Registration;

import Database.ConnectJDBC;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegisterData {

    Connection c = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int st;//status

    public int registerStudent(Student student) {
        c = ConnectJDBC.getConnection();
        try {
            String query = "insert into "
                    + "student_personal_detail"
                    + "(Pid,sname,fname,mname,dob,gender,mailid,mobile_no,password) "
                    + "values(?,?,?,?,?,?,?,?,?)";
            ps = c.prepareStatement(query);
            ps.setString(1, student.getPid());
            ps.setString(2, student.getName());
            ps.setString(3, student.getFName());
            ps.setString(4, student.getMName());
            ps.setDate(5, student.getDob());
            ps.setString(6, student.getGender());
            ps.setString(7, student.getMailId());
            ps.setString(8, student.getMobileNo());
            ps.setString(9, student.getEncPassword());
           
            st = ps.executeUpdate();
            System.out.println("Inserted  student " + st);
        } catch (MySQLIntegrityConstraintViolationException e) {
            /*This exception is throws when user is already 
            registed with same id, mobileno or mail id*/
            e.printStackTrace();
            st = -1;
        } catch (SQLException e) {
            /*Any SqlException occures then this will execute*/
            e.printStackTrace();
            st = -2;
        }
        return st;
    }
}
