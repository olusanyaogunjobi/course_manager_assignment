package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class CourseCollectionRepository implements CourseDao {

    private Collection<Course> courses;


    public CourseCollectionRepository(Collection<Course> courses) {

        this.courses = courses;
    }

    @Override
    public Course createCourse(String courseName, LocalDate startDate, int weekDuration) {
        ArrayList<Object> courses = new ArrayList<>();
        courses.add(courseName);
        courses.add(weekDuration);
        courses.add(startDate);

        return null;
    }

    @Override
    public Course findById(int id) {

        boolean result = courses.contains(id);
        return null;
    }

    @Override
    public Collection<Course> findByNameContains(String name) {

        boolean result = courses.contains(name);
        return null;
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {

        boolean result = courses.contains(end);
        return null;
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {

        boolean result = courses.contains( start);
        return null;
    }

    @Override
    public Collection<Course> findAll() {


        return null;
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {

        boolean result = courses.contains(studentId);
        return null;
    }

    @Override
    public boolean removeCourse(Course course) {
        Iterator<Course> itr = courses.iterator();
        this.courses = new HashSet<>();
        if (course == course) {

            itr.remove();


            return false;
        }
        return false;
    }

    @Override
    public void clear() {
        courses.clear();

    }
}