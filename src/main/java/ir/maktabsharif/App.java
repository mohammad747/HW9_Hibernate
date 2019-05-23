package ir.maktabsharif;

import ir.maktabsharif.model.Student;
import ir.maktabsharif.model.Teacher;
import ir.maktabsharif.model.dao.StudentDAO;
import ir.maktabsharif.model.dao.StudentDAOImpl;
import ir.maktabsharif.model.dao.TeacherDAO;
import ir.maktabsharif.model.dao.TeacherDAOImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;

/**
 * This program is about to learn hibernate using maven.
 * I implemented CRUD command and some more queries(HQL & Criteria).
 *
 * @author Mohammad hashemi
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        TeacherDAO teacherDAO = new TeacherDAOImpl(factory);
        StudentDAO studentDAO = new StudentDAOImpl(factory);

        /**
         * Create the students and the teachers, but I comment it down because we need to do it
         * just one time and we don't need to create each table every time we run the program.
         */
//        Teacher teacher1 = new Teacher("Ali", "Molayi", 111_111L, 200000D, LocalDate.of(1994,01,01));
//        Teacher teacher2 = new Teacher("Mohammad", "Hashemi", 111_112L, 230000D, LocalDate.of(1995,06,02));
//        Teacher teacher3 = new Teacher("Ahmad", "Khani", 111_113L, 150000D, LocalDate.of(1996,07,18));
//        Teacher teacher4 = new Teacher("Mohsen", "Zandi", 111_114L, 75000D, LocalDate.of(1990,10,25));
//        Teacher teacher5 = new Teacher("Nima", "Hassani", 111_115L, 185000D, LocalDate.of(1992,11,12));
//
//        teacherDAO.create(teacher1);
//        teacherDAO.create(teacher2);
//        teacherDAO.create(teacher3);
//        teacherDAO.create(teacher4);
//        teacherDAO.create(teacher5);
//
//
//        Student student1 = new Student("Mehdi", "Moghadam");
//        Student student2 = new Student("Mohammad", "Aghayi");
//        Student student3 = new Student("Mojtaba", "Noori");
//        Student student4 = new Student("Hassan", "Ghasemi");
//        Student student5 = new Student("Kamran", "Ghazi");
//
//        studentDAO.create(student1);
//        studentDAO.create(student2);
//        studentDAO.create(student3);
//        studentDAO.create(student4);
//        studentDAO.create(student5);

        /**
         * Each query was tested their work correctly
         */
        //teacherDAO.deleteByTeacherCode(111114L);

        //System.out.println(teacherDAO.maxAndMinSalaryOfTeachers());

        //System.out.println(teacherDAO.youngestAndOldestTeachers());

        //System.out.println(studentDAO.searchStudentsByName("mohammad"));
        //System.out.println(studentDAO.searchStudentsByNameCriteria("Mehdi"));



        factory.close();
    }
}
