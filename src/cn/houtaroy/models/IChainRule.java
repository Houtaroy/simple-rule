package cn.houtaroy.models;

/**
 * @author Houtaroy
 */
public interface IChainRule<T> {

    /**
     * 执行规则
     *
     * @param previous 之前的规则结果
     * @param t        内容
     * @return 结果
     */
    boolean execute(boolean previous, T t);

}
