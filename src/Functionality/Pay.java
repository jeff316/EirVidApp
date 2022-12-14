/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionality;

import Movie.Movie;
import User.RegularUser;
import dao.UserDao;

/**
 *
 * @author Bekezhan Abdykarimov ( 2020297 )
 */
public class Pay {

    public void pay(RegularUser user, Movie movie) {

        double userBalance = user.getBalance();
        double movieRentPrice = movie.getPrice();

        if (userBalance < movieRentPrice) {
            System.out.println("Not enough balance, please add some credits");
        } else {
            user.setBalance(userBalance - movieRentPrice);
            double newBalance = user.getBalance();
            UserDao db = new UserDao();
            boolean updateBalance = db.updateUsersBalance(user, newBalance);
            System.out.println("Payment approved");
            System.out.println("new Balance : " + newBalance);
        }
    }
}
