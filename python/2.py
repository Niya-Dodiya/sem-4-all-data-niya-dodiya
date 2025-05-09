# import math
# a=int(input("enter the value of square root"))
# print(math.sqrt(a))
# b=int(input("enter the value "))
# c=int(input("enter the no of power"))
# print(pow(b,c))
# e=int(input("enter the value of "))
# f=int(input("enter the value of "))
# print(math.gcd(e,f))

# import random

# print(random.randint(1,50))
# list1=["python","javascript","c++","ruby","go"]
# print(random.choice(list1))
# list2=[10,20,30,40,50]
# random.shuffle(list2)
# print(list2)

# from datetime import datetime,timedelta
# print(datetime.now())
# print(datetime.now()+timedelta(days=15))

# days1=datetime.now()-datetime(2015,12,31)
# print(days1.days)


# krupa mam assigment quition

# -----------------------------------------------------------------
# # first
# a=int(input("enter how many name you are enterd"))
# for i in range(1,a):
#   b=str(input("enter your name:---"))
#   print("hello ",b,"wlcome to python programming")

# second
# def sum(a,b):
#      return a+b

# print(sum(2,3))
# print(sum(12,13))
# print(sum(200000000,345154521))
# print(sum(12.654855452,216.4522365522))

# third

# discount percentage count calculate
# def discount(price):
#      op=price
#      price=price/10
#      price=op-price
#      print(price)

# discount(12000)

# fourth

# def fact(n):
#      if(n==1):
#           return 1
#      else:
#           return n*fact(n-1)

# print("factorial of 5 =",fact(5))
# print("factorial of 6 =",fact(6))
# print("factorial of 7 =",fact(7))

# fifth

# b=lambda x,y:(x+y,x-y,x*y)
# print(b(3,5))

# sixth

# def outer():
#      x=10
#      print("function call inner x=",x)
# # inner()
#      def inner():
#                nonlocal x
#                x=x**2
#                print("inner x=",x)
#      inner()
#      print("outer x in inner function",x)

# outer()
# seventh

# import math

# print("sqrt fun",math.sqrt(16))
# print("floor func",math.floor(1.324))
# print("ceil func",math.ceil(3.4632))

# eight
# import math
# a=int(input("enter the no"))
# print(math.factorial(a))

# nineth
from random import random
import random
from ssl import ALERT_DESCRIPTION_CLOSE_NOTIFY
# list=["apple","banana","cherry","date","fig","grape"]
# # r=random.choice(list)
# print(random.choice(list))

# tenth
# # for i in range (1,50):
# # print("lottery no is",random.randint(1,50))
# list1=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50]
# # for i in range(1,50):
# #       list3=i
# print(random.sample(list1,6))
# # print(random.sample(list3,6))    

# eleveth
# d1=random.randint(1,7)
# d2=random.randint(1,7)
# print("rolling the dice",d1)
# print("rolling the dice",d2)
# print("sum of both dice is",d1+d2)

# tweleth

# import datetime
# x = datetime.datetime.now()
# print(x)


# print month name
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

# # thirty
# num=[24,48,55,41,62,2]
# result = filter(lambda x:x%2==0, num)
# print(list(result))

# fourty

# temp=[0,55,554,22,42,64,245,20]
# fer=list(map(lambda x:((9/5)*x+32),temp))
# print(fer)



# python assigment for prectical

# factorial no

# def fact(num):
#     if num==1:
#         return 1
#     else:
#         return num*fact(num-1)

# print(fact(5))



def fibo(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibo(n-1)+fibo(n-2)
    
print(fibo(6))

import math 

print(math.factorial(5))


class bank:
    def __init__(self,acno,name,balance):
        self.acno=acno
        self.name=name
        self.balance=balance
    
    def printdata(self):
        print(self.acno)
        print(self.name)
        print(self.balance)

    def deposite(self,ammount):
        # self.ammount=ammount
        self.balance=self.balance+ammount
        print(self.balance)
    
    def withdraw(self,a1):
        if(self.balance>=a1):
            self.balance=self.balance-a1
            print(self.balance)
        else:
            print("insuffeisient balance")

    def showbalance(self):
        print("current balance is",self.balance)


b1=bank(11,"abc",20000)
b1.printdata()
b1.deposite(200)
b1.withdraw(20500)
b1.showbalance()