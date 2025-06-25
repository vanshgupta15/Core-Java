import java.sql.*;
import java.util.Scanner;
public class StudentMenu 
{
    public static void main(String[] args) throws SQLException 
    {
        Scanner sc= new Scanner(System.in);
        // load the JDBC driver
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            return; // exit if driver not found
        }
        // create connection
        String url = "jdbc:mysql://localhost:3306/students-db"; // replace with your database URL
        String user = "root"; // replace with your database username
        String password = "root"; // replace with your database password
        try (Connection conn = DriverManager.getConnection(url, user, password)) 
        {
            System.out.println("Connected to the database successfully!");
            // create statement
            boolean check=true;
            while(check)
            {
                try (Statement stmt = conn.createStatement())
                {
                    System.out.println("----------Database Access Options----------");
                    System.out.println("1. Add a student");
                    System.out.println("2. Update a student");
                    System.out.println("3. Delete a student");
                    System.out.println("4. View all students");
                    System.out.println("5. Exit");
                    int choice= sc.nextInt();
                    switch(choice)
                    {
                        case 1:
                        {
                            System.out.println("Enter student id: ");
                            int id= sc.nextInt();
                            System.out.println("Enter first name of the student: ");
                            String buffer= sc.next();
                            String first= sc.nextLine();
                            System.out.println("Enter last name of the student: ");
                            String buffer2= sc.next();
                            String last= sc.nextLine();
                            System.out.println("Enter age of the student: ");
                            int age= sc.nextInt();
                            String insertSql = "INSERT INTO student (id, age, first, last) VALUES (?, ?, ?, ?)";
                            PreparedStatement pstmt = conn.prepareStatement(insertSql);
                            pstmt.setInt(1, id);
                            pstmt.setInt(2, age);
                            pstmt.setString(3, first);
                            pstmt.setString(4, last);
                            int rowsInserted = stmt.executeUpdate(insertSql);
                            System.out.println(rowsInserted + " rows inserted");
                        }
                        case 2:
                        {
                            System.out.println("Enter student id to update: ");
                            int id= sc.nextInt();
                            System.out.println("----------Select what to update--------");
                            System.out.println("1. First Name");
                            System.out.println("2. Last Name");
                            System.out.println("3. Age");
                            int updateChoice= sc.nextInt();
                            String updateSql;
                            switch(updateChoice)
                            {
                                case 1:
                                {
                                    System.out.println("Enter new first name: ");
                                    String buffer= sc.next();
                                    String first= sc.nextLine();
                                    updateSql = "UPDATE student SET first = '" + first + "' WHERE id = " + id + ";";
                                    int rowsUpdated = stmt.executeUpdate(updateSql);
                                    System.out.println(rowsUpdated + " rows updated");
                                    break;

                                }
                                case 2:
                                {
                                    System.out.println("Enter new last name: ");
                                    String buffer= sc.next();
                                    String last= sc.nextLine();
                                    updateSql = "UPDATE student SET last = '" + last + "' WHERE id = " + id + ";";
                                    int rowsUpdated = stmt.executeUpdate(updateSql);
                                    System.out.println(rowsUpdated + " rows updated");
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("Enter new age: ");
                                    int age= sc.nextInt();
                                    updateSql = "UPDATE student SET age = '" + age + "' WHERE id = " + id + ";";
                                    int rowsUpdated = stmt.executeUpdate(updateSql);
                                    System.out.println(rowsUpdated + " rows updated");
                                    break;
                                }
                            }
                        }
                        case 3:
                        {
                            System.out.println("Enter the id of the student whom you want to delete: ");
                            int id= sc.nextInt();
                            String updateSql = "DELETE from student WHERE id = " + id + ";";
                            int rowsUpdated = stmt.executeUpdate(updateSql);
                            System.out.println(rowsUpdated + " rows updated");
                            break;
                        }
                        case 4:
                        {
                            String sql = "SELECT * FROM student"; // replace with your SQL query
                            System.out.println("Executing query...");
                            ResultSet rs = stmt.executeQuery(sql);
                            System.out.println("Query executed successfully!");
                            // process the result set
                            while (rs.next()) 
                            {
                                int id = rs.getInt("id"); // replace with your column name
                                String first = rs.getString("first"); // replace with your column name
                                String last = rs.getString("last"); // replace with your column name
                                System.out.println("ID: " + id + ", Name: " + first + " " + last);
                            }
                        }
                        case 5:
                        {
                            check=false;
                        }
                    }
                }
                catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }
}