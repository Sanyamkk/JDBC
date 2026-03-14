import java.sql.*;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Sanyam@047972";
        int id;
        String username;
        String s="insert into student values(? , ?)";

        try {
            System.out.println("Enter your user id :");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your username :");
            username=sc.nextLine();
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st=con.prepareStatement(s);
            st.setInt(1 , id);
            st.setString(2 , username);
            int cnt=st.executeUpdate();
            System.out.println(cnt+ " rows effected ");
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// for DML WE USE executeUpdate()