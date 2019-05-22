package ir.maktabsharif.model.dao;

import ir.maktabsharif.BaseDao.BaseDAOImpl;
import ir.maktabsharif.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

    public StudentDAOImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    protected String getEntityName() {
        return null;
    }

    @Override
    public List<Student> searchStudentsByName(String name) {

        Session session = factory.openSession();

        String hql = "from Student s where s.firstName = :name or s.lastName = :name";

        Query query = session.createQuery(hql);

        query.setParameter(name,"mohammad");

        List studentsByName = query.list();

        session.close();

        return studentsByName;


    }
}
