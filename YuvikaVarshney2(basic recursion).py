from typing import List

def printNos(x: int) -> List[int]: 
    # Write your code here
    if x==1:
        a=[]
        a.append(x)
        return a
    else:
        a=[]
        a=printNos(x-1)
        a.append(x)
        return a
    pass
""" Question
you are given an integer n
your task is to return an array containing integers from 1 to n(ascending order) without using loops"""
