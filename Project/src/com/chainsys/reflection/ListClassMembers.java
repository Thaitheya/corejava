package com.chainsys.reflection;
import java.lang.Object;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.text.DateFormat.Field;
import java.util.Scanner;

import javax.swing.JSpinner.DefaultEditor;

import com.chainsys.coll.stackOrFun;
import com.chainsys.introduction.second;


public class ListClassMembers{
       public static void printClassInfo(Object ob)
      {
          Class<?> classreflected= ob.getClass();
         System.out.println(classreflected.getName());
         System.out.println("Constructors:");
         Constructor<?> constructorlist[] = classreflected.getConstructors();
         for(int i = 0; i < constructorlist.length; i++)
         {
           System.out.println("\t" + constructorlist[i]);
         }
         //
         System.out.println("Methods:");
         Method methodlist[] = classreflected.getMethods();
         for(int i = 0; i < methodlist.length; i++)
         {
             methodlist[i].setAccessible(true);
           System.out.println("\t Method Name: " + methodlist[i].getName()+
                   " ParameterCount "+ methodlist[i].getParameterCount()+
                   " returnType "+ methodlist[i].getReturnType());
         }
      }

	  public static void queryTypeInfo() {
		java.util.Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Class Name");
			String cname = sc.nextLine();
			Class<?> classReferenace = Class.forName(cname);
			System.out.println("Constructors:");
			Constructor<?> clist[] = classReferenace.getConstructors();
			for (int i = 0; i < clist.length; i++) {
				System.out.println("\t" + clist[i]);
			}
			System.out.println("Fields:");
			java.lang.reflect.Field[] flist = classReferenace.getFields();
			for (int i = 0; i < flist.length; i++) {
				flist[i].setAccessible(true);
				// String modifier = ConstantsUtil.getModifierName(flist[i].getModifiers(), 
				// 		Class.forName("java.lang.reflect.Modifier"));
	
				// System.out.println("\t" + flist[i].getType() + " " + flist[i].getName() + " Modifier " +modifier );
				System.out.println("\t" + flist[i].getType() + " " + flist[i].getName() + " Modifier " +flist[i].getModifiers() );
			} 
			System.out.println("Methods:");
			Method mlist[] = classReferenace.getMethods();
			for (int i = 0; i < mlist.length; i++) {
				mlist[i].setAccessible(true);
				System.out.println("\t Method Name: " + mlist[i].getName() + " ParameterCount "
						+ mlist[i].getParameterCount() + " returnType " + mlist[i].getReturnType());
				if (mlist[i].getParameterCount() > 0) {
					Parameter[] param = mlist[i].getParameters();
					for (Parameter p1 : param) {
						System.out.println("\t\t" + p1.getName() + " " + p1.getParameterizedType().getTypeName());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		finally
		{
			sc.close();
		}
	}

	  

	  public static void testA(){
              String  s1 = "Hello";
			  printClassInfo(s1);
			  Integer x = 2000;
              printClassInfo(x);
			  Emp firstEmp = new Emp();
			  printClassInfo(firstEmp);
			  Actor hero = new Actor();
			  printClassInfo(hero);
	  }
	  public static void main(String[] args) {
		testsetAccessible();
		
	  }

	        public static void testB (){

              String classname = "edu.lessons.day98.reflection.Actor";
                  Class<?> actorclass= null;
              try {
                          actorclass Class. forName (classname); // Actor actorclass=null;
                   } catch (ClassNotFoundException el) { el.printStackTrace ();
return;
}
                   Object obj = null;
              try {
              // obj=ctorclass.newInstance(); // new Actor (); obj actorclass.get DeclaredConstructors () [0].newInstance(); =
                  } catch (IllegalArgumentException e) { e.printStackTrace();
                   return;
                  } catch (InvocationTargetException e) { e.printStackTrace ();
                   return;
	          }
			}

            public static void earlyBinding(){
                 Actor actorreference = new Actor();
				 actorreference.Name = "Thaitheyasudan";
				 actorreference.city = "Madurai";
				 actorreference.printCity();
				 actorreference.printName();
				

			}

			public static void lateBinding(){
                 java.util.Scanner  sc = new java.util.Scanner(System.in);
				
				 try{
					 System.out.println("Enter class Name");
				 String className = sc.nextLine (); // load the class-A al;
				 Class<?> classRef = Class. forName (className);
				 // create Object al-new A();
				 Object obj = classRef.getDeclaredConstructor () .newInstance(); 
				 System.out.println("Class Name " + obj.getClass ().getName());
				 System.out.println ("Hash Code" + obj.hashCode () );
				 System.out.println("Parent Class " + classRef.getSuperclass ().getName());
				 int mod = classRef.getModifiers();
				 System.out.println("IsPublic" + Modifier.isPublic (mod));
				 System.out.println("isPrivate " + Modifier.isPrivate (mod));
				 System.out.println("isAbstract " + Modifier.isAbstract (mod));
				 System.out.println("Is Public " + Modifier.isPublic (mod));
			}
				 catch (Exception e) {
				 System.out.println("Exception: " + e);
				 }
				finally{
				 sc.close();
				}
			}

           
			public static void testsetAccessible() {
				try {
					String cname = "com.chainsys.reflection.Actor";
					Class<?> classReference = Class.forName(cname);
					Object objReference = classReference.getDeclaredConstructor().newInstance();
		
					java.lang.reflect.Field fieldCity = objReference.getClass().getDeclaredField("city");
					fieldCity.setAccessible(false);
					fieldCity.set(objReference, "Chennai");
					Object cityFieldInstance = fieldCity.get(objReference);
					System.out.println(cityFieldInstance);
		} catch (Exception e) {
					System.out.println("Exception: " + e);
				}
			}
		
            class test1{
				
String cname = "edu.lessons.day98.reflection.Actor"; 
			Class<?> classReference;
			try {
			classReference = Class. forName (cname);
			// fetch an array of references to each constructor in the class
			Constructor<?> clist[] = classReference.getConstructors(); // newInstance is a method that creates an instance (object) of the class // using the constructor reference Object first_obj= clist [0].newInstance();// First obj=new Actor ();
			// fetch reference to the default constructor of the class Constructor<?> defaultConstructor-classReference.getDeclaredConstructor();
			Object obj=DefaultEditor.newInstance();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (InstantiationException er) {
			e.printStackTrace ();
			} catch (IllegalAccessException err) {
			e.printStackTrace();
			} catch (IllegalArgumentException errr) {
			}
			
		 }
			
			
	