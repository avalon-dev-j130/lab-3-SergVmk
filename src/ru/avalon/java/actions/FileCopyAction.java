package ru.avalon.java.actions;

import java.io.File;
import java.nio.file.Files;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action {
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        File filein = new File("c:/sk/1/forcopy.txt");
        File filedest = new File("c:/sk/2/forcopy.txt");
        try
        {
            Files.copy(filein.toPath(), filedest.toPath());
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
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        //Нет необходимости в текущей реализации
        
    }
}
