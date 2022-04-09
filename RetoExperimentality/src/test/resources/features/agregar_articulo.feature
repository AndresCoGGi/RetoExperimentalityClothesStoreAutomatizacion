# language: es
Característica: Agregar articulos al carrito
  Yo como usuario de CLOTHESSTORE
  Necesito agregar articulos al carrito de compras

  Esquema del escenario: Validar agregacion de articulo de <seccion>
    Dado que el usuario este en la pagina principal de CLOTHESSTORE
    Cuando el agrega un articulo de <seccion> en el carrito
    Entonces el visualizara el articulo agregado en el carrito exitosamente

    Ejemplos:
      | seccion    |
      | Hombre     |
      | Mujer      |
      | Junior     |
      | Niños      |
      | Accesorios |