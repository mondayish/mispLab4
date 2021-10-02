package ru.mondayish.mbeans;

import ru.mondayish.model.Shot;

import javax.management.NotificationBroadcasterSupport;

public class SuccessShotStat extends NotificationBroadcasterSupport implements SuccessShotStatMBean {

    private long allShotsCount = 0;
    private long successShotsCount = 0;

    @Override
    public void addShot(Shot shot) {
        allShotsCount++;
        if (shot.isResult()) {
            successShotsCount++;
        }
    }

    @Override
    public double getSuccessPercent() {
        return Math.round(((double) successShotsCount) * 10000 / allShotsCount) / 100.0;
    }
}
