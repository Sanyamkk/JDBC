import java.sql.*;
import java.util.*;

public class Update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Sanyam@047972";
        int id;
        String username;
        String s=" update student set name=? where id=?";
        try{
            System.out.println("Enter id whose name need to change :");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter new Name : ");
            username= sc.nextLine();
            Connection con=DriverManager.getConnection(url , user , password);
            PreparedStatement st= con.prepareStatement(s);
            st.setString(1 , username);
            st.setInt(2 , id);
            int cnt=st.executeUpdate();
            System.out.println(cnt+" rows effected : ");
            st.close();
            con.close();

        }catch (Exception e){
            System.out.println("Error : ");

        }


    }
}