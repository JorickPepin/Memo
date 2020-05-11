# -*- coding: utf-8 -*-
"""
Created on Thu May  7 17:38:49 2020

@author: Jorick
"""


nbCases = int(input())

carre = [[0] * nbCases for i in range(nbCases)]

for i in range(nbCases):

    values = input().split()
    for j in range(nbCases):
        carre[i][j] = int(values[j])
        
def is_magic(square):
    magic_sum = 0
    check_sum = 0
    for x in range(len(square)):
        check_sum += square[0][x]
    # check for the sum of the first row as a control sum
    
    for y in range(len(square)):
        for x in range(len(square)):
            magic_sum += square[x][y]
        if magic_sum != check_sum:
            return False
        else:
            magic_sum = 0
    #rows checked
    
    for y in range(len(square)):
        for x in range(len(square)):
            magic_sum += square[y][x]
        if magic_sum != check_sum:
            return False
        else:
            magic_sum = 0
    # columns checked
    
    for x in range(len(square)):
        magic_sum += square[x][x]
    if magic_sum != check_sum:
        return False
    else:
        magic_sum = 0
    # diagonal checked

    for x in range(len(square)):
        magic_sum += square[len(square)-x-1][x]
    if magic_sum != check_sum:
        return False
    else:
        magic_sum = 0
    # contrdiagonal checked
    
    return True

if is_magic(carre):
    print("yes")
else:
    print("no")
