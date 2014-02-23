/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.io.Serializable;

/**
 *
 * @author Radhika
 */
public class Review implements Serializable {

    private String summary;
    private String comments;
    private int rating;
    private Customer customer;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Review() {
    }

    public Review(String summary, String comments, int rating, Customer customer) {
        this.summary = summary;
        this.comments = comments;
        this.rating = rating;
        this.customer = customer;
    }

    public void modifyReview(String summary, String comments, int rating) {
        setSummary(summary);
        setComments(comments);
        setRating(rating);

    }
}
