package Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Meal_List<T> {
    List<T> ls = new ArrayList<>();

    public void addFeeding(T ml){
        ls.add(ml);
    }

    public List<T> getLs(){
        return ls;
    }

    public int size() {
        return ls.size();
    }

    public T get(int i) {
        return ls.get(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ls.size(); i++) {
            sb.append(ls.get(i).toString() + "\n");
        }
        return sb.toString();
    }
}
