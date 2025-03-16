package step4_OOP.topic9_StrategyCommand.solution.commands;

import step4_OOP.topic9_StrategyCommand.solution.commands.utils.CommandInterface;

public class StopCommand implements CommandInterface {
    @Override
    public void execute() {
        System.out.println("Stopping...");
    }
}
