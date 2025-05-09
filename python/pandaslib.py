# # first pro of kirtan
# # age=20
# # hight=45.6
# # print("age is",age)
# # print("hight is",hight)

# # second pro kirtan
# # a=int(input("enter the no 1"))
# # b=int(input("enter the no 1"))
# # c=a+b
# # print("the sum is",c)
# # swap value without using third variable
# # a=int(input("enter the no 1"))
# # b=int(input("enter the no 1"))
# # print("before swapping")
# # print("a=",a)
# # print("b=",b)
# # a=a+b
# # b=a-b
# # a=a-b
# # print("afther swapping")
# # print("a=",a)
# # print("b=",b)
# # third for kirtan
# # a=10
# # b=20
# # temp=a
# # a=b
# # b=temp
# # print("a is",a)
# # print("b is",b)
# # print("temp is",temp)

# # fourth for kirtan
# # for i in range(0,50):
# #     if  i%2==0:
# #      print("no is even",i)
# # else:
# #     print("no is odd",i)

# # fifth for kirtan
# # i=float(input("enter the no"))
# # if i>0:
# #     print("no is positive")
# # elif i<0:
# #     print("no is negative")
# # elif i==0:
# #     print("no is zero")
# # else:
# #     print("no is not a num")

# # sixth for kirtan
# # i=int(input("enter the no"))
# # if i%3==0:
# #     print("no is devided by 3")
# # elif i%5==0:
# #     print("no is devided by 5")
# # else:
# #     print("no is not devided 3 and 5")

# # seventh for kirtan factorial of the no
# # i=int(input("enter the no"))
# # for j in range (5,0):
# # c=j*j
# # print(c)

# # first krupa simple intrest
# # p=float(input("enter the principale of the no"))
# # r=float(input("enter the rate"))
# # y=float(input("enter the year"))
# # ci=p*r*y/100
# # print("simple intrest is ",ci)

# # second for krupa celcius to ferunhit
# # c=float(input("enter the celcius"))
# # f=(9*c/5)+32
# # print("feranhit is",f)

# # fourth for krupa input and swap
# # a=10
# # b=20
# # temp=a
# # a=b
# # b=temp
# # print("a is",a)
# # print("b is",b)
# # print("temp is",temp)

# #  fifth and third is addition of the 3 no for krupa enter 3 no and find everage
# # a=float(input("enter the 1 no"))
# # b=float(input("enter the 2 no"))
# # c=float(input("enter the 3 no"))
# # d=a+b+c
# # d/=3
# # print("the everage is",d)

# # sixth program of krupa 
# # side=float(input("enter the side of the cube"))
# # side=side*side*side
# # print(side)

# # seventh for krupa find the area of trapizoid
# # b1=float(input("enter the side of the cube"))
# # b2=float(input("enter the side of the cube"))
# # h=float(input("enter the side of the cube"))
# # # area=(h/2)*(b1+b2)
# # area=0.5*(b1+b2)+h
# # print("area of trapizoid is",area)

# # short the list
# # a=[1,56,4,7,35,6,0,8,798,35,24];
# # print(sorted(a))
# # b=["niya","aisha","riya","hetvi","prem","beena","siya","NIYA","HETU","CHARMI","TEJU","BHESH","URVASHI"]
# # print(sorted(b))

# #loop in python
# # for i in range(1,6):
# #     print(i)
# # while  loop 
# # i=0
# # while i<=5:
# #     print(i)
# #     i=i+1
# # n=[1,2,3,4,5,6]
# # even=filter(lambda x:x%2==0,n)
# # odd=filter(lambda x:x%3==0,n)
# # print(list(even))
# # # print(list(even))
# # print(list(odd))

# # numbers = [ 1, -2, 3, -4, 5, -6 ]

# # Using filter() to remove negative numbers from the list
# # result = list(filter(lambda x: x >= 0, numbers))

# # Printing the result
# # print(result)

# # import math
# # a=min(2,6,8)
# # print(a)

# # thisset = {"apple", "banana", "cherry"}
# # tropical = {"pineapple", "mango", "papaya"}
# # thisset.add("orange")
# # thisset.update(tropical)
# # print(thisset)
# # print(sorted(thisset))
# # print(sorted(tropical))

# # math function in python
# import math

# # x=min(5,2,80,36)
# # y=max(24,7454,5325,1233)
# # print(x)
# # print(y)
# # power and abs function
# # x=abs(-1.31314)
# # y=pow(2,3)
# # print(x)
# # print(y)

# # x=math.sqrt(64)
# # print(x)
# # x=math.ceil(1.10)
# # y=math.floor(1.86792)
# # print(x)
# # print(y)
# # //print the valueof pi
# # x=math.pi
# # print(x)

# # python random modul

# import random
# # r1=random.randint(3,15)
# # r2=random.randint(-10,-2)

# # print(r1)
# # print(r2)


# # list=[1,2,3,4,5,6,7,8,9]
# # print(random.choice(list))

# # genrate and random float no
# from random import random
# import random
# # print(random())
# list1 = [1, 2, 3, 4, 5, 6]
# print(random.choice(list1))
# string = "Krupa"
# print(random.choice(string))
# tuple1 = (1, 2, 3, 4, 5)
# print(random.choice(tuple1))

# # choce random no with how many no do you want
# # in  random library import samples
# from random import sample
# list1 = [1, 2, 3, 4, 5]
# print(sample(list1,4))

# list2 = (4, 5, 6, 7, 8)
# print(sample(list2,4))

# list3 = "krupashah"
# print(sample(list3,5))

# # suffle list
# import random
# sample_list = [1, 2, 3, 4, 5]
# print("Original list : ")
# print(sample_list)

# list2=random.shuffle(sample_list)
# print("\nAfter the first shuffle : ")
# print(sample_list)
# print(list2)

# random.shuffle(sample_list)
# print("\nAfter the second shuffle : ")
# print(sample_list)
# # in python date time
# import datetime
# x = datetime.datetime.now()
# print(x)


# # print month name
# import datetime
# x = datetime.datetime(2018, 6, 1)
# print(x)
# print("print month name full version")
# print(x.strftime("%B")) 
# # print month name full version
# print("weekday full version")
# print(x.strftime("%A"))
# # weekday full version
# print("weekday short version")
# print(x.strftime("%a"))
# # weekday short version
# print("weekday as per a num 0-6 ,o as a sunday")
# print(x.strftime("%w"))
# # weekday as per a num 0-6 ,o as a sunday
# print("day of month 01-31")
# print(x.strftime("%d"))
# # day of month 01-31
# print("month name short versio")
# print(x.strftime("%b"))
# # month name short version
# print("year fullversion")
# print(x.strftime("%Y"))
# # year fullversion
# print("year  short version")
# print(x.strftime("%y"))
# # year short version
# print("month as a number 0-12")
# print(x.strftime("%m"))
# # month as a number 0-12
# import os
# cwd = os.getcwd()
# print("Current working directory:", cwd)

# # print(math.pi)

# # //platform in oop
# import platform
# x=platform.system
# print(x)
# y=dir(platform)
# print(y)
# import math
# print(math.sqrt(3))

# print(math.gcd(12,15))
# print(math.factorial(6))

# from datetime import datetime,timedelta
# print(datetime.now()+timedelta(days=7))

# days1=datetime(2024,5,9)-datetime(2025,1,1)
# print(days1.days)

# # assigmentby kirtan sir



import pandas as pd
import numpy as np

df = pd.read_csv('data1.csv')

print(df.to_string())