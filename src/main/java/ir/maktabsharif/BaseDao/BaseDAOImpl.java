package ir.maktabsharif.BaseDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * Implement BaseDAO(CRUD)
 * @author Mohammad hashemi
 * @param <E>
 */
public abstract class BaseDAOImpl<E extends Serializable> implements BaseDAO<E> {

    protected final SessionFactory factory;

    protected BaseDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }

    protected abstract String getEntityName();

    /**
     * CREATE
     * @param e
     */
    @Override
    public void create(E e) {
        Session session  = factory.openSession();

        session.beginTransaction();

        session.save(e);

        session.getTransaction().commit();

        session.close();
    }

    /**
     * READ
     * @param id
     * @return
     */
    @Override
    public E read(Serializable id) {

        Session session = factory.openSession();

        session.beginTransaction();

        E e = (E) session.get(getEntityName(), id);

        session.getTransaction().commit();

        session.close();

        return e;
    }

    /**
     * UPDATE
     * @param e
     * @return
     */
    @Override
    public E update(E e) {

        Session session = factory.openSession();

        session.beginTransaction();

        session.save(e);

        session.getTransaction().commit();

        session.close();

        return e;
    }

    /**
     * DELETE
     * @param id
     */
    @Override
    public void delete(Serializable id) {

        Session session = factory.openSession();

        session.beginTransaction();

        session.createQuery("delete from" + getEntityName() + "as entity where entity id =" + id);

        session.getTransaction().commit();

        session.close();
    }
}
