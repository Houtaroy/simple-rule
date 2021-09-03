package cn.houtaroy.models;

/**
 * @author Houtaroy
 */
public class OrRule<T> implements IChainRule<T> {

  private final RuleFunction<T> rule;

  public OrRule(RuleFunction<T> rule) {
    this.rule = rule;
  }

  @Override
  public boolean execute(boolean previous, T t) {
    return previous || rule.execute(t);
  }
}
