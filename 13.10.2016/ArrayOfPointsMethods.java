import java.util.Arrays;


public class ArrayOfPointsMethods {
	private int size = 0;//variable for count the size of array
	Object [] array;// initializing array. I use the Object[] type to avoid NullPointException
	

	public ArrayOfPointsMethods(){//transfer the array to viewer

		array = new Object[20];

		

	}
    
    Object get( int index){//realization of method "get"
    	if (index < size){

    		return array[index];

    	} else{

    		throw new ArrayIndexOutOfBoundsException();

    	}
    }

    void increaseArraySize(){// in case of ArrayIndexOutOfBoundsEception increase the size of Array

    	array = Arrays.copyOf(array, array.length * 2);

    }

    void add(Object obj){//realization of method "add"

    	if(array.length - size <= 10){

    		increaseArraySize();

    	}
    	array[size++] = obj;
    }

    Object remove(int index){//realization of method "remove"

    	if(index < size){

    		Object obj = array[index];
    		array[index] = null;
    		Integer tmp = index;
    		while(tmp < size){

    			array[tmp] = array[tmp + 1];
    			array[tmp+1] = null;
    			tmp++;

    		}
    		size--;
    		return obj;
    	} else{

    		throw new ArrayIndexOutOfBoundsException();

    	}

    }

    int newSize(){// return the size of array

    	return size;

    }




    
}
