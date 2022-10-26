% Ejercicio aplanar, Ignacio Brenes Practica 2 paradigma Logico

aplanar([], []) :- !.
aplanar([Head|Tail], List) :-
    !,
    aplanar(Head, NH),
    aplanar(Tail, NT),
    append(NH, NT, List).

aplanar(L, [L]).