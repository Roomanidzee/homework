package processing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;
import entities.Singer;
import entities.Track;
import interfaces.FilesInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class WorkingWithFiles implements FilesInterface{
    //директории для работы с файлами
    private Path dirPath = null;
    private Path counterPath = null;
    private final String ENCODING = "UTF-8";//кодировка для записи в файл
    private Scanner sc;

    public WorkingWithFiles(){

        try {

            this.dirPath = Paths.get("src/main/resources/data").toRealPath();

        } catch (IOException e) {

            System.err.println("Директория с ресурсами не найдена");

        }

        try{

            this.counterPath = Paths.get(this.dirPath.toString(), "counter.txt").toRealPath();

        }catch(IOException er){

            System.err.println("Файл счетчика не найден");

        }

    }

    public Path getDirectory(){

        return this.dirPath;

    }

    public Path getCounter(){

        return this.counterPath;

    }

    public String getEncoding(){

        return this.ENCODING;

    }

    @Override
    public void saveData(List<Track> trackList, List<Singer> singerList){        
        
       File dir = this.dirPath.toFile().getAbsoluteFile();
       
       if(!dir.exists()){
           
           System.err.println("Папка для сохранения данных не найдена");
           System.exit(1);
           
       }
       
       int count = 0;
       
       try{
           
           this.sc = new Scanner(this.counterPath.toFile());
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
       
       try(PrintWriter pw = new PrintWriter(playlist.getAbsoluteFile(), this.getEncoding()))
       {
           
           pw.println("Список композиций: ");
           pw.println();
           
           int k = 1;
           
           for(int i = 0; i < trackList.size() && i < singerList.size(); i++){
               
               pw.println("Композиция № " + k);
               pw.println();
               
               pw.println(singerList.get(i).toString());
               pw.println(trackList.get(i).toString());
               pw.println();
               
               k++;
           }
           
       }catch(FileNotFoundException | UnsupportedEncodingException ex) {
            
            System.err.println("Ошибка с нахождением файла и с кодировкой");
            System.exit(1);
            
       }finally{
            
            System.out.println("Данные успешно сохранены");
            
       }
       
       try(PrintWriter pw1 = new PrintWriter(this.counterPath.toFile()))
       {
           
           pw1.print(count);
           
       }catch(FileNotFoundException error){
            
            System.err.println("Ошибка записи в файл");
            System.exit(1);
            
        }
       
    }
    
    @Override
    public void showSavedData(){
        
        File[] filesList = this.dirPath.toFile().listFiles();
        
        NavigableSet<String> filesSet = new TreeSet<>();

        if (filesList != null) {

            for (File filesList1 : filesList) {

                filesSet.add(filesList1.toString());

            }
        }else{

            throw new NullPointerException("По данному пути нет файлов");

        }

        for (String aFilesSet : filesSet) {

            System.out.println(aFilesSet);

        }
    }
    
    @Override
    public void findFile(){
        
        System.out.print("Пожалуйста, напишите название вашего плейлиста, "
                + "который хотите увидеть(например, playlist#0): ");
        
        Scanner sc1 = new Scanner(System.in);
        
        String name = sc1.nextLine();

        Path filePath = Paths.get(this.dirPath.toString(), name, ".txt");
        
        try{
            
            if(filePath.toFile().exists()){
                
                FileReader fr = new FileReader(filePath.toFile());
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
 