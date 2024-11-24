package com.cjc.ims.app.seriveimpl;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.CJC;

public class Karvenagar implements CJC{
	Scanner sc=new Scanner(System.in);
	List<Course> cList =new ArrayList<Course>();
	List<Faculty> fList=new ArrayList<Faculty>();
	List<Batch> bList =new ArrayList<Batch>();
	List<Student> sList=new ArrayList<Student>();
	@Override
	public void addCourse() {
		Course c=new Course();
		System.out.println("Enter CourseID:");
		c.setCid(sc.nextInt());
		System.out.println("Enter CourseName:");
		c.setCname(sc.next());
		
		cList.add(c);
		
	}
	@Override
	public void viewCourse() {
		System.out.println("    CID    |     CName    ");
		for(Course c:cList) {
			System.out.println("    "+c.getCid()+"      "+    c.getCname());
		}
		
	}
	@Override
	public void addFaculty() {
		Faculty f=new Faculty();
		System.out.println("Enter FacultyID:");
		f.setFid(sc.nextInt());
		System.out.println("Enter FacultyName:");
		f.setFacultyname(sc.next());
		
		System.out.println("Select Course  for this Faculty ");
		for(Course c:cList) {
			System.out.println("Course Id:"+c.getCid()+",Course Name: "+c.getCname());
		}
		int courseId=sc.nextInt();
		for(Course c:cList) {
			if(c.getCid()==courseId) {
				f.setC(c);
				break;
			}
		}
		fList.add(f);
	}
	@Override
	public void viewFaculty() {
		System.out.println("    FID    |     FName    |      CName ");
		for(Faculty f:fList) {
			System.out.println("   "+f.getFid() + "     "+  f.getFacultyname() + "   "+ f.getC());
		}
		
	}
	@Override
	public void addBatch() {
		// TODO Auto-generated method stub
		Batch b=new Batch();
		System.out.println("Enter BatchId:");
		b.setBid(sc.nextInt());
		System.out.println("Enter BatchName:");
		b.setBname(sc.next());
		
		System.out.println("Select Faculty for this Batch");
		for(Faculty f:fList) {
			System.out.println("Faculty Id:"+f.getFid()+ ",Facult Name:" +f.getFacultyname());
		}
		int facultyId = sc.nextInt();
		for(Faculty f:fList) {
			if(f.getFid()==facultyId) {
				b.setF(f);
				break;
			}
		}
		
		bList.add(b);
	}
	@Override
	public void viewBatch() {
		 System.out.println("    BID    |     BName    |      Faculty ");
	        for (Batch b : bList) {
	            System.out.println("   " + b.getBid() + "     " + b.getBname() + "      " + b.getF().getFacultyname());
	        }
		
	}
	@Override
	public void addStudent() {
		Student s = new Student();
        System.out.println("Enter StudentID:");
        s.setSid(sc.nextInt());
        System.out.println("Enter StudentName:");
        s.setSname(sc.next());

        System.out.println("Select Batch for this Student");
        for (Batch b : bList) {
            System.out.println("Batch Id: " + b.getBid() + ", Batch Name: " + b.getBname());
        }
        int batchId = sc.nextInt();
        for (Batch b : bList) {
            if (b.getBid() == batchId) {
                s.setB(b);
                break;
            }
        }
        sList.add(s);
		
	}
	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		System.out.println("    SID    |     SName    |      Batch ");
        for (Student s : sList) {
            System.out.println("   " + s.getSid() + "     " + s.getSname() + "      " + s.getB().getBname());
        }
		
	}
    
}
