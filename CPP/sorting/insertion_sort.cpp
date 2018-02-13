/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include <iostream>
using namespace std;

template <typename T>
T *insertion_sort(T *array_of_data, int length);

int main() {
    int IntegerData[] = {5, 2, 9, 1, 8, 3, 7, 4, 6};
    char CharacterData[] = {'e', 's', 'x', 'r', 'f', 'c', 't', 'j', 'a'};
    insertion_sort(IntegerData, 9);
    for(int i = 0; i < 9; i++) cout << *(IntegerData+i) << "\t";
    cout << "\n";
    insertion_sort(CharacterData, 9);
    for(int i = 0; i < 9; i++) cout << *(CharacterData+i) << "\t";
    return 0;
}


template <typename T>
T *insertion_sort(T *array_of_data, int length) {
    int leftIndex = 0; T currentElement;
    for(int i = 1; i < length; i++) {
        currentElement = *(array_of_data+i), leftIndex = i - 1;
        while(leftIndex >= 0 && currentElement < *(array_of_data+leftIndex)) *(array_of_data+leftIndex+1) = *(array_of_data+leftIndex--);
        *(array_of_data+(++leftIndex)) = currentElement;
    }
}