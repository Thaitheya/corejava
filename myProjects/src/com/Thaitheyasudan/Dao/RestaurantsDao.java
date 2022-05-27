package com.Thaitheyasudan.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Thaitheyasudan.pojo.restaurants;


public class RestaurantsDao {
      @SuppressWarnings("unused")
	private static Connection getConnection() {
    	  String drivername = "oracle.jdbc.OracleDriver";
    	  String Url = "jdbc:oracle:thin:@localhost:1521:xe";
    	  String username = "system";
    	  String password = "oracle";
    	  try {
			 Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	  Connection con = null;
    	  try {
			con = DriverManager.getConnection(Url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  return con;
      }
      
      @SuppressWarnings("unused")
	private static java.sql.Date convertToSqlDate(java.sql.Date date){
    	  java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    	  return sqlDate;
      }
      public static int insertRestaurants(restaurants res) {
    	  String inserquery = "insert into restaurants2 res_no,res_name,food_types,phone_number,res_city,offer_date values (?,?,?,?,?,?)";
    	  Connection con = null;
    	  int rows = 0;
    	  
    	  PreparedStatement ps = null;
    	  try {
    		  con = getConnection();
    		  ps.setInt(1, res.getRestaurant_No());
    		  ps.setString(1, res.getRestaurantName());
    		  ps.setString(3, res.getFood_Types());
    		  ps.setString(4, res.getFood_Types());
    		  ps.setLong(5, res.getPhone_number());
    		  ps.setDate(6,res.getOffer());
    	  }catch(SQLException e) {
    		  e.printStackTrace();
    	  }finally {
    		  try {
				ps.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
    		  try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	  }
    	  return rows;
      }
      public static restaurants getRestaurantsByNo(int no) {
    	  Connection mycon = getConnection();
    	  PreparedStatement pstmt = null;
    	  ResultSet rs = null;
    	  restaurants res = null;
    	  try {
			pstmt = mycon.prepareStatement("select res_name,food_types,phone_number,res_city,offer_date from restraunts2 where res_no=?");
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			res = new restaurants();
			if(rs.next()) {
				res.setRestaurant_No(rs.getInt(1));
				res.setRestaurantName(rs.getString(2));
				res.setFood_Types(rs.getString(3));
				res.setCity(rs.getString(4));
				res.setPhone_number(rs.getLong(5));
				res.setOffer(rs.getDate(6));				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		    try {
				rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		    try {
				pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		    try {
				mycon.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return res;
      }
      public static List<restaurants> getAllRestaurants(){
    	  List<restaurants>listOfRestaurants = new ArrayList<restaurants>();
    	  Connection mycon = getConnection();
    	  Statement stmt = null;
    	  ResultSet rs = null;
    	  restaurants res = null;
    	  try {
    		  stmt = mycon.createStatement();
    		  rs = stmt.executeQuery(" select res_name,food_types,phone_number,res_city,offer_date from restraunts2");
    		  
    		  while(rs.next()) {
    		
    			res.setRestaurant_No(rs.getInt(1));
  				res.setRestaurantName(rs.getString(2));
  				res.setFood_Types(rs.getString(3));
  				res.setCity(rs.getString(4));
  				res.setPhone_number(rs.getLong(5));
  				res.setOffer(rs.getDate(6));		
    		  }
    		  	  }catch (Exception e) {
                     e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
    	  return listOfRestaurants;
      }
      
      public static int updateRestaurants(restaurants res) {
    	  Connection mycon =getConnection();
    	  PreparedStatement pstmt = null;
    	  int rows = 0;
    	  try {
    		    pstmt.setInt(1,res.getRestaurant_No());
				pstmt.setString(2,res.getRestaurantName());
				pstmt.setString(3,res.getFood_Types());
			    pstmt.setString(4,res.getCity());
				pstmt.setLong(5,res.getPhone_number());
				pstmt.setDate(6,res.getOffer());
    	  }catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
    	  
      }
      public static int deleteRestaurants(int no) {
    	  Connection mycon = getConnection();
    	  PreparedStatement pstmt = null;
    	  int rows = 0;
    	  try {
			pstmt = mycon.prepareStatement("delete restaurants where res_no=?");
			pstmt.setInt(1, no);
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
	        e.printStackTrace();
		}
		return no;
    	  
      }
}
