% Ejercicio SubConjunto , Ignacio Brenes Practica 2 paradigma Logico

subSet([],[]):- true,!.

subSet([A|B],[]):- false,!.

subSet([],[A|B]):- true,!.

subSet([A|B],[C|D]):- A=C,subSet(B,D).

subSet([A|B],L):- contains(A,L),
		subSet(B,L),!.

subSet([A|_],L):- not(contains(A,L)),false.