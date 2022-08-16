package main

import "fmt"

//Autor @Ignacio Brenes
//Ejercicio #4, Guia de ejercicios Lenguajes de programacion.
//Escriba un programa que utilice una estructura y un arreglo/slice
//para almacenar en memoria un inventario de una tienda que vende zapatos.
//Escriba un programa que utilice una estructura y un arreglo/slice para almacenar en memoria un inventario de una tienda que vende zapatos.

// esrtructura solicitada para crear un zapato con diferentes atributos
type zapato struct {
	model string
	price int
	size  int
}

// slice para almacenar los zapatos
var lista_zapatos []zapato

// funcion que crea un zapato y lo retorna
func creaZapato(modell string, pric int, siz int) zapato {

	z := zapato{model: modell, price: pric, size: siz}
	return z
}

//funcion que llena la lista con datos quemados (caracteristicas de los zapatos)
func llenar1() {
	lista_zapatos = append(lista_zapatos, creaZapato("modelo1", 10000, 34))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo2", 11000, 35))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo3", 12000, 36))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo4", 13000, 37))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo5", 14000, 38))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo6", 15000, 38))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo7", 16000, 39))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo8", 17000, 40))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo9", 18000, 41))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo10", 19000, 42))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo11", 20000, 43))
	lista_zapatos = append(lista_zapatos, creaZapato("modelo12", 21000, 44))
}

//funcion que compara los datos y agrega los zapatos al Slice
func addZapato(modell string, pric int, siz int) {
	if siz > 44 || siz < 34 {
		fmt.Println("La talla no coincide con el paramatro")
		return
	}

	creaZapato(modell, pric, siz)
	fmt.Println("Zapato Anadido")
}

//funcion que muestra los datos
func mostrar() {
	for i := 0; i < len(lista_zapatos); i++ {
		fmt.Println(i+1, ". model : ", lista_zapatos[i].model, " size : ", lista_zapatos[i].size, " price : ", lista_zapatos[i].price)
	}
}

//funcion que elimina un elemnto del slice
func deleteZapato(slice []zapato, s int) []zapato {
	return append(slice[:s], slice[s+1:]...)
}

// funcion que valida las ventas
func sell(model string, prec int, tall int) {

	for i := 0; i < len(lista_zapatos); i++ {
		if lista_zapatos[i].model == model && lista_zapatos[i].price == prec && lista_zapatos[i].size == tall {
			lista_zapatos = deleteZapato(lista_zapatos, i)
			fmt.Println("zapato vendido")
			mostrar()
			return
		}
	}
	fmt.Println("el zapato no se encuentra en el inventario")

}

func main() {
	llenar1()
	//se cargan los datos quemados

	addZapato("modelo13", 22000, 45)
	//se agrega un nuevo zapato al inventario

	mostrar()
	//se muestra el inventario completo

	sell("modelo12", 21000, 44)
	//se vende un zapato

	sell("modelo12", 21000, 44)
	//vendemos un zapato sin existencias
}
