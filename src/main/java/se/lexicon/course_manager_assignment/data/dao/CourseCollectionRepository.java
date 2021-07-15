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
    public ArrayList<Object> createCourse(String courseName, LocalDate startDate, int weekDuration) {
        ArrayList<Object> courses = new ArrayList<>();
        courses.add(courseName);
        courses.add(weekDuration);
        courses.add(startDate);

        return courses;
    }

    @Override
    public Course findById(int id) {

        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Collection<Course> findByNameContains(String name) {

        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getCourseName() == name) {

                return (Collection<Course>) course;
            }
        }
        return null;
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {

        ArrayList<Course> courses = new ArrayList<>();
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getStartDate().equals(end)) {

                return (Collection<Course>) course;
            }
        }
        return null;
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {

        ArrayList<Course> courses = new ArrayList<>();
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getStartDate().equals(start)) {

                return (Collection<Course>) course;
            }
        }
        return null;
    }

    @Override
    public Collection<Course> findAll() {
        ArrayList<Course> allCourses = new ArrayList<>();

        if (allCourses.addAll(courses)) {
            return allCourses;
        } else {
            return null;
        }
    }

    @Override
    public int findByStudentId(int studentId) {

        ArrayList<Course> courses = new ArrayList<>();
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {

            Course course = iterator.next();
            if (course.getStudents().contains(studentId)) {
                return studentId;
            }
        }
    return 0;
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