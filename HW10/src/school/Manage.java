package school;

import myException.NotEnoughMoneyException;

public interface Manage {

    void hire(Teacher teacher);

    void paySalary(Teacher teacher) throws NotEnoughMoneyException;

    void fire(Teacher teacher);

}
