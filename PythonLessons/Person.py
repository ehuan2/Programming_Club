
class Person :

    def __init__(self, name = "", age = 0, hgt = 0): #constructors + default parameters
        self.name = name # all the attributes
        self.age = age
        self.height = hgt

    def __birthday__(self): # non-static method
        self.age += 1

    def __hello__(): # static method
        print("Hello World!")

    def __str__(self):
        return self.name + " Age is : " + str(self.age) + " Height :" + str(self.height)

a = Person("Alan Turing", 120, 175)

print(a)

a.__birthday__()

print(a)

Person.__hello__()

