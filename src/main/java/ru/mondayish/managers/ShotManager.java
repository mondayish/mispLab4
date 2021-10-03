package ru.mondayish.managers;

import ru.mondayish.commands.*;
import ru.mondayish.mbeans.ShotCounter;
import ru.mondayish.mbeans.ShotCounterMBean;
import ru.mondayish.mbeans.SuccessShotStat;
import ru.mondayish.mbeans.SuccessShotStatMBean;
import ru.mondayish.model.History;
import ru.mondayish.model.Shot;

import javax.management.JMException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ShotManager {

    private final List<Command> availableCommands =
            Arrays.asList(new ExitCommand(), new HelpCommand(), new HistoryCommand(), new ShotCommand());
    private final History history = new History();

    private ShotCounterMBean shotCounter;
    private SuccessShotStatMBean successShotStat;

    public void registerMBeans(){
        shotCounter = new ShotCounter();
        successShotStat = new SuccessShotStat();

        try {
            ObjectName shotCounterName = new ObjectName("ru.mondayish.mbeans:type=ShotCounter");
            ObjectName successShotStatName = new ObjectName("ru.mondayish.mbeans:type=SuccessShotStat");
            ManagementFactory.getPlatformMBeanServer().registerMBean(shotCounter, shotCounterName);
            ManagementFactory.getPlatformMBeanServer().registerMBean(successShotStat, successShotStatName);
        } catch (JMException e){
            System.out.println("Failed register mbeans");
        }
    }

    public List<Command> getAvailableCommands() {
        return availableCommands;
    }

    public void addShotToHistory(Shot shot) {
        history.addShot(shot);
    }

    public Stream<Shot> getShots(int limit) {
        return history.getShotsStream().limit(limit);
    }

    public void addShotToMBeans(Shot shot) {
        shotCounter.addShot(shot);
        successShotStat.addShot(shot);
    }
}
