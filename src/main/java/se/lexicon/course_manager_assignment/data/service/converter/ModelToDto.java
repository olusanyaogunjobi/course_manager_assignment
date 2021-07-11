package se.lexicon.course_manager_assignment.data.service.converter;

import org.springframework.stereotype.Component;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelToDto implements Converters {
    @Override
    public StudentView studentToStudentView(Student student) {

        return new StudentView(student.getStudentId(),student.getStudentName(),student.getStudentEmail(),student.getStudentAddress());
    }

    @Override
    public CourseView courseToCourseView(Course course) {
        return new CourseView(course.getCourseId(),course.getCourseName(), course.getStartDate(),course.getWeekDuration(),course.getStudents());
    }

    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {
        // stream collection of courses and convert each course to courseView and then collect them back into a list
        return courses.stream().map(course -> courseToCourseView(course)).collect(Collectors.toList());
    }

    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students) {

        return students.stream().map(student -> studentToStudentView(student)).collect(Collectors.toList());
    }
}
