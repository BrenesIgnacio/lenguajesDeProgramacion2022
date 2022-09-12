--Autor @Ignacio Brenes
--Ejercicios paradigma funcional haskel, Guia #1 de ejercicios Lenguajes de programacion.

--Funcion #1
existe subcadena en_frase =

    if length en_frase < length subcadena then
        False
    else if (subcadena == take (length subcadena) en_frase) then
        True
    else
        existe subcadena (tail en_frase)

func1 elem en_frase =
    filter (existe elem) en_frase

--Funcion #2
func2 [] _ = True
func2 lis1 lis2 =

    subconjunto (head lis1) lis2 && func2 (tail lis1) lis2

subconjunto _ [] = False
subconjunto existe (x:xs) 

    | existe == x = True

  | otherwise = subconjunto existe xs

--Funcion #3
func3 lista segmento final =

  if (length (segmento)>0) then 
      func3 (append lista (head segmento))(tail segmento)final
  else if ((length final)>0) then
      func3 lista (head final) (tail final)
  else 
      lista 

append f i = f ++ [i]
aplanar_func final= func3 [] [] final

--Funcion #4
func4 lista =

    concat(map subconjunto lista)
    where 
        subconjunto lista2 = concatenar lista2
                   
concatenar lista =

    concat (map unir lista)
    where
        unir i = [i]

--Funcion main para llamar a todos los ejercicios
main :: IO ()
main = do 
--Funcion #1
    print("Ejecutando Funcion 1")
    print(func1  "oso" ["oso", "el oso esta en la casa"])
    print(func1  "oso" ["venado", "el venado esta en la casa"])
--Funcion #2
    print("Ejecutando Funcion 2")
    print(func2 [2,4,6,8] [1,3,5,7,9])
    print(func2 [1,2,3,4] [1,2,3,4,5,6,7,8,9])
--Funcion #3
    print("Ejecutando Funcion 3")
    print (aplanar_func [[1,2,3],[6,7,8]])
    print (aplanar_func [[1],[2],[3],[4]])
--Funcion #4
    print("Ejecutando Funcion 4")
    print (func4 [[1,2,3],[6,7,8]])
    print (func4 [[1],[2],[3],[4]])


