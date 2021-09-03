package cn.houtaroy;

import cn.houtaroy.models.RuleChain;
import cn.houtaroy.models.RuleChainBuilder;

/**
 * @author Houtaroy
 */
public class Main {

    public static void main(String[] args) {
        Integer number = 10;
        RuleChain<Integer> ruleChain = new RuleChainBuilder<Integer>()
                .and(item -> item > 5).or(item -> item < 200).or(item -> item < 100)
                .and(item -> item > 1000).build();
        System.out.println("规则链执行: " + ruleChain.execute(number));
    }
}
