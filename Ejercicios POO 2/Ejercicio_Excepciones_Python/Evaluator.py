#Ignacio Brenes Ejercicio Excepciones

from Num import *
from Op import *
from ExceptionChar import *
from ExceptionFormat import *
import re

listaNum = []

listaOp = []

def leerOperacion():          
    try:

        expression = input("Operacion a resolver: ")
        check_expression = expression.split(" ")

        for i in range(0,len(check_expression)):

            if(i != len(check_expression)-1 and re.search("[0-9]+", check_expression[i]) and re.search("[0-9]+", check_expression[i+1])):

                raise ExceptionFormat("El orden de los elementos no es correcto.")

        expresion_without_spaces = expression.replace(" ", "") 
        list = re.split("(?=[-+*/])|(?<=[-+*/])", expresion_without_spaces) 

        for i in range(0,len(list)):

            if (i%2 != 0 and re.search("[0-9]+",list[i])): 

                raise ExceptionFormat("El orden de los elementos no es correcto.")

        descomponer(list);
    except ExceptionFormat as err:
        print(err.args)


def descomponer(exp):
    try:

        for element in exp:
            if (re.search("[a-z]", element)):
                raise ExceptionChar("Caracter invalido.")

            elif (re.search("[0-9]+",element)):
                newN =  Num(element)
                listaNum.append(newN)

            elif(re.search("[/*+-]",element)):
                newOp = Op(element)
                listaOp.append(newOp)

            else:
                raise ExceptionChar("Caracter invalido.")

    except ExceptionChar as err:
        print(err.args)
    
    realizarOp()

        
def realizarOp():
    while (len(listaNum) > 1):

        temp1 = int(listaNum[0].get_num())
        listaNum.pop(0)

        tempOp = listaOp[0].get_op()
        listaOp.pop(0)

        temp2 = int(listaNum[0].get_num())
        listaNum.pop(0)

        if (tempOp == "+"):
            temp1 += temp2

        elif (tempOp == "-"):
            temp1 -= temp2

        elif (tempOp == "*"):
            temp1 *= temp2

        else:
            temp1 //= temp2
        
        result = Num(temp1)
        listaNum.insert(0, result)

    print("Este es el resultado de la operacion realizada: ")
    print(listaNum[0])