# create text file in python and perform read write operations

with open("example.txt","w")as file:
    file.write("hello it is python file")

# read in the file

with open("example.txt","r")as file:
    print(file.read())

# append new data to exiting file
with open("example.txt","a")as file:
    file.write("\nhello it is python file for second time ")

with open("example.txt","r")as file:
    print(file.read())  

# read line by line each line

with open("example.txt","r")as file:
    for line in file:
        print(line.strip())

# check specific file before exists
import os
filename="file`.txt"
# with open("example.txt","r")as file:
if os.path.exists(filename):
    with open(filename,"r")as file:
        print("file exists content....")
        print(file.read())
else:
    print("file does not exixst.........")


# file related errors
import os
try:

    with open("file.txt","r")as file:
    # print(file.read())
        content=file.read()
        # print(10/0)
    print(10/5)
except ZeroDivisionError:
    print("Eroor: file not found...")
except FileNotFoundError as e:
    print(f"unexepted Erorr: {e}")
except Exception as e:
    print(f"as an ubespacted error auccare {e}")

# q-6
import csv
data=[
    ["id","name","firstname"],
    [12,"asd","efjver"],
    [13,"sdf","jya"],
    [14,"jtscc","eweqwqqa"],
]

with open("data.csv","w",newline="")as file:
    writer=csv.writer(file)
    writer.writerows(data)
with open ("data.csv","r")as file:
    reader=csv.reader(file)
    for row in reader:
        print(row)

# q-7

import os
fnmae="data.csv"
if os.path.exists(fnmae):
    # os.remove(fnmae)
    print("csv file deleted sucessfully")
else:
    print("file not exists")

# q-8

# using with function

with open("example.txt","r")as file:
    print(file.read())

# without read function

file=open("data.csv","r")
print(file.read())
file.close()

# q-9 create empty file and delete

with open("empty.txt","w")as file:
    pass

if os.path.exists("empty.txt"):
    os.remove("empty.txt")
    print("file deleted successfully")
else:
    print("file not deleted successfully")

# 
# q-10

file=open("data.csv","r")
reader=csv.reader(file)
for r in reader:
    print(r)












