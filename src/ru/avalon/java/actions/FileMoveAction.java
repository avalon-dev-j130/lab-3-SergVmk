package ru.avalon.java.actions;

import java.io.File;
import java.nio.file.Files;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №4 Реализуйте метод run класса FileMoveAction
         */
        File filein = new File("c:/sk/1/formove.txt");
        File filedest = new File("c:/sk/2/formove.txt");
        try
        {
            Files.move(filein.toPath(), filedest.toPath());
        }
        catch (Exception e)
        {
            //this.close();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        //Нет необходимости в текущей реализации
        throw new UnsupportedOperationException("Not implemented yet!");
    }

}
