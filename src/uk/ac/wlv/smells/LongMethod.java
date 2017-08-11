package uk.ac.wlv.smells;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LongMethod {

	public DegreeClassification calculateDegreeClassification(int studentNo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		String SQL = "SELECT * FROM grades where studentNo =" + studentNo;
		String url = "jdbc:mysql://localhost:3306/grades";
		try(Connection connection = DriverManager.getConnection(url, "root", "password")) {
			try(Statement stmt = connection.createStatement()) {
				try (ResultSet rs = stmt.executeQuery(SQL)) {
					List<Integer> gradesList = new ArrayList<Integer>();
					while (rs.next()) {
						gradesList.add(rs.getInt("grade_percentage"));
					}
					int sum = 0;
					for(int grade : gradesList) {
						sum += grade;
					}
					int average = sum / gradesList.size();
					if(average >= 70) {
						return DegreeClassification.FIRST_CLASS_HONOURS;
					} else if (average >= 60) {
						return DegreeClassification.UPPER_SECOND_CLASS_HONOURS;
					} else if (average >= 50) {
						return DegreeClassification.LOWER_SECOND_CLASS_HONOURS;
					} else {
						return DegreeClassification.THIRD_CLASS_HONOURS;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
