# # values using non local variable
# # a=15
# # print("a=",a)
# # print("value of using non local",end=" ")
# # def outer():
# #     a=5
# #     print("outer",a)
# # def inner():
# #     a=10
# #     print("inner",a)
# # inner()
# # print("a=",a)
# # outer()

# # lemda function
# # x=5
# n=lambda x:"possitive" if x>0 else "negative" if x<0 else "zero"
# print(n(5))
# print(n(-3))
# print(n(0))
# # lamda with for loop
# li=[lambda a=x:a*10 for x in range(1,5)]
# for i in li:
#     print(i())
# # lamda with square root
# sr=lambda x:x**2
# print(sr(9))
# # lamda with even odd
# no=lambda x:"even" if x%2==0 else "odd"
# print(no(8))
# print(no(9))
# # lamda with addition and multipliaction
# cal=lambda x,y:(x+y,x*y)
# res=cal(4,5)
# print(res)

# high order function with perameters'

# def sh(text):
#     return text.upper()
# print(sh('hello'))
# yell=sh
# print(yell("python"))
# def lw(text):
#     return text.lower()
# print(lw('NIYA'))
# print(len(lw('BINAFGYFHGVH')))

# high order function
# def a(text):
#     return text.upper()
# def b(text):
#     return text.lower()
# def c(func):
#     greet=func("hi am niya i am created python demo program")
#     print(greet)
# c(a)
# c(b)

# super keyword in python
# in python super keyword meanse in child class extend with parentclass so child class acess the all property of super class it meanse parent calss and child class also called subclass

# example
# class parent:
#     def greet(self):
#         print("hello i am a parent")

# class child(parent):
#     def greet(self):
#         super().greet()
#         print("hello i am child")
        
# o=child()
# o.greet()

# inharitance
# class called our child class attribute and method from another class or derived class it is provied code reusebality and modularity and hairarical class structure

# example

class parent:
    def __init__(self,name,id):
        self.name=name
        self.id=id
    def dis(self):
        print(self.name,self.id)
    def greet(self):
        print("hello i am a parent")

class child1(parent):
    def greet(self):
        # super().greet()
        print("hello i am child1")
o=child1("niya",101)
o.dis()
o.greet()


class child2(parent):
    def greet(self):
        super().greet()
        print("hello i am child2")
x=child2("siya",102)
x.dis()
x.greet()

# multipale inharitance

# multiplae parent class in the child class derived

class parent1:
    def __init__(self,name,id):
        self.name=name
        self.id=id
    def dis1(self):
        print("hello i am a parent1",self.name,self.id)
    def greet(self):
        print("hello i am a parent1")


class parent2:
    def __init__(self,name,id):
        self.name=name
        self.id=id
    def dis2(self):
        print("hello i am a parent2",self.name,self.id)
    def greet(self):
        # super().greet()
        print("hello i am a parent2")
seco=parent2("prem",103)
seco.greet()

class child1(parent1,parent2):
    def greet(self):
        super().greet()
        print("hello i am child1")

    def dis3(self):
        print("hello iam child",self.id,self.name)

o=child1("niya",101)
o.dis1()
o.dis2()
o.dis3()
o.greet()

# polymorphisum in py
# allow function or method to operate diffrent way depending on type of the object


print(5+6)
print("hello"+"world")
print([1,2]+[3,4])

# method overriding

class student():
    def study(self):
        print("all students are studeied")

class mscstudent():
    def study(self):
        print("I AM MSC STUDENT")

class mbastudent():
    def study(self):
        print("I AM MBA STUDENT")

class SCstudent():
    def study(self):
        print("I AM SCHOOL STUDENT STUDENT")       

mscstudent().study()
mbastudent().study()
SCstudent().study()


# ENCAPSULATION PRIVATE AND PROTECTED MEMBERS

# PRIVATE (DOUBLE UNDERSCORE__)
# PROTECTED (SINGLE UNDERSCORE_)

class exam:
    def __init__(self,name):
        self.name=name
        self._protected_var="I AM PROTECTED VARIABLE"
        self.__private_var="I AM PRIVATE VARIABLE"

    def public_met(self):
        return "THIS IS PUBLIC METHOD"
    
    def __private_met(self):
        return "THIS IS PRIVATE METHOD"
    
    def _protected_met(self):
        return "THIS IS PROTECTED METHOD"
    
    def access_private(self):
        return "THIS IS ACCESS PRIVATE METHOD"

OB=exam("jhon")
print(OB.access_private())
print(OB.public_met())
# print(OB.__private_met()) ERROR
print(OB._exam__private_met())
print(OB._protected_met())
# print(OB.__private_var) ERROR
print(OB._exam__private_var)
print(OB._protected_var)




