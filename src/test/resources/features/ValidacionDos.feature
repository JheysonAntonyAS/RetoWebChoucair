Feature: Validar total de precios

  Scenario: Comparar el total de precios
    Given El usuario ingresa a la pagina
    When elige una categoria y subcategoria
    And elige un producto al azar
    And agrega una cantidad aleatoria entre uno y diez
    Then validara que el total de los precios de los productos agregados deberá ser igual que en el carrito


