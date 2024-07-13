Feature: Validar cantidad de productos

  Scenario: Comparar la cantidad de productos
    Given El usuario ingresa a la pagina
    When elige una categoria y subcategoria
    And elige un producto al azar
    And agrega una cantidad aleatoria entre uno y diez
    Then validara que las cantidades de los productos agregados deberá ser igual que en el carrito


