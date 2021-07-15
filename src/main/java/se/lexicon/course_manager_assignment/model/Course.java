package se.lexicon.course_manager_assignment.model;

import java.util.*;
import java.time.LocalDate;

public class Course {

    private int id;
    private String courseName;
    private int weekDuration;
    private LocalDate startDate;
    private Collection<Student> students;






    public Course(int courseId, String courseName, int weekDuration, LocalDate startDate, List<Student> students) {
        this.id = courseId;
        this.courseName = courseName;
        this.weekDuration = weekDuration;
        this.startDate = startDate;
        this.students =students;
    }

    public int getCourseId() {
        return id;
    }

    public void setCourseId(int courseId) {
        this.id = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public HashSet<Student> getStudents() {

        return null;
    }

    public void setStudents(Collection<Student> students) {


        this.setStudents(students);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseId() == course.getCourseId() && getWeekDuration() == course.getWeekDuration() && getCourseName().equals(course.getCourseName()) && getStartDate().equals(course.getStartDate()) && getStudents().equals(course.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId(), getCourseName(), getWeekDuration(), getStartDate(), getStudents());
    }

   /* public boolean enrollStudent( Student){

        return false;

    }*/

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + id +
                ", courseName='" + courseName + '\'' +
                ", weekDuration=" + weekDuration +
                ", startDate=" + startDate +
                '}';
    }





}
