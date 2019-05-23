package ir.maktabsharif.model.dao;

import ir.maktabsharif.BaseDao.BaseDAO;
import ir.maktabsharif.model.Student;

import java.util.List;

/**
 * @author Mohammad hashemi
 */
public interface StudentDAO extends BaseDAO<Student> {

    /**
     * Search students by their name
     * @param name
     * @return
     */
    List<Student> searchStudentsByName(String name);

    /**
     * Search students name by their name with Criteria method
     * @param name
     * @return
     */
    List<Student> searchStudentsByNameCriteria(String name);
}
