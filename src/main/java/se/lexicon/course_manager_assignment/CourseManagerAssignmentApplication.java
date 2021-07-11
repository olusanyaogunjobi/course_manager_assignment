package se.lexicon.course_manager_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.lexicon.course_manager_assignment.data.dao.StudentCollectionRepository;
import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@SpringBootApplication
public class CourseManagerAssignmentApplication {

    public static void main(String[] args) {

        SpringApplication.run(CourseManagerAssignmentApplication.class, args);

        Collection<Student> students = new ArrayList<Student>();

    }

}
