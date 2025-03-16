package step4_OOP.topic9_StrategyCommand.solution;

import step4_OOP.topic9_StrategyCommand.solution.commands.*;
import step4_OOP.topic9_StrategyCommand.solution.commands.utils.CommandInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandProcessor {
    private Map<String, CommandInterface> commands = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    CommandProcessor() {
        commands.put("start", new StartCommand());
        commands.put("stop", new StopCommand());
        commands.put("pause", new PauseCommand());
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
    }

    public void processCommands() {
        while (true) {
            System.out.print("Введите команду -> ");
            CommandInterface command = commands.get(input.next());
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Команды не существует!");
            }
        }
    }
}
