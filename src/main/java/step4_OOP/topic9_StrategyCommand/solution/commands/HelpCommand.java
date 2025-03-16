package step4_OOP.topic9_StrategyCommand.solution.commands;

import step4_OOP.topic9_StrategyCommand.solution.commands.utils.CommandInterface;

public class HelpCommand implements CommandInterface {
    @Override
    public void execute() {
        System.out.println("start -> Запуск программы");
        System.out.println("stop -> Остановка программы");
        System.out.println("pause -> Приостановка программы");
        System.out.println("help -> Вывести список доступных команд");
        System.out.println("exit -> Выход из программы");
    }
}
