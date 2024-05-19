package HibernateEX;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "enrollments")
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Classes classes;
}
