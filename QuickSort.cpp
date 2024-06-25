#include <iostream>
using namespace std;

class QuickSort {
private:
    int* array;

public:
    QuickSort(int arr[], int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = arr[i];
        }
    }

    int partition(int low, int high) {
        int pivot = array[low];
        int left = low + 1;
        int right = high;

        do {
            while(array[left] >= pivot){
                left++;
            }
            while(array[right] < pivot){
                right--;
            }
            if(left < right){
                swap(array[left], array[right]);
            }
        } while (left <= right);

        swap(array[low], array[right]);
        return right;
    }

    void quickSort(int low, int high) {
        if (low < high){
            int j = partition(low, high);
            quickSort(low, j - 1);
            quickSort(j + 1, high);
        }
    }

    void display() {
        for (int i = 0; i < 7; i++) {
            cout << array[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    int array[] = { 322, 10, 15, 123, 576, 45, 89 };
    int size = sizeof(array) / sizeof(array[0]);

    QuickSort sort(array, size);

    sort.quickSort(0, size - 1);
    sort.display();

    return 0;
}
