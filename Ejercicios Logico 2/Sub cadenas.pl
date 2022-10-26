% Ejercicio Sub cadena , Ignacio Brenes Practica 2 paradigma Logico

subString(X,Y) :-

    string_a_lista(X, XL),
    string_a_lista(Y, YL),
    append(_,T,YL) ,
    append(XL,_,T) ,
    X \= [], !.

twins(X, Y) :-
    subString(X,Y).

sub_strings(Substring, ListaString, Result) :-

    include(twins(Substring), ListaString, Result).