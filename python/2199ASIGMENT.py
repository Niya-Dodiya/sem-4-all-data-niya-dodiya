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


# python krupa mem assignment


# A1

# class amstrong:
#     def __init__(self,start,ending):
#         self.current=start
#         self.ending=ending
#     def __iter__(self):
#         return self
#     def __next__(self):
#         while self.current <= self.ending:
#             num=self.current
#             self.current+1
#             digits = [int(d) for d in str(num)]
#             if sum([d**len(digits) for d in digits]) == num:
#                 return num
#             raise StopIteration


    