# MODIFICACION DE LOS API


# LibroController Modificado
El controlador respondera con un mensaje personalizado en caso de no encontrar un libro y devolvera un estado CREATE al agregar un nuevo libro a la biblioteca.

![image](https://github.com/PaulinaAnz25/Libro_WebApi/assets/147875196/206b0561-1d3f-4a03-b24b-7c37b6f050cb)

# Si no existe el libro, lanzar un expcetion LibroException (GET /libros/{id_libro}). Enviar el estado NOT_FOUND con un mensaje personalizado
![image](https://github.com/PaulinaAnz25/Libro_WebApi/assets/147875196/fea6c595-4582-43e7-970e-e4bf939b5bc1)
LibroException: Esta clase se emplea para gestionar excepciones particulares vinculadas a la lógica de los libros. Si no se encuentra un libro con un ID particular, se lanza una excepción de tipo LibroException con un mensaje personalizado.


![image](https://github.com/PaulinaAnz25/Libro_WebApi/assets/147875196/b1f7455c-d95b-4a0e-91f4-a379f2727b1e)
ExceptionHandler: Esta clase funciona como un manejador global de excepciones, definiendo cómo tratar las excepciones específicas, como LibroException.


![image](https://github.com/PaulinaAnz25/Libro_WebApi/assets/147875196/1aaba6bf-87f3-4e84-8fce-1980b424c860)
ExceptionResponse: Esta clase proporciona una estructura consistente para las respuestas de error.



# Libro no encontrado
![image](https://github.com/PaulinaAnz25/Libro_WebApi/assets/147875196/9fd9ef98-36d0-4aaf-a7e3-573a52541524)


# Libro creado
![image](https://github.com/PaulinaAnz25/Libro_WebApi/assets/147875196/58f69a02-dff8-4a64-8d28-940aa292c2d7)
