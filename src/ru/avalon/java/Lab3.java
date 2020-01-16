package ru.avalon.java;

import java.io.File;
import ru.avalon.java.console.ConsoleUI;

import java.io.IOException;
import java.nio.file.Files;
import ru.avalon.java.actions.FileCopyAction;
import ru.avalon.java.actions.FileMoveAction;

/**
 * Лабораторная работа №3
 * <p>
 * Курс: "Программирование на платформе Java. Разработка
 * многоуровневых приложений"
 * <p>
 * Тема: "Потоки исполнения (Threads) и многозадачность" 
 *
 * @author Daniel Alpatov <danial.alpatov@gmail.com>
 */
public class Lab3 extends ConsoleUI<Commands> {
    /**
     * Точка входа в приложение.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        new Lab3().run();
    }
    /**
     * Конструктор класса.
     * <p>
     * Инициализирует экземпляр базового типа с использоавнием
     * перечисления {@link Commands}.
     */
    Lab3() {
        super(Commands.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCommand(Commands command) throws IOException {
        switch (command) {
            case copy:
                /*
                 * TODO №6 Обработайте команду copy
                 */
                FileCopyAction fCopy = new FileCopyAction();
                fCopy.start();
                break;
            case move:
                /*
                 * TODO №7 Обработайте команду move
                 */
                FileMoveAction fMove = new FileMoveAction();
                fMove.start();
                break;
            case exit:
                close();
                break;
            
                /*
                 * TODO №9 Обработайте необработанные команды
                 */
                case del:
            {
                File filedel = new File("c:/sk/1/fordel.txt");
                try
                {
                    Files.delete(filedel.toPath());
                }
                catch (Exception e)
                {
            
                }
                
            }
            break;
            case undo:
            {
                File undomove = new File("c:/sk/2/formove.txt");
                File undomove2 = new File("c:/sk/1/formove.txt");
                try
                {
                    if (Files.exists(undomove.toPath()))
                    {
                        Files.move(undomove.toPath(), undomove2.toPath());
                    }
                }
                catch (Exception e)
                {
            
                }
            }
                break;
        }
    }
    
}
