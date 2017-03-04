package collection_implementation;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MyCollection<E> extends AbstractCollection<E>{

    private E[] valueArray;//массив для хранения данных
    private int size = 0;//счетчик размера
    private Iterator<E> iter;//переменная для итератора
    private int k = 0;//счетчик для проверки массива
    private int index = 0;//переменная для хранения индекса массива
    
    public MyCollection(){
        
        this.valueArray = (E[]) new Object[20];
        
    }
       
    private class MyIterator<E> implements Iterator<E>{
        //реализация итератора
        private int current = 0;
        private E value;
        
        @Override
        public boolean hasNext() {
            
            return this.current < size;
            
        }

        @Override
        public E next() {
            
            if(!hasNext()){
                
                throw new NoSuchElementException("No such element");
                
            }
            
            this.value = (E) valueArray[this.current];
            this.current++;
            return this.value;
            
        }
        
    }    
    
    @Override
    public boolean add(E e){
        //добавляет элемент в колллекцию
        if(e == null){
            
            throw new NullPointerException("There are no null elements in this"
                    + " collection");
            
        }
        
        if(e.getClass().isMemberClass()){
            
            throw new IllegalArgumentException("You can't add classes in this "
                    + "collection");
            
        }
        
        if(contains(e)){
            
            throw new IllegalStateException("You can't add equal elements in "
                    + "this collecion");
            
        }
        
        if(this.valueArray.length - this.size <= 10){
            
            increaseArraySize();
            
        }
        
        this.valueArray[this.size] = e;
        this.size++;
        return true;
        
    }
    
    public boolean addAll(MyCollection<? extends E> c){
        //добавляет другую коллекцию в первоначальную
        Iterator<E> iter1 = (Iterator<E>) c.iterator();
        
        while(iter1.hasNext()){
            
            if(iter1.next() == null){
                
                throw new NullPointerException("You can't add collection "
                        + "with null elements");
                
            }
            
        }
        
        if(!(c instanceof MyCollection<?>)){
            
            throw new IllegalArgumentException("You can't work with that "
                    + "collection");
            
        }
        
        if(containsAll(c)){
            
            throw new IllegalStateException("You can't add equal elements in "
                    + "this collecion");
            
        }
        
        this.iter = (Iterator<E>) c.iterator();
        
        while(this.iter.hasNext()){
            
            add(this.iter.next());
            
        }
        
        return true;
        
    }
    
    @Override
    public void clear(){
        //очищает коллекцию
        this.size = 0;
        
    }
    
    @Override
    public boolean contains(Object obj){
        //проверяет на существование элемент в коллекции
        if(obj == null){
            
            throw new NullPointerException("There are no null objects "
                    + "in tnis collection");
            
        }
        
        for(int i = 0; i < size(); i++){
            
            if(this.valueArray[i] == obj){
                
                return true;
                
            }
            
        }
        
        return false;
        
    }
    
    public boolean containsAll(MyCollection<?> c){
        //проверяет на существование элементы другой коллекции в первоначальной
        Iterator<E> iter1 = (Iterator<E>) c.iterator();
        
        while(iter1.hasNext()){
            
            if(iter1.next() == null){
                
                throw new NullPointerException("You can't check collection "
                        + "with null elements");
                
            }
            
        }
        
        
        
        int counter = 0;
        
        for(int i = 0; i < size(); i++){
            
            this.iter = (Iterator<E>) c.iterator();
            
            while(iter.hasNext()){
            
                 if(this.valueArray[i] == iter.next()){
                
                      counter++;
                
                   }
            
            } 
            
        }
        
        return counter == c.size();
        
    }
    
    private void increaseArraySize(){
        //увеличение размера массива в случае нехватки места
        this.valueArray = Arrays.copyOf(this.valueArray, this.valueArray.length * 2);
        
    }

    @Override
    public int hashCode() {
        //генерация хэшкода для коллекции
        int hash = 5;
        hash = 89 * hash + Arrays.deepHashCode(this.valueArray);
        hash = 89 * hash + this.size;
        return hash;
        
    }
    
    @Override
    public boolean equals(Object obj){
        //проверка на равенство коллекций
        if(obj != null){
            
             
            if(!(obj instanceof MyCollection<?>)){
            
                 return false;
            
            } else {
            
                 MyCollection<?> collection = (MyCollection<?>) obj;
            
                 return (collection.size() == this.size && collection.hashCode() == hashCode());
            
            }      
            
        } else {
            return false;
        }
       
    }

    @Override
    public boolean isEmpty(){
        //проверка коллекции на полноту
        return this.size == 0;
        
    }   
    
    @Override
    public Iterator<E> iterator() {
        //возвращает экземпляр итератора
        return new MyIterator();
        
    }
    
    @Override
    public boolean remove(Object o){
        //удаляет элементы из коллекции
        if(o == null){
            
            throw new NullPointerException("There are no null elements in this "
                    + "collection");
            
        }
        
        for(int i = 0;i < size();i++){
            
            if(this.valueArray[i] == o){
                
                this.index = i;
                break;
                
            }else{
                
                this.k++;
                
            }
            
        }
        
        if(this.k == size()){
            
            throw new NoSuchElementException("No such element");
            
        }
        
        this.valueArray[index] = null;
        int temp = index;
        
        while(temp < this.size){
            
            this.valueArray[temp] = this.valueArray[temp + 1];
            this.valueArray[temp + 1] = null;
            
            temp++;
            
        }
        
        this.size--;
        
        return true;
        
    }
    
    public boolean removeAll(MyCollection<?> c){
        //удаляет элементы другой коллекции из первоначальной
        Iterator<E> iter1 = (Iterator<E>) c.iterator();
        
        while(iter1.hasNext()){
            
            if(iter1.next() == null){
                
                throw new NullPointerException("You can't remove collection "
                        + "with null elements");
                
            }
            
        }
        
        for(int i = 0; i < size(); i++){
            
            this.iter = (Iterator<E>) c.iterator();
            
            while(iter.hasNext()){
            
               if(this.valueArray[i] == iter.next()){
                
                    remove(this.valueArray[i]);
                
                }
            
            }
        }
        
        return true;
        
    }
    
    public boolean retainAll(MyCollection<?> c){
        //удаляет те элементы из первоначальной коллекции,
        //которых нет в другой коллекции
        Iterator<E> iter1 = (Iterator<E>) c.iterator();
        
        while(iter1.hasNext()){
            
            if(iter1.next() == null){
                
                throw new NullPointerException("You can't retain collection "
                        + "with null elements");
                
            }
            
        }
        
        for(int i = 0; i < size(); i++){
            
            this.iter = (Iterator<E>) c.iterator();
            
            while(this.iter.hasNext()){
            
               if(this.valueArray[i] != this.iter.next()){
                
                   remove(this.valueArray[i]);
                
               }
            
            }
            
        }
        
        return true;
        
    }
    
    @Override
    public int size(){
        //выводит размер коллекции
        if(this.size > Integer.MAX_VALUE){
            
            return Integer.MAX_VALUE;
            
        }
        
        return this.size;
        
    }
    
    @Override
    public Object[] toArray(){
        //превращает коллекцию в массив
        this.iter = iterator();
        Object[] array = new Object[size()];
        
        for(int i = 0; i < array.length; i++){
            
            array[i] = iter.next();
            
        }
        
        return array;
        
    }
    
    @Override
    public <T> T[] toArray(T[] a){
       //превращает коллекцию в массив определенного типа 
       if(a == null){
           
           throw new NullPointerException("Specified array can't be null");
           
       }
       
       if(!a.getClass().isArray()){
           
           throw new ArrayStoreException("You can't store elements there");
           
       }
       
       this.iter = iterator();
       
       while(iter.hasNext()){
       
            for(int i = 0; i < a.length; i++){
           
                    a[i] = (T) this.iter.next();
                
               }    
           
       }
        
       return a;
       
    }
}


