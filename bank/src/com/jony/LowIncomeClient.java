package com.jony;

/**
 * Class representing a bank low income client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class LowIncomeClient extends Client {
    private Priority priority = Priority.MIN;

    @Override
    public Priority getPriority() {
        return priority;
    }
}
