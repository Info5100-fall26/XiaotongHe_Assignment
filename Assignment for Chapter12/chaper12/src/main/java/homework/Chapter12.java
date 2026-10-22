package homework;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.sql.*;

public class Chapter12 {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Daisy\\Documents\\NEU\\INFO 5100\\作业\\my_test_file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
            catch(FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter phrase “Java write test” into the file: ");
            String phrase = scanner.nextLine();
            
            try{
                FileWriter myWriter = new FileWriter("C:\\Users\\Daisy\\Documents\\NEU\\INFO 5100\\作业\\my_test_file.txt",true);
                myWriter.write("\n"+phrase);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch(IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            
            scanner.close();

            // Database
            try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world", "root", "SQLpwd123456");
            System.out.println("Connected!");
            con.setAutoCommit(false);

            //read record
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM city where id = 1");
            while(rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getInt("Population"));
            }

            //update record
            int newPopulation = 1800000;
            String sql = "Update city SET Population =" +newPopulation + " WHERE ID = 1";
            int rows = stmt.executeUpdate(sql);
            System.out.println(" Updated Row:" + rows);

            //print updated record
            rs = stmt.executeQuery("SELECT * FROM city where id = 1");
            while(rs.next()){
                System.out.println("updated information:\n" + rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getInt("Population"));
            }

            //Rollback
            con.rollback();
            System.out.println("Rollback successful!");
            rs = stmt.executeQuery("SELECT * FROM city where id = 1");
            while(rs.next()){
                System.out.println("Rollback information:\n" + rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getInt("Population"));
            }

            //close
            rs.close();
            stmt.close();
            con.close();

            //connect to DB
            Connection con2 = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world", "root", "SQLpwd123456");
            System.out.println("Connected again");

            Statement stmt2 = con2.createStatement();
            
            //read record
            rs = stmt2.executeQuery("SELECT * FROM city where id < 5");
            while(rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getInt("Population"));
            }

            //update record
            stmt2.executeUpdate("INSERT INTO city (Name, CountryCode, District, Population) VALUES ('ABC', 'USA', 'California', 80000)");

            //read
            rs = stmt2.executeQuery("SELECT * FROM city where Name = 'ABC'");
            while(rs.next()){
                System.out.println("Inserted information:\n" + rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getString("District") + " " + rs.getInt("Population"));
            }

            //close
            rs.close();
            stmt2.close();
            con2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
}
