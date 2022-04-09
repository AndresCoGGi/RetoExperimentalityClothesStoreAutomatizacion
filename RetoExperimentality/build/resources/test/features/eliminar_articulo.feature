# language: es
Característica: Eliminar articulos al carrito
  Yo como usuario de CLOTHESSTORE
  Necesito eliminar articulos al carrito de compras

  Escenario: Validar Eliminacion de articulo del carrito
    Dado que el usuario tiene un producto agregado en el carrito de compras
    Cuando el elimina el articulo
    Entonces el visualizara una ventana con un mensaje El carrito fue vaciado!