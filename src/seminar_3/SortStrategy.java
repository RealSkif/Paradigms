package seminar_3;
//Далее этот интерфейс можно вставлять полем в класс и выбирать конкретную реализацию сортировки
public interface SortStrategy {
    void sort();
}
class BubbleSort implements SortStrategy{
    @Override
    public void sort() {
        System.out.println("Array is sorted by bubble sorting");
    }
}
class QuickSort implements SortStrategy{
    @Override
    public void sort() {
        System.out.println("Array is sorted by quick sorting");
    }
}
class MergeSort implements SortStrategy{
    @Override
    public void sort() {
        System.out.println("Array is sorted by merge sorting");
    }
}

