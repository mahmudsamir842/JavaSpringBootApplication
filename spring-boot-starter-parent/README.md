# JavaSpringBootApplication
This is a Java program that calculates rewards points for a list of transactions. The program consists of three classes: Transaction, RewardsService, and RewardsController.
Transaction
The Transaction class represents a customer transaction with a name, amount, and date. It has getter methods to retrieve the values of these fields.
RewardsService
The RewardsService class contains the calculateRewards method, which takes a list of Transaction objects as input and returns a map of customer names to the total number of reward points earned by each customer. The reward points for each transaction are calculated based on the transaction amount: customers earn 1 point for every dollar spent over $50, and an additional 2 points for every dollar spent over $100.
RewardsController
The RewardsController class is a Spring @RestController that exposes a single endpoint: /calculate-rewards. This endpoint expects a POST request with a JSON body containing a list of Transaction objects, and returns a map of customer names to the total number of reward points earned by each customer.
Usage
To use this program, you would need to send a POST request to the /calculate-rewards endpoint with a JSON body containing a list of Transaction objects. The endpoint would then return a map of customer names to the total number of reward points earned by each customer.
For example, to calculate the rewards for the transactions in the example given, you would send a request like the following:

POST /calculate-rewards
[
    { "customerName": "Alice", "amount": 120, "date": "2022-01-01" },
    { "customerName": "Bob", "amount": 80, "date": "2022-01-01" }
]

The response would be a JSON object like the following:
{
    "Alice": 240,
    "Bob": 80
}
