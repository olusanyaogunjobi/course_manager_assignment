package se.lexicon.course_manager_assignment.model;

import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;

import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

public class Student {

     private int id;
     private String name;
     private String email;
     private String address;

     public Student( String name, String email, String address) {
          this.id = StudentSequencer.nextStudentId();
          this.name = name;
          this.email = email;
          this.address = address;
     }


     public int getStudentId() {
          return id;
     }

     public void setStudentId(int studentId) {
          this.id = studentId;
     }

     public String getStudentName() {
          return name;
     }

     public void setStudentName(String studentName) {
          this.name = studentName;
     }

     public String getStudentEmail() {
          return email;
     }

     public void setStudentEmail(String studentEmail) {
          this.email = studentEmail;
     }

     public String getStudentAddress() {
          return address;
     }

     public void setStudentAddress(String studentAddress) {
          this.address = studentAddress;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Student)) return false;
          Student student = (Student) o;
          return id == student.id && name.equals(student.name) && email.equals(student.email) && address.equals(student.address);
     }

     @Override
     public int hashCode() {
          return Objects.hash(id, name, email, address);
     }

     @Override
     public String toString() {
          return "Student{" +
                  "studentId=" + id +
                  ", studentName='" + name + '\'' +
                  ", studentEmail='" + email + '\'' +
                  ", studentAddress='" + address + '\'' +
                  '}';
     }
}
