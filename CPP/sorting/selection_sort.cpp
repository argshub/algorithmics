/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   selection_sort.cpp
 * Author: argshub
 *
 * Created on February 12, 2018, 8:39 PM
 */

#include <iostream>

template <typename T>
T *selection_sort(T *array_of_data, int length);

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int IntegerData[] = {5, 2, 9, 1, 8, 3, 7, 4, 6};
    char CharacterData[] = {'e', 's', 'x', 'r', 'f', 'c', 't', 'j', 'a'};
    selection_sort(IntegerData, 9);
    for(int i = 0; i < 9; i++) cout << *(IntegerData+i) << "\t";
    cout << "\n";
    selection_sort(CharacterData, 9);
    for(int i = 0; i < 9; i++) cout << *(CharacterData+i) << "\t";
    return 0;
}


template <typename T>
T *selection_sort(T *array_of_data, int length) {
    for(int i = 0; i < length;i ++) {
        T *minimum_address = (array_of_data+i);
        for(int j = i + 1; j < length; j++) {
            if(*minimum_address > *(array_of_data + j)) minimum_address = (array_of_data+j); 
        }
        T swap = *(array_of_data+i);
        *(array_of_data+i) = *minimum_address;
        *minimum_address = swap;
    }
    return array_of_data;
}