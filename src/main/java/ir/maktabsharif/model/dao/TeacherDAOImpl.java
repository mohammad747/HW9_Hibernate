package ir.maktabsharif.model.dao;

import ir.maktabsharif.BaseDao.BaseDAOImpl;
import ir.maktabsharif.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class TeacherDAOImpl extends BaseDAOImpl<Teacher> implements TeacherDAO {

    public TeacherDAOImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    protected String getEntityName() {
        return "Teacher";
    }

    @Override
    public void deleteByTeacherCode(Long teacherCode) {
        Session session = factory.openSession();

        session.beginTransaction();

        session.createQuery("delete from Teacher t where t.teacherCode = ?1").setParameter(1,teacherCode).executeUpdate();

        session.close();
    }

    @Override
    public List<Teacher> maxAndMinSalaryOfTeachers() {
        Session session = factory.openSession();


        Object singleResultMax = session.createQuery("from Teacher t order by t.salary").setMaxResults(1).getSingleResult();
        Object singleResultMin = session.createQuery("from Teacher t order by t.salary desc ").setMaxResults(1).getSingleResult();
        Teacher eMax = (Teacher) singleResultMax;
        Teacher eMin = (Teacher) singleResultMin;

        List<Teacher> maxMin = new ArrayList<>();
        maxMin.add(eMax);
        maxMin.add(eMin);

        session.close();

        return maxMin;
    }

    @Override
    public List<Teacher> youngestAndOldestTeachers() {

        Session session = factory.openSession();

        Object singleResultMax = session.createQuery("from Teacher t order by t.birthday").setMaxResults(1).getSingleResult();
        Object singleResultMin = session.createQuery("from Teacher t order by t.birthday desc").setMaxResults(1).getSingleResult();

        Teacher eMax = (Teacher) singleResultMax;
        Teacher eMin = (Teacher) singleResultMin;

        List<Teacher> maxMin = new ArrayList<>();
        maxMin.add(eMax);
        maxMin.add(eMin);

        session.close();

        return maxMin;

    }
}
