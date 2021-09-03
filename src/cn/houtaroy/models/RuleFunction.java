package cn.houtaroy.models;

/**
 * @author Houtaroy
 */
@FunctionalInterface
public interface RuleFunction<T> {

    /**
     * 执行规则
     *
     * @param t 内容
     * @return 规则结果
     */
    boolean execute(T t);

}
