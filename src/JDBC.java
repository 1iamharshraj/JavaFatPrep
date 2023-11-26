import java.sql.*;
import java.util.Scanner;

class Stu {
    String name;
    int regNum;
    double cgpa;
    int age;
    boolean isHosteller;
    int year;

    public Stu(String name, int regNum, double cgpa, int age, boolean isHosteller, int year) {
        this.name = name;
        this.regNum = regNum;
        this.cgpa = cgpa;
        this.age = age;
        this.isHosteller = isHosteller;
        this.year = year;
    }
}

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER= "root";
    private static final String PASSWORD = "Notebook#$1308";

    public static void createTable(Connection con) throws SQLException{
        String createTable = "CREATE TABLE IF NOT EXISTS STUDENTS(NAME VARCHAR(255),REGISTERNUMBER INT,CGPA DOUBLE,AGE INT,ISHOSTELLER BOOLEAN,YEAR INT);";
        PreparedStatement preparedStatement = con.prepareStatement(createTable);
        preparedStatement.executeUpdate();
    }
    public static void insertStudent(Connection con,Stu s) throws SQLException{
        String insert = "INSERT INTO STUDENTS(NAME,REGISTERNUMBER,CGPA,AGE,ISHOSTELLER,YEAR) VALUES(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(insert);
        preparedStatement.setString(1, s.name);
        preparedStatement.setInt(2, s.regNum);
        preparedStatement.setDouble(3, s.cgpa);
        preparedStatement.setInt(4, s.age);
        preparedStatement.setBoolean(5, s.isHosteller);
        preparedStatement.setInt(6, s.year);
        preparedStatement.executeUpdate();
    }
    /*
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
        System.out.println(resultSet.getString("name"));
    }

     */


    public static void main(String[] args) throws SQLException {
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            createTable(connection);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of student: ");
            int n = sc.nextInt();

            Stu[] stu = new Stu[n];
            for(int i = 0 ; i < n ; i++){
                System.out.println("Enter details for student " + (i + 1));
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Register Number: ");
                int registerNumber = sc.nextInt();
                System.out.print("CGPA: ");
                double cgpa = sc.nextDouble();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Dayscholar (true/false): ");
                boolean isDayscholar = sc.nextBoolean();
                System.out.print("Year: ");
                int year = sc.nextInt();
                stu[i] = new Stu(name, registerNumber, cgpa, age, isDayscholar, year);
                insertStudent(connection,stu[i]);

            }

    }
}