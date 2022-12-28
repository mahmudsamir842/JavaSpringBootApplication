package net.rewardpointearn.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.rewardpointearn.model.Transaction;

public class RewardsService {
    public Map<String, Integer>calculateRewards(List<Transaction> transactions) {
        // create a map to store the reward points earned by each customer
        Map<String, Integer> rewards = new HashMap<>();

        for (Transaction transaction : transactions) {
            // get the customer name and transaction amount
            String customerName = transaction.getCustomerName();
            double amount = transaction.getAmount();
            // calculate the reward points earned for this transaction
            int points = 0;
            if (amount > 100) {
                points += 2 * (amount - 100);
            }
            if (amount > 50) {
                points += 1 * (amount - 50);
            }

            // add the points to the customer's total
            if (rewards.containsKey(customerName)) {
rewards.put(customerName, rewards.get(customerName) + points);
            } else {
rewards.put(customerName, points);
            }
        }

        return rewards;
    }
}
