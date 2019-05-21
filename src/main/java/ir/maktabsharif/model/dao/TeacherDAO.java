package ir.maktabsharif.model.dao;

import ir.maktabsharif.BaseDao.BaseDAO;
import ir.maktabsharif.model.Teacher;

import java.util.List;

public interface TeacherDAO extends BaseDAO<Teacher> {

    void deleteByTeacherCode(Long teacherCode);

    List<Teacher> maxAndMinSalaryOfTeachers();

    List<Teacher> youngestAndOldestTeachers();
}
