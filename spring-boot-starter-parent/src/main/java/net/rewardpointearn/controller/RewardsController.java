package net.rewardpointearn.controller;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.rewardpointearn.model.Transaction;
import net.rewardpointearn.service.RewardsService;

@RestController
public class RewardsController {
    private RewardsService rewardsService;

    public RewardsController(RewardsService rewardsService) {
this.rewardsService = rewardsService;
    }

    @PostMapping("/calculate-rewards")
    public Map<String, Integer>calculateRewards(@RequestBody List<Transaction> transactions) {
        return rewardsService.calculateRewards(transactions);
    }
}
