/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   bubble_sort.cpp
 * Author: argshub
 *
 * Created on February 15, 2018, 2:17 PM
 */

#include <iostream>

using namespace std;

template <typename T>
T *bubble_sort(T *array_of_data, int length);

int main(int argc, char** argv) {
    
    int IntegerData[] = {5, 2, 9, 1, 8, 3, 7, 4, 6};
    char CharacterData[] = {'e', 's', 'x', 'r', 'f', 'c', 't', 'j', 'a'};
    
    bubble_sort(IntegerData, 9);
    for(int i = 0; i < 9; i++) cout << *(IntegerData+i) << "\t";
    cout << "\n";
    
    bubble_sort(CharacterData, 9);
    for(int i = 0; i < 9; i++) cout << *(CharacterData+i) << "\t";
    return 0;
}


template <typename T>
T *bubble_sort(T *array_of_data, int length) {
    for(int i = 0; i < length; i++)
        for(int j = 0; j < length - i - 1; j++) 
            if(*(array_of_data+j) > *(array_of_data+j+1)) {
                int swap = *(array_of_data+j+1);
                *(array_of_data+j+1) = *(array_of_data+j);
                *(array_of_data+j) = swap;
            }
}
