package exercise1_2;

import java.util.*;

public class TestArray<T> {
    T[]array;

    public void setArray(T[] array) {
        this.array = array;
    }

    T[]replace(T[]array){                  //задание 1
        if(array[0]!=null&&array[1]!=null){
            T[]arRepl=array.clone();
            arRepl[0]=array[1];
            arRepl[1]=array[0];
            return arRepl;
        }
        return null;
    }

    ArrayList<T>arrayToList(T[]array){      //задание 2
        ArrayList<T>arrayList=new ArrayList<>();
        Collections.addAll(arrayList,array);
        return arrayList;
    }
}
