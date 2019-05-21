package ir.maktabsharif.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Mohammad hashemi
 *
 * Teacher entity/Table
 */
@Entity(name = "teachers")
public class Teacher {

    /**
     * Fields or columns
     *
     * data types should be wrapper to enforcing nullability in the database
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "teacher_code", nullable = false, unique = true)
    private Long teacherCode;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "birthday")
    private Date birthday;

    /**
     * Default constructor
     */
    public Teacher() {

    }

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param teacherCode
     * @param salary
     * @param birthday
     */
    public Teacher(String firstName, String lastName, Long teacherCode, Double salary, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherCode = teacherCode;
        this.salary = salary;
        this.birthday = birthday;
    }

    /**
     * Getter and Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(Long teacherCode) {
        this.teacherCode = teacherCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * ToString because we don't want to see hashCode
     * instead of real data
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teacherCode=" + teacherCode +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
