package music_playlist.processing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;
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
    public void saveData(List<Track> trackList, List<Singer> singerList){        
        
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
           
           for(int i = 0; i < trackList.size() && i < singerList.size(); i++){
               
               pw.println("Композиция № " + k);
               pw.println();
               
               pw.println("Исполнитель: " + singerList.get(i).getNickname());
               pw.println("Композиция: " + trackList.get(i).getTitle());
               pw.println("Жанр: " + trackList.get(i).getGenre());
               pw.println("Продолжительность: " + trackList.get(i).getDuration() + " минут(ы)");
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
        
        String[] titles = new String[filesList.length];
        
        for(int i = 0; i < titles.length; i++){
            
            titles[i] = filesList[i].toString();
            
        }
        
        for (String title : titles) {
            
            System.out.println(title);
            
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
 