package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

//Autor @Ignacio Brenes
//Ejercicio #1, Guia de ejercicios Lenguajes de programacion.
//Haga un programa que cuente e indique el número de caracteres, el número de palabras y el número de líneas de un texto cualquiera.

func procesarTexto() {

	//definimos el string que queremos procesar.
	texto := "hola este es un texto de prueba para contar los elementos.\n"

	//Print del string a procesar.
	fmt.Println("\n--------------Procesador de texto:------------------")
	fmt.Println("este es el texto a procesar: ", texto)
	fmt.Println("------------------------------------------------------")

	//primera parte, contamos el numero de caracteres (Se cuenta el espacio como un caracter).
	var contadorCaracteres int
	for range texto {
		contadorCaracteres++
	}
	fmt.Println("El numero de caracteres en el texto es de", contadorCaracteres)
	fmt.Println("------------------------------------------------------")

	//segunda parte, numero de palabras.
	//la funcion string.Fields divide a un string alrededor de uno o mas espacios en blanco consecutivos, al añadir la función "len"
	//obtenemos como resultado la cantidad de palabras en el texto.
	contadorPalabras := len(strings.Fields(texto))
	fmt.Println("El numero de palabras en el texto es de", contadorPalabras)
	fmt.Println("------------------------------------------------------")

	//tercera parte, numero de lineas.

	scanner := bufio.NewScanner(strings.NewReader(texto))
	//Utilizamos la funcion Split para poder escanear el texto.
	scanner.Split(bufio.ScanLines)
	//Contamos las lineas
	count := 0
	for scanner.Scan() {
		count++
	}

	if err := scanner.Err(); err != nil {
		_, _ = fmt.Fprintln(os.Stderr, "reading input:", err)
	}

	//imprimimos el resultado
	fmt.Println("El numero de lineas en el texto es de: ", count)
}

// funcion main para llamar la funcion de procesar el texto.
func main() {
	procesarTexto()
}
