/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * Exercise happy ticket
 * @author i-kom
 */
public class Exercise {
    
    /**
     * Method that calculates happy tickets
     * @return lucky ticket
     */
    public static int Calculate() {
        int luckyTicket = 0;
        for (int ticketNumber = 1; ticketNumber < 1000000; ticketNumber = ticketNumber + 1) {
            if (ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10 == (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10) {
                luckyTicket = luckyTicket + 1;
            } 
        }
        return luckyTicket;
    }
}
