def generateReceipt(pizzaOrder):                            # to generate the receipt if pizza is ordered correctly
    if len(pizzaOrder) == 0:                                # if they didn't order anything(order will be 0/empty) by inputting no or q at program start
        print("You did not order anything")
    else:                                                   # this is for when they ordered a pizza correctly
        priceDict = {"S": '7.99', "M": '9.99', "L": '11.99', "XL": '13.99'}         # price for each pizza of that(particular) size is given
        toppingpriceDict = {"S": '0.50', "M": '0.75', "L": '1.00', "XL": '1.25'}    # price for each extra topping related to their pizza size is given
        totalCost = 0.00
        print("Your order: ")
        for i, each in enumerate(pizzaOrder):
            totalCost += float(priceDict[each[0]])         # using dictionary we can get value directly for given key, in our case key is size and value is pizza price
            print("Pizza " + str(i + 1) + ": " + each[0] + " " * 30 + str(priceDict[each[0]]))
            if len(each) == 2:
                for topping in each[1]:
                    print("- " + topping)
                if len(each[1]) > 3:
                    totalCost += float(toppingpriceDict[each[0]]) * (len(each[1]) - 3)          # here the key is also a size but value is extra topping
                    for i in range(3, len(each[1])):
                        print("Extra Topping (" + each[0] + ")" + " " * 7 + str(toppingpriceDict[each[0]]))

        tax = round(totalCost * 0.13, 2)                                # the tax of final order(including everything) is added
        totalCost += tax                                                # total cost is cost of pizza and their individual toppings and the tax which is added to the final ordered
        print("Tax:" + " " * 18 + '%.2f' % tax)
        print("Total:" + " " * 16 + '%.2f' % totalCost)
