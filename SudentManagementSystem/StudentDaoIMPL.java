package in.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import in.student.pojo.Student;
import in.student.utility.Connect;

public class StudentDaoIMPL implements StudentDao {
	PreparedStatement ps;
	Connection conn = Connect.getConnectionn();
	int result;

	@Override
	public boolean AddStudent(Student student) {
		String query = "insert into student values(?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, student.getStudentName());
			ps.setInt(2, student.getStudentStandard());
			ps.setString(3, String.valueOf(student.getStudentGrade()));
			ps.setInt(4, student.getStudentRoll());
			ps.setLong(5, student.getStudentContact());
			ps.setBoolean(6, student.isStudentFee());
			result = ps.executeUpdate();
			if (result > 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean UpdateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student GetOneStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> ShowStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
