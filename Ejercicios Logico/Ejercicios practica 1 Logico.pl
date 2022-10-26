% Ejercicios clase y repositorio, Ignacio Brenes Practica 1 paradigma Logico

% Se adjuntan los 4 ejercicios de la practica 1 del paradigma Logico/

patron(oscar, universidad).
patron(smith, universidad).
patron(pratt, universidad).

editor(oscar, prenticehall).
editor(pratt, prenticehall).

empleado(X):-patron(X,_).
empleadopor(X):-patron(X,Y),write(Y).

% #1 miembro

member(N,[N|_]).
member(N,[_|Tail]) :- member(N,Tail).

% #2 insertar

insert(E,[],[E]).
insert(E,[H|T],[E|[H|T]]):-  E < H,!.
insert(E,[H|T],[H|R]):- insert(E,T,R).

% #3 Eliminar

delete(_, [], []).
delete(Y, [Y|Xs], Zs):-

          delete(Y, Xs, Zs), !.
delete(X, [Y|Xs], [Y|Zs]):-

          delete(X, Xs, Zs).

% #4 factorial 

factorial(0,1).
factorial(A,B) :-

		A > 0,
		C is A-1,
		factorial(C,D),
		B is A*D.          

