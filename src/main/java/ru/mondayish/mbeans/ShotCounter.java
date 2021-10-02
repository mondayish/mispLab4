package ru.mondayish.mbeans;

import ru.mondayish.model.Shot;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class ShotCounter extends NotificationBroadcasterSupport implements ShotCounterMBean {

    private long allShotsCount = 0;
    private long failedShotsCount = 0;

    @Override
    public void addShot(Shot shot) {
        allShotsCount++;
        if (!shot.isResult()) {
            failedShotsCount++;
        }

        if (allShotsCount % 5 == 0) {
            Notification notification = new Notification("Count is multiply of 5",
                    this, System.currentTimeMillis(), "Count of all shots is multiply of 5");
            this.sendNotification(notification);
        }
    }

    @Override
    public long getAllShotsCount() {
        return allShotsCount;
    }

    @Override
    public long getFailedShotsCount() {
        return failedShotsCount;
    }
}
