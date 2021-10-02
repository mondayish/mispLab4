package ru.mondayish.mbeans;

import ru.mondayish.model.Shot;

public interface SuccessShotStatMBean {

    void addShot(Shot shot);

    double getSuccessPercent();
}
