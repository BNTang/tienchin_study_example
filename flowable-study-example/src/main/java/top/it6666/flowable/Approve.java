package top.it6666.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author BNTang
 * @version 1.0
 * @description 发送请假审批邮箱拒绝或者同意
 * @since 2023-11-23
 **/
public class Approve implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("发送请假审批邮箱拒绝或者同意" + delegateExecution.getVariables());
    }
}