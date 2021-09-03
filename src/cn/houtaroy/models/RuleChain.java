package cn.houtaroy.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Houtaroy
 */
public class RuleChain<T> {

  List<IChainRule<T>> rules;

  public RuleChain() {
    rules = new ArrayList<>();
  }

  public void addRole(IChainRule<T> rule) {
    if (rules == null) {
      rules = new ArrayList<>();
    }
    rules.add(rule);
  }

  public boolean execute(T t) {
    if (rules.size() <= 0) {
      return true;
    }
    boolean result = rules.get(0).execute(true, t);
    rules.remove(0);
    for (IChainRule<T> rule : rules) {
      result = rule.execute(result, t);
    }
    return result;
  }

}
