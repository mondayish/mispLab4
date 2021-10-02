package ru.mondayish.mbeans;

import ru.mondayish.model.Shot;

public interface ShotCounterMBean {

    void addShot(Shot shot);

    long getAllShotsCount();

    long getFailedShotsCount();
}
