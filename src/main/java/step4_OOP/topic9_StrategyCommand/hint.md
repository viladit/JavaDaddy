# Подсказка

1. **Интерфейс Command:**
    - Создайте интерфейс `Command` с одним методом `void execute()`.
    - Пометьте его аннотацией `@FunctionalInterface` (опционально, для ясности).

2. **Конкретные команды:**
    - Создайте классы `StartCommand`, `StopCommand` и `PauseCommand`, реализующие интерфейс `Command`.
    - В методе `execute()` каждой команды реализуйте логику, например, вывод сообщения "Starting...", "Stopping...", "
      Pausing...".

3. **Класс-обработчик команд (CommandProcessor):**
    - Создайте класс, который содержит поле типа `Map<String, Command>`.
    - В конструкторе зарегистрируйте команды, сопоставив строковые ключи (например, "start", "stop", "pause") с
      объектами команд.
    - Реализуйте метод `process(String commandKey)`, который извлекает из карты команду по ключу и вызывает её метод
      `execute()`. Если команда не найдена – выведите сообщение об этом.

4. **Класс с методом main:**
    - Создайте класс (например, `StrategyCommandDemo`), в котором в методе `main` считывается аргумент командной
      строки (или задается значение по умолчанию).
    - Создайте экземпляр `CommandProcessor` и вызовите его метод `process()` с переданным ключом.

5. **Проверка:**
    - Запустите программу с различными аргументами (например, "start", "stop", "pause", "unknown") и проверьте
      корректность работы.

Эти шаги помогут вам заменить конструкцию switch-case на гибкую и расширяемую систему с использованием Strategy +
Command.
