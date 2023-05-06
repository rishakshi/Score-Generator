package score.generator;

import java.sql.*;

public class ConnectJDBC {
    
    Connection c;
    Statement s;
    ConnectJDBC(){
        
        try{
        
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_score","root","zxc@7410");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }    
            
    }   
    
}
