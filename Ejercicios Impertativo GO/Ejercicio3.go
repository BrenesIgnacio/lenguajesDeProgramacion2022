package main

import (
	"fmt"
)

//Autor @Ignacio Brenes
//Ejercicio #3, Guia de ejercicios Lenguajes de programacion.
//Escriba una función que permita rotar una secuencia de elementos N posiciones
//a la izquierda o a la derecha según sea el caso en función al parámetro que se reciba.

// Definimos el array inicial
var secuencia [5]int

// funcion que llena el array de secuencia con datos quemados.
func fill() {
	fmt.Println("\n\n-------------Programa para rotar la secuencia:----------------")
	secuencia[0] = 1
	secuencia[1] = 2
	secuencia[2] = 3
	secuencia[3] = 4
	secuencia[4] = 5
}

// Esta funcion mueve un espacio a la izquierda
func despIzquierda(lista *[5]int) []int {

	despIzquierda := lista[1:]
	despIzquierda = append(despIzquierda, lista[0])
	return despIzquierda
}

// mueve un espacio a la derecha
func despDerecha(lista *[5]int) []int {
	despDerecha := lista[len(lista)-1:]

	for i := 0; i < len(lista)-1; i++ {
		despDerecha = append(despDerecha, lista[i])
	}

	return despDerecha
}

// funcion que recibe la cantidad de movimietos, la direccion y el arreglo a mover
func movimientos(lista *[5]int, Cantidad int, Direccion string) []int {

	var respuesta []int
	var temp [5]int

	for elemento := range *lista {
		contador := lista[elemento]

		temp[elemento] = contador
	}

	if Cantidad == 0 {
		return temp[:]
	}

	if Direccion == "Izq" {
		for i := 0; i < Cantidad; i++ {

			respuesta = despIzquierda(lista)
			lista = (*[5]int)(respuesta)
		}
	} else {
		for i := 0; i < Cantidad; i++ {
			respuesta = despDerecha(lista)
			lista = (*[5]int)(respuesta)
		}
	}

	return respuesta[:]
}

func main() {
	fill()
	fmt.Println("Esta es la secuencia base: ", secuencia)
	fmt.Println("---------------------------------------------")
	fmt.Println("Rotacion usando el movimiento a la Izquierda: ", movimientos(&secuencia, 2, "Izq"))
	fmt.Println("---------------------------------------------")
	fmt.Println("Rotacion usando el Movimiento a la Derecha: ", movimientos(&secuencia, 2, "Der"))
	fmt.Println("---------------------------------------------")
}
