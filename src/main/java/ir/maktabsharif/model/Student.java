package ir.maktabsharif.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mohammad hashemi
 *
 * Teacher entity/Table
 */
@Entity
@Table(name = "students")
public class Student implements Serializable {

    /**
     * Fields or columns
     *
     * data types should be wrapper to enforcing nullability in the database
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    /**
     * Default constructor
     */
    public Student() {

    }

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    /**
     * ToString because we don't want to see hashCode
     * instead of real data
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
