#include<iostream>
using namespace std;

void merge(int array[], int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = 0; 
    int size = high - low + 1;
    int* c = new int[size];

    while (i <= mid && j <= high) {
        if (array[i] <= array[j]) {
            c[k++] = array[i++];
        }
        else {
            c[k++] = array[j++];
        }
    }
    while (i <= mid) {
        c[k++] = array[i++];
    }
    while (j <= high) {
        c[k++] = array[j++];
    }

    
    for (int idx = 0; idx < size; idx++) {
        array[low + idx] = c[idx];
    }

}


void mergeSort(int array[], int low, int high) {
    if (low < high) {
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }
}


void descendingMerge(int array[], int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = 0; 
    int size = high - low + 1;
    int* c = new int[size];

    while (i <= mid && j <= high) {
        if (array[i] >= array[j]) {
            c[k++] = array[i++];
        }
        else {
            c[k++] = array[j++];
        }
    }
    while (i <= mid) {
        c[k++] = array[i++];
    }
    while (j <= high) {
        c[k++] = array[j++];
    }

    
    for (int idx = 0; idx < size; idx++) {
        array[low + idx] = c[idx];
    }

}

void descendingMergeSort(int array[], int low, int high) {
    if (low < high) {
        int mid = (low + high) / 2;
        descendingMergeSort(array, low, mid);
        descendingMergeSort(array, mid + 1, high);
        descendingMerge(array, low, mid, high);
    }
}

void display(int array[], int size) {
    for (int i = 0; i < size; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main() {
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;

    int *array = new int[size];

    cout << "Enter " << size << " elements of the array: ";
    for (int i = 0; i < size; ++i) {
        cin >> array[i];
    }

    mergeSort(array, 0, size - 1);
    cout << "Sorted array: ";
    display(array, size);

    descendingMergeSort(array, 0, size - 1);
    cout << "Sorted array in descending order: ";
    display(array, size);
    return 0;
}

