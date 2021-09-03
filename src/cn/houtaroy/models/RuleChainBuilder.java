package cn.houtaroy.models;

/**
 * @author Houtaroy
 */
public class RuleChainBuilder<T> {

  private final RuleChain<T> ruleChain;

  public RuleChainBuilder() {
    ruleChain = new RuleChain<>();
  }

  public RuleChainBuilder<T> and(RuleFunction<T> rule) {
    ruleChain.addRole(new AndRule<>(rule));
    return this;
  }

  public RuleChainBuilder<T> or(RuleFunction<T> rule) {
    ruleChain.addRole(new OrRule<>(rule));
    return this;
  }

  public RuleChain<T> build() {
    return ruleChain;
  }

}
