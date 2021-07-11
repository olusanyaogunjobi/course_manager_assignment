package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;


public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;


    public StudentCollectionRepository(Collection<Student> students) {

        this.students = students;

    }

    @Override
    public Student createStudent(String name, String email, String address) {

        Student student = new Student(name, email, address);
        students.add(student);

        return student;
    }

    @Override
    public Student findByEmailIgnoreCase(String email) {


        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {

            Student student = iterator.next();
            if (student.getStudentEmail().equals(email)) {
                return student;
            }
        }

        return null;
    }

    @Override
    public Collection<Student> findByNameContains(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentName().equals(name)) {
                return students;
            }
        }

        return null;
    }

    @Override
    public Student findById(int id) {
        ArrayList<Student> students = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student == student) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Collection<Student> findAll() {



        return null;
    }

    @Override
    public boolean removeStudent(Student student) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student student1 = itr.next();
            if (student1 == student) {
                itr.remove();
            }

        }
            return false;
    }

    @Override
    public void clear() {

    }
}