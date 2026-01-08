from pizzaReceipt import *

# basic info of all the toppings and sizes are given below correctly and accurately and must be entered in same exact format

toppings = ("ONION", "TOMATO", "GREEN PEPPER", "MUSHROOM", "OLIVE", "SPINACH", "BROCCOLI", "PINEAPPLE", "HOT PEPPER", "PEPPERONI", "HAM", "BACON", "GROUND BEEF", "CHICKEN", "SAUSAGE")
pizzaList = []
sizes = ['S', 'M', 'L', 'XL']
while 1:
    order = input("do you want to order a pizza?").lower()
    if order == 'no' or order == 'q':
        break           # if input is no or q program will break and will give you did not ordered anything or else will continue to next part which is to choose size
    l = 1               # to continue program if it's not no or q
    while l == 1:       # moving forward to choose a size, if input no or q is not entered
        size = input("Choose a size: S,M,L,or XL").upper()
        if size in sizes:           # if input is entered correctly from the sizes give than only it will move to next part of selecting toppings or else will keep asking to Choose a size
            pizza = [size]
            addtopping = []
            while 1:
                topping = input("Type in one of our toppings to add it to your pizza. To see the list of toppings, enter\"LIST\". When you are done adding toppings, enter \"X\"\n").upper()
                if topping == 'X':
                    pizza.append(addtopping)
                    l = 0
                    break                           # if input is x exist the function
                if topping == 'LIST':               # it will print all the topping in list
                    print(toppings)
                if topping in toppings:             # if input is from list it will print toppings and program will continue
                    addtopping.append(topping)
                    print("Added " + topping + " to your pizza")
                else:
                    print("Invalid topping")        # if input of toppings is  not from the list of toppings as mention above in list than it will show invalid topping
            pizzaList.append(tuple(pizza))          # will ask again to type in topping from LIST or to view LIST enter LIST or to enter x if they are done

generateReceipt(pizzaList)                          # importing functions from pizzaReceipt file
