package music_playlist.processing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import music_playlist.entities.Singer;
import music_playlist.entities.Track;
import music_playlist.interfaces.FilesInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class WorkingWithFiles implements FilesInterface{
    //директории для работы с файлами
    private final File directory = new File("src\\music_playlist\\data");
    private final File counter = new File(this.directory + "\\" + "counter.txt");
    private final String ENCODING = "UTF-8";//кодировка для записи в файл
    private Scanner sc;
    
    
    @Override
    public void saveData(Set<Track> trackList, Set<Singer> singerList){        
        
       File dir = this.directory.getAbsoluteFile();
       
       if(!dir.exists()){
           
           System.err.println("Папка для сохранения данных не найдена");
           System.exit(1);
           
       }
       
       int count = 0;
       
       try{
           
           this.sc = new Scanner(this.counter);
           count = this.sc.nextInt();
           count++;
           
       }catch(FileNotFoundException ex){
           
           System.err.println("Файл счетчика не найден");
           System.exit(1);
           
       }       
       
       File playlist = new File(dir + "\\" + "playlist#" + count + ".txt");
       
       if(!playlist.exists()){
           
           try{
               
               playlist.createNewFile();
               
           }catch(IOException ex){
               
               System.err.println("Ошибка создания файла");
               System.exit(1);
               
           }
           
       }
       
       try(PrintWriter pw = new PrintWriter(playlist.getAbsolutePath(), this.ENCODING))
       {
           
           pw.println("Список композиций: ");
           pw.println();
           
           int k = 1;
           
           Iterator<Track> track_iter = trackList.iterator();
           Iterator<Singer> singer_iter = singerList.iterator();
                    
           Track temp1;
           Singer temp2;
           
          while(track_iter.hasNext() && singer_iter.hasNext()){
               
               temp1 = track_iter.next();
               temp2 = singer_iter.next();              
              
               pw.println("Композиция № " + k);
               pw.println();
               
               pw.println("Исполнитель: " + temp2.getNickname());
               pw.println("Композиция: " + temp1.getTitle());
               pw.println("Жанр: " + temp1.getGenre());
               pw.println("Продолжительность: " + temp1.getDuration() + " минут(ы)");
               pw.println();
               
               k++;
           }
           
       }catch(FileNotFoundException | UnsupportedEncodingException ex) {
            
            System.err.println("Ошибка с нахождением файла и с кодировкой");
            System.exit(1);
            
       }finally{
            
            System.out.println("Данные успешно сохранены");
            
       }
       
       try(PrintWriter pw1 = new PrintWriter(this.counter))
       {
           
           pw1.print(count);
           
       }catch(FileNotFoundException error){
            
            System.err.println("Ошибка записи в файл");
            System.exit(1);
            
        }
       
    }
    
    @Override
    public void showSavedData(){
        
        File[] filesList = this.directory.listFiles();
        
        NavigableSet<String> filesSet = new TreeSet<>();
        
        for (File filesList1 : filesList) {
            
            filesSet.add(filesList1.toString());
            
        }
        
        Iterator<String> iter = filesSet.iterator();
        
        while(iter.hasNext()){
            
            System.out.println(iter.next());
            
        }
    }
    
    @Override
    public void findFile(){
        
        System.out.print("Пожалуйста, напишите название вашего плейлиста, "
                + "который хотите увидеть(например, playlist#0): ");
        
        Scanner sc1 = new Scanner(System.in);
        
        String name = sc1.nextLine();
        
        File file = new File(this.directory + "\\" + name + ".txt");
        
        try{
            
            if(file.exists()){
                
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                
                String line = reader.readLine();
                
                while(line != null){
                    
                    System.out.println(line);
                    
                    line = reader.readLine();
                    
                }
                
            }else{
                
                System.out.println("Вы не создавали плейлиста с таким номером");
                
            }
            
        }catch(FileNotFoundException error1){
                                
           System.err.println("Данный файл не найден");
                                
        }catch(IOException error2){
                                
           System.err.println("У вас возникли проблемы с файлом");
                                
        }
        
    }
    
}
 