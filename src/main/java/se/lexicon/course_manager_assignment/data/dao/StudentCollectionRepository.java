package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;


    public StudentCollectionRepository(Collection<Student> students) {

        this.students = students;

    }

    @Override
    public ArrayList<Object> createStudent(String name, String email, String address) {

        ArrayList<Object> students = new ArrayList<>();
        students.add(name);
        students.add(email);
        students.add(address);

        return students;
    }

    @Override
    public Student findByEmailIgnoreCase(String email) {


        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {

            Student student = iterator.next();
            if (student.getStudentEmail().equalsIgnoreCase(email)) {
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
                return (Collection<Student>) student;
            }
        }

        return null;
    }

    @Override
    public Student findById(int id) {

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Collection<Student> findAll() {
    HashSet<Student> allStudents = new HashSet<>();

    allStudents.addAll(students);

        return allStudents;
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