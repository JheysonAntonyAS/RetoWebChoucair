Feature: Validar el numero de productos

  Scenario: Comparar el numero de productos
    Given El usuario ingresa a la pagina
    When elige una categoria y subcategoria
    And elige un producto al azar
    And agrega una cantidad aleatoria entre uno y diez
    Then el número de productos agregados debe ser igual que en el carrito



