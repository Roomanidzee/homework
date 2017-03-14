package music_playlist.processing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import music_playlist.entities.Singer;
import music_playlist.entities.Track;


/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    public static void launch(){
        
        Track track;//инициализация всех необходимых параметров
        Singer singer;
        Set<Track> trackList = new HashSet<>();
        Set<Singer> singerList = new HashSet<>();
        WorkingWithData data = new WorkingWithData();
        WorkingWithFiles files = new WorkingWithFiles();
        ProcessingFunctions func = new ProcessingFunctions();
        
        int LIMIT = 100;//предел работы программы
        
        System.out.println("Добро пожаловать в программу \"Музыкальный плейлист\" !");
        System.out.println("Здесь вы можете составлять свои собственные плейлисты, "
                + "либо читать уже созданные.");
        
        System.out.println("Напишите \"read past playlists\", чтобы прочесть "
                + "созданный плейлист, или \"create new playlist\", "
                + "чтобы создать новый плейлист. ");
        
        Scanner sc = new Scanner(System.in);
        
        String firstCommand = sc.nextLine();
        
        if(firstCommand.equals("read past playlists")){
            
            System.out.println();
            
            System.out.println("Список сохраненных плейлистов: ");
            
            files.showSavedData();
            
            System.out.println();
            
            files.findFile();
            
        }
        
        if(firstCommand.equals("create new playlist")){
            
            Scanner sc_1 = new Scanner(System.in);
            
            System.out.println();
            
            System.out.print("Для начала, напишите количество песен, которое "
                    + "хотите добавить в ваш плейлист: ");
            
            int num = sc_1.nextInt();
            
            System.out.println();
            
            System.out.println("Отлично!");
            
            System.out.println("Напечатайте команду \"add\" , чтобы добавить "
                    + "заданное количество композиций.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"remove\" , чтобы удалить "
                    + "определенную композицию.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"search by title\" , чтобы найти "
                    + "определенную композицию по названию.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"search by genre\" , чтобы найти "
                    + "определенную композицию по жанру.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"search by duration\" , чтобы найти "
                    + "определенную композицию по продолжительности.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"search by singer\" , чтобы найти "
                    + "определенную композицию по имени исполнителя.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"sort by title\" , чтобы "
                    + "отсортировать композиции по названию.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"sort by duration\" , чтобы "
                    + "отсортировать композиции по продолжительности.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"sort by genre\" , чтобы "
                    + "отсортировать композиции по жанру.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"sort by singer\" , чтобы "
                    + "отсортировать композиции по исполнителям.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"save\" , чтобы "
                    + "сохранить плейлист.");
            
            System.out.println();
            
            System.out.println("Напечатайте команду \"exit\" , чтобы "
                    + "выйти из программы.");
            
            System.out.println();
             
            String command;
            
            for(int i = 0; i < LIMIT; i++){
                
                System.out.print("Ваша команда: ");
                
                command = sc.nextLine();
                
                System.out.println();
                
                if(command.equals("exit")){
                    
                    System.out.println("Спасибо за использование данной программы!");
                    i = LIMIT;
                    
                }
                
                if(command.equals("add")){
                    
                    Scanner sc1 = new Scanner(System.in);
                    Scanner sc2 = new Scanner(System.in);
                    Scanner sc3 = new Scanner(System.in);
                    Scanner sc4 = new Scanner(System.in);
                    
                    System.out.println("Вам необходимо ввести название трека"
                            + ", имя исполнителя, жанр композиции, "
                            + "продолжительность трека, который вы хотите "
                            + "добавить");
                    
                    String title, nickname, genre;
                    double duration;
                    
                    int k = 1;
                    
                    for(int z = 0; z < num; z++){
                        
                        System.out.println();
                        
                        System.out.println("Трек №" + k);
                         
                        System.out.print("Введите название трека: ");
                        title = sc1.nextLine();
                    
                        System.out.println();
                    
                        System.out.print("Введите имя исполнителя: ");
                        nickname = sc2.nextLine();
                    
                        System.out.println();
                    
                        System.out.print("Введите жанр композиции: ");
                        genre = sc3.nextLine();
                    
                        System.out.println();
                    
                        System.out.print("Введите продолжительность трека: ");
                        duration = sc4.nextDouble();
                    
                        System.out.println();
                    
                        data.add(title, duration, nickname, genre);
                    
                        track = new Track(title, duration, genre);
                        singer = new Singer(nickname);
                    
                        trackList.add(track);
                        singerList.add(singer);
                    
                        k++; 
                         
                    }     
                    
                    i++;
                    
                }
                
                if(command.equals("remove")){
                    
                    System.out.println();
                    
                    System.out.println("Вам необходимо ввести название трека"
                            + ", имя исполнителя, жанр композиции, "
                            + "продолжительность трека, который вы хотите "
                            + "удалить");
                    
                    String title, nickname, genre;
                    double duration;
                    
                    System.out.print("Введите название трека: ");
                    title = sc.nextLine();
                    
                    System.out.println();
                    
                    System.out.print("Введите имя исполнителя: ");
                    nickname = sc.nextLine();
                    
                    System.out.println();
                    
                    System.out.print("Введите жанр композиции: ");
                    genre = sc.nextLine();
                    
                    System.out.println();
                    
                    System.out.print("Введите продолжительность трека: ");
                    duration = sc.nextDouble();
                    
                    System.out.println();
                    
                    data.remove(title, duration, nickname, genre);
                    
                    track = new Track(title, duration, genre);
                    singer = new Singer(nickname);
                    
                    trackList.remove(track);
                    singerList.remove(singer);
                    
                    System.out.println("Удалено");
                    
                }
                
                if(command.equals("search by title")){
                    
                    System.out.println();
                    
                    System.out.print("Пожалуйста, введите название, которое вы хотите найти: ");
                    
                    String title = sc.nextLine();
                    
                    int k = 0;
                    
                    System.out.println();
                    
                    Iterator<Track> track_iter = trackList.iterator();
                    Iterator<Singer> singer_iter = singerList.iterator();
                    
                    Track temp1;
                    Singer temp2;
                    
                    while(track_iter.hasNext() && singer_iter.hasNext()){
                        
                        temp1 = track_iter.next();
                        temp2 = singer_iter.next();
                        
                        if(func.searchString(temp1.getTitle(), title)){
                            
                            System.out.println("Название: " + 
                                    temp1.getTitle());
                            System.out.println("Исполнитель: " + 
                                    temp2.getNickname());
                            System.out.println("Жанр: " + 
                                    temp1.getGenre());
                            System.out.println("Продолжительность: " + 
                                    temp1.getDuration() + 
                                    " минут(ы)");
                            
                            System.out.println();
                            
                        }else{
                            
                            k++;
                            
                        }
                        
                    }
                    
                    if(k == trackList.size() && k == singerList.size()){
                        
                        System.err.println("Нет такого исполнителя.");
                        
                    }
                    
                    i++;
                    
                }
                
                if(command.equals("search by genre")){
                    
                    System.out.println();
                    
                    System.out.print("Пожалуйста, введите жанр, который вы хотите найти: ");
                    
                    String genre = sc.nextLine();
                    
                    int k = 0;
                    
                    System.out.println();
                    
                    Iterator<Track> track_iter = trackList.iterator();
                    Iterator<Singer> singer_iter = singerList.iterator();
                    
                    Track temp1;
                    Singer temp2;
                    
                    while(track_iter.hasNext() && singer_iter.hasNext()){
                        
                        temp1 = track_iter.next();
                        temp2 = singer_iter.next();
                        
                        if(func.searchString(temp1.getGenre(), genre)){
                            
                            System.out.println("Название: " + 
                                    temp1.getTitle());
                            System.out.println("Исполнитель: " + 
                                    temp2.getNickname());
                            System.out.println("Жанр: " + 
                                    temp1.getGenre());
                            System.out.println("Продолжительность: " + 
                                    temp1.getDuration() + 
                                    " минут(ы)");
                            
                            System.out.println();
                            
                        }else{
                            
                            k++;
                            
                        }
                        
                    }
                    
                    if(k == trackList.size() && k == singerList.size()){
                        
                        System.err.println("Нет такого жанра");
                        
                    }
                
                    i++;
                }
                
                if(command.equals("search by duration")){
                    
                    System.out.println();
                    
                    System.out.println("Пожалуйста, введите границы, в пределах которых "
                            + "вы хотите найти нужную вам продолжительность");
                    
                    double start = sc.nextDouble();
                    double end = sc.nextDouble();
                    
                    if(start > end){
                        
                        System.err.println("Неверный ввод");
                        i++;
                        
                    }
                    
                    
                    
                    System.out.println();
                    
                    Iterator<Track> track_iter = trackList.iterator();
                    Iterator<Singer> singer_iter = singerList.iterator();
                    
                    Track temp1;
                    Singer temp2;
                    
                    int k = 0;
                    
                    while(track_iter.hasNext() && singer_iter.hasNext()){
                        
                        temp1 = track_iter.next();
                        temp2 = singer_iter.next();
                        
                        if(func.searchTime(temp1.getDuration(), start, end)){
                            
                            System.out.println("Название: " + 
                                    temp1.getTitle());
                            System.out.println("Исполнитель: " + 
                                    temp2.getNickname());
                            System.out.println("Жанр: " + 
                                    temp1.getGenre());
                            System.out.println("Продолжительность: " + 
                                    temp1.getDuration() + 
                                    " минут(ы)");
                            
                            System.out.println();
                            
                        }else{
                            
                            k++;
                            
                        }
                        
                      }
                     
                     if(k == trackList.size() && k == singerList.size()){
                        
                        System.err.println("Нет такой продолжительности");
                        
                    }
                    
                     i++;
                    
                    }
                    
                    if(command.equals("search by singer")){
                    
                       System.out.println();
                    
                       System.out.print("Введите псевдоним исполнителя, которого вы "
                            + "хотите найти: ");
                    
                       String nickname = sc.nextLine();
                    
                       System.out.println();
                    
                        
                       Iterator<Track> track_iter = trackList.iterator();
                       Iterator<Singer> singer_iter = singerList.iterator();
                    
                       Track temp1;
                       Singer temp2;
                    
                       int k = 0;
                    
                       while(track_iter.hasNext() && singer_iter.hasNext()){
                        
                           temp1 = track_iter.next();
                           temp2 = singer_iter.next();
                        
                          if(func.searchString(temp2.getNickname(), nickname)){
                            
                            System.out.println("Название: " + 
                                    temp1.getTitle());
                            System.out.println("Исполнитель: " + 
                                    temp2.getNickname());
                            System.out.println("Жанр: " + 
                                    temp1.getGenre());
                            System.out.println("Продолжительность: " + 
                                    temp1.getDuration() + 
                                    " минут(ы)");
                            
                            System.out.println();
                            
                          }else{
                            
                              k++;
                            
                          }
                    
                           if(k == trackList.size() && k == singerList.size()){
                        
                                System.err.println("Нет такого исполнителя");
                        
                           }
                    
                           i++;
                       }
                
                if(command.equals("sort by title")){
                    
                    List<String> sortedTracks = func.sortTrackTitle(trackList);
                    
                    System.out.println("Отсортированный плейлист по названиям: ");
                    
                    System.out.println();
                    
                    for(int j = 0; j < sortedTracks.size(); j++){
                        
                        System.out.println("Название: " + 
                                    sortedTracks.get(j));
                        
                    }
                    
                    i++;
                }
                
                if(command.equals("sort by duration")){
                    
                    List<Double> sortedTracks = func.sortTrackDuration(trackList);
                    
                    System.out.println("Отсортированный плейлист по названиям: ");
                    
                    System.out.println();
                    
                    for(int j = 0; j < sortedTracks.size(); j++){
                        
                        System.out.println("Длительность: " + 
                                    sortedTracks.get(j));
                        
                    }
                    
                    i++;
                    
                }
                
                if(command.equals("sort by genre")){
                    
                    List<String> sortedTracks = func.sortTrackGenre(trackList);
                    
                    System.out.println("Отсортированный плейлист по названиям: ");
                    
                    System.out.println();
                    
                    for(int j = 0; j < sortedTracks.size(); j++){
                        
                        System.out.println("Жанр: " + 
                                    sortedTracks.get(j));
                        
                    }
                    
                    i++;
                    
                }
                
                if(command.equals("sort by singer")){
                    
                    List<String> sortedTracks = func.sortSinger(singerList);
                    
                    System.out.println("Отсортированный плейлист по названиям: ");
                    
                    System.out.println();
                    
                    for(int j = 0; j < sortedTracks.size(); j++){
                        
                        System.out.println("Название: " + 
                                    sortedTracks.get(j));
                        
                    }
                    
                    i++;
                    
                }
                
                if(command.equals("save")){
                    
                    files.saveData(trackList, singerList);
                    i++;
                    
                }
                    
            }               
        }
    }
  }
}    
