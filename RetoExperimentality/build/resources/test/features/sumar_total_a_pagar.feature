# language: es
Característica: Sumatoria total de articulos agregados
  Yo como usuario de CLOTHESSTORE
  Necesito realizar la sumatoria de todos los articulos agregados al carrito

  Escenario: Validar la sumatoria total de los articulos agregados
    Dado que el usuario este en la pagina principal de CLOTHESSTORE
    Cuando el agrega varios productos de diferentes categorias
      | Hombre  |
      | Mujer   |
      | Junior  |
    Entonces el visualizara el total a pagar correctamente
