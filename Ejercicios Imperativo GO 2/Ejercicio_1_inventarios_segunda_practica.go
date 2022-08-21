package main

import (
	"fmt"
	"sort"
)

//Autor @Ignacio Brenes
//Ejercicio #1, Guia #2 de ejercicios Lenguajes de programacion.

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos

const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {
	var bandera = 0

	for i := 0; i < len(*l); i++ {
		if nombre == (*l)[i].nombre {
			(*l)[i].cantidad = (*l)[i].cantidad + cantidad
			(*l)[i].precio = (*l)[i].precio + precio
			fmt.Println("el producto ", (*l)[i].nombre, " Ha sido sumado a la existencia, ahora  la cantidad es de ", (*l)[i].cantidad, " y el precio de ", precio)
			bandera = 1
		}
	}
	if bandera == 0 {
		lProductos = append(lProductos, producto{nombre: nombre, cantidad: cantidad, precio: precio})
	}

	// (HECHO) modificar el código para que cuando se agregue un producto, si este ya se encuentra, incrementar la cantidad
	// de elementos del producto y eventualmente el precio si es que es diferente
}

func (l *listaProductos) buscarProducto(nombre string) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			result = i
		}
	}
	return result
}

func elimSinExistencia(slice []producto, s int) []producto {
	return append(slice[:s], slice[s+1:]...)
}

func (l *listaProductos) venderProducto(nombre string, cant int) {
	var prod = l.buscarProducto(nombre)
	if prod != -1 && cant > 0 {
		if (*l)[prod].cantidad >= cant {
			(*l)[prod].cantidad = (*l)[prod].cantidad - cant
		} else {
			fmt.Println("No se puede vayor cantidad de productos que los que hay en existencia")
		}
	}
	if (*l)[prod].cantidad <= 0 {
		fmt.Println("el producto ", (*l)[prod].nombre, " se elimino del sistema ya que no hay existencias.")
		(*l) = elimSinExistencia(*l, prod)
	}

}

//(HECHO) modificar para que cuando no haya existencia de cantidad de productos, el producto se elimine de "la lista"

func llenarDatos() {
	lProductos.agregarProducto("arroz", 15, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 0, 4500)
}

func (l *listaProductos) listarProductosMinimos() listaProductos {
	// debe retornar una nueva lista con productos con existencia mínima (HECHO)

	var LproductosEM listaProductos
	fmt.Println("Se creo una lista de productos con existencia minima.")
	fmt.Println("la lista es: ", LproductosEM)

	for i := 0; i < len(*l); i++ {
		if (*l)[i].cantidad <= existenciaMinima {
			LproductosEM = append(LproductosEM, (*l)[i])
			fmt.Println("Se añadió a la lista de productos con existencia minima el producto:", (*l)[i])
		}
	}

	return LproductosEM
}

//Aqui se agregan las funciones nuevas necesarias para cumplir con la guia de ejercicios.

// Esta funcion amplia dicho inventario con la compra de más unidades
//de dicho producto hasta que cumplan con el mínimo establecido de manera constante.

func aumentarInventarioDeMinimos(l *listaProductos) {
	for producto := 0; producto < len((*l)); producto++ {
		if (*l)[producto].cantidad <= 10 {
			(*l)[producto].cantidad = 10
		}
	}
}

//Crear una función que ordene la lista de productos usando como
//llave para el ordenamiento cualquiera de los elementos de la estructura producto.

func (l *listaProductos) OrdenamientoSlice() {
	sort.Slice(*l, func(p, q int) bool {
		return (*l)[p].cantidad < (*l)[q].cantidad
	})
	fmt.Println("La lista a sido ordenada por cantidad en orden ascendente")
}

func main() {
	llenarDatos()
	fmt.Println(lProductos)
	lProductos.venderProducto("arroz", 4)
	fmt.Println(lProductos)
	lProductos.agregarProducto("azucar", 20, 1500)
	fmt.Println(lProductos)
	lProductos.venderProducto("frijoles", 4)
	fmt.Println(lProductos)
	lProductos.venderProducto("leche", 10)
	fmt.Println(lProductos)
	lProductos.agregarProducto("leche", 5, 1200)
	fmt.Println(lProductos.listarProductosMinimos())

	//llamado de la nueva funcion A
	fmt.Println("\n ejecucion de funcion aumentarInventarioDeMinimos")
	aumentarInventarioDeMinimos(&lProductos)
	fmt.Println("\nproductos: ", lProductos)

	//llamado de la nueva funcion B
	fmt.Println("\n ejecucion de funcion OrdenamientoSlice")
	lProductos.OrdenamientoSlice()
	fmt.Println("\nproductos: ", lProductos)
}

// si ha sobrado tiempo antes del receso, el ejercicio se podría ampliar para que los los productos se almacenen en archivos de texto
// que al inicio se carguen del archivo a la lista y que al final se actualice el archivo con el contenido de la lista
