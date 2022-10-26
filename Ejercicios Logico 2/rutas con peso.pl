% Ejercicio Route, Ignacio Brenes Practica 2 paradigma Logico

%        a ---- c ---- x
%      /   \  /
%     /     \/
%   i       X
%     \    / \
%      \  /   \
%        b ---- d ---- f

conexion(i,a,3).    
conexion(i,b,4).
conexion(a,i,6).
conexion(a,c,9).
conexion(a,d,2).
conexion(b,i,6).
conexion(b,c,7).
conexion(b,d,3).
conexion(c,a,5).
conexion(c,x,1).
conexion(c,b,9).
conexion(d,a,6).
conexion(d,f,9).
conexion(d,b,5).
conexion(x,c,3).
conexion(f,d,2).

% ruta, en este caso muestra todas las rutas posibles a un punto
% y además su coste de weight. se ejecuta de la siguiente manera:
% ruta(x, f, Cost, Route).

ruta(Inicio, Final, Weight, Route) :- ruta(Inicio, Final, Weight, [], Route).

ruta(Inicio, Final, Weight, Checked, [Inicio]) :-

    \+ memberchk(Inicio, Checked),
    conexion(Inicio, Final, Weight).

ruta(Inicio, Dato, Weight, Checked, [Inicio|Tail]) :-

    \+ memberchk(Inicio, Checked),
    conexion(Inicio, Final, Numero),
    ruta(Final, Dato, Numero1, [Inicio|Checked], Tail),

    \+ memberchk(Inicio, Tail),
    Weight is Numero + Numero1.

% Adicionalmente, "mejor_ruta" mustra la mejor ruta
% correspondiente al peso ingresado en los caminos
% Esta se ejecuta de la siguiente manera:
% mejor_ruta(x, f, Cost, Route).

mejor_ruta(Inicio, Final, Weight, Route) :-

    mejor_ruta(Inicio, Final, Weight, Route),

    \+ (mejor_ruta(Inicio, Final, LessWeight, SideRoute),
        SideRoute \= Route,
        LessWeight =< Weight).
