package ru.mondayish.managers;

import ru.mondayish.commands.*;
import ru.mondayish.mbeans.ShotCounter;
import ru.mondayish.mbeans.ShotCounterMBean;
import ru.mondayish.mbeans.SuccessShotStat;
import ru.mondayish.mbeans.SuccessShotStatMBean;
import ru.mondayish.model.History;
import ru.mondayish.model.Shot;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ShotManager {

    private final List<Command> availableCommands =
            Arrays.asList(new ExitCommand(), new HelpCommand(), new HistoryCommand(), new ShotCommand());
    private final History history = new History();

    private final ShotCounterMBean shotCounter = new ShotCounter();
    private final SuccessShotStatMBean successShotStat = new SuccessShotStat();


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
