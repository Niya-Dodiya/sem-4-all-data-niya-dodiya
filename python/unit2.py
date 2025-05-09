# # list comprehension

# res=[val**2 for val in range(5)]
# print(res)
# a=[11,22,33,44,55]
# res1=[x**2 for x in a]
# print(res1)


# # dictatories method

# student={"name":"amit","age":21,"subject":"python"}
# print(student.get("age","not avialable"))
# print(student.get("grade","not avialable"))
# print(student.items())

# for key,value in student.items():
#     print(f"{key}:{value}")

# student["age"]=26
# student.update([("city","ahemdabad"),("course","java")])
# print("afther modification")
# for key,value in student.items():
#     print(f"{key}:{value}")


# # python set() function
# set1=set(["hello","it","is","python","languge"])
# print(set1)
# set2=set(["how","are","you"])
# print(set2)
# print(set(a))
# set3={"how":1,"are":2,"you":3}
# print(set(set3))
# d={45,54,2,5,1,5,2,5,52,5,4}
# print(d)
# d.add(4)
# print(d)
# d.update([4,5])
# print(d)
# d.remove(54)
# print(d)
# d.discard(4)
# d.discard(16)
# print(d)
# e=d.pop
# print(e,d)
# d.clear()
# print(d)

# # frozen sets in python

# fset=frozenset((1,2,3,4,5))
# print(fset)
# s1={8,9,6,7,3,41,28,2,98}
# fset=frozenset(s1)
# print(fset)
# fset=frozenset([1,2,3,4,5])
# print(fset)

# # file handaling in python


# # with open("file.txt",'w') as f:
# #     file.write("I AM NIYA")

# with open("example.txt",'w') as file:
#     file.write("hello world")
#     # content=f.read()
#     # print(content)
#     # print(f.read())

# Q2
# def amstrongno(num):

#     temp=num
#     s=0
#     r=0
#     n=0
#     r=num%10
#     n=r*r*r
#     s=s+n
#     num=num/10
#     if(temp==num):
#         print("\nNO IS AMSTRONG",num)
#     else:
#         print("\nNO IS NOT AMSTRONG",num)


# no=int(input("enter the num to chaeck it is amstrong or not\n"))
# data=amstrongno(no)
# # print(data)

class ArmstrongCheck:
    def __init__(self, number):
        self.number = number
        self.checked = False  # Used to ensure only one iteration happens

    def __iter__(self):
        return self

    def __next__(self):
        if not self.checked:
            self.checked = True
            digits = [int(d) for d in str(self.number)]
            power = len(digits)
            result = sum([d ** power for d in digits])
            return result == self.number
        else:
            raise StopIteration

# User input
num = int(input("Enter a number: "))

# Create object and use iterator
checker = ArmstrongCheck(num)
for is_armstrong in checker:
    if is_armstrong:
        print(f"{num} is an Armstrong number.")
    else:
        print(f"{num} is not an Armstrong number.")

