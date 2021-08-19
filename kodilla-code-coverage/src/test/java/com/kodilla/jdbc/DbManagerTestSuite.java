package com.kodilla.jdbc;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection()); //dodać w build.gradle w dependencies testCompile group: 'junit', name: 'junit', version: '4.12' jeśli nie działa asercja
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
            System.out.println("Initial count: " + count);
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();

        //String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) > 1;";
        String countQuery = "SELECT COUNT(DISTINCT U.ID) FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID HAVING COUNT(*) > 1;";

        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(DISTINCT U.ID)");
        }
        System.out.println("Initial count: " + count);

        String addQuery = "INSERT INTO POSTS(ID,USER_ID,BODY) VALUES (45,5,'Mick Jagger has next child')";
        statement.executeUpdate(addQuery);
        addQuery = "INSERT INTO POSTS(ID,USER_ID,BODY) VALUES (46,5,'Inflation is rising fast')";
        statement.executeUpdate(addQuery);

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(P.BODY) AS POST_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY U.LASTNAME HAVING COUNT(*) > 1;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println("End query names: " + rs.getString("U.FIRSTNAME") + ", " +
                    rs.getString("U.LASTNAME"));
            counter++;
        }
        System.out.println("End query count: " + counter);

        int expected = count + 1;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }
    /*
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        //Then
        int count = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", ");
            count++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, count);
         */

}