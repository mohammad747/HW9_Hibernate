package ir.maktabsharif.model.dao;

import ir.maktabsharif.BaseDao.BaseDAO;
import ir.maktabsharif.model.Student;

import java.util.List;

public interface StudentDAO extends BaseDAO<Student> {

    List<Student> searchStudentsByName(String name);

    List<Student> searchStudentsByNameCriteria(String name);
}
