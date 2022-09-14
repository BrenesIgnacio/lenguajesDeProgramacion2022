--Autor @Ignacio Brenes
--Ejercicios paradigma funcional haskel, Guia #1 de ejercicios Lenguajes de programacion

--Ejercicio #1: 
data Producto = Producto {
     nombre :: String
    , descripcion :: String
    , sale :: Int
    } deriving Show
                     
reduceLista lProductos =
    sum lProductos 

calcTax tax lProductos =
    map items lProductos

    where
        items prod= (tax* fromIntegral (sale prod))

checkTax taxRange lProductos =
    filter items lProductos 

    where
        items prod = ((sale prod) >= taxRange)

calcSale lProductos =
    map items lProductos 

    where
        items prod = ((sale prod))

--Funcion main para llamar a todos los ejercicios
main :: IO ()
main = do

    let taxPerc = 0.13
    let taxRange =20000
    
    let lProductos=[
            (Producto "tarjeta madre" "Asus" 54200),
            (Producto "mouse" "alámbrico" 15000),
            (Producto "teclado" "gamer con luces" 30000),
            (Producto "memoria ssd" "2 gb" 65000),
            (Producto "cable video" "display port 1m" 18000)]
    
    let findTax = calcTax taxPerc (checkTax taxRange lProductos)
    let reduce1= reduceLista findTax
    let buscarPreciosProducto= calcSale lProductos
    let reduce2 = reduceLista buscarPreciosProducto
    let montoTotal= reduce1 + fromIntegral reduce2
    
    print("----------Factura----------")
    putStrLn $ show "Su total sin impuestos:" ++ " " ++ show reduce2 ++ " Colones"
    print("---------------------------")
    putStrLn $ show "Su total es de:" ++ " " ++ show montoTotal ++ " Colones"
    print("---------------------------")
    putStrLn $ show "Total en impuestos:" ++ " " ++ show reduce1 ++ " Colones"
    print("---------------------------")