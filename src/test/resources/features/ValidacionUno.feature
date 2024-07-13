Feature: Validar nombres de productos

  Scenario: El nombre de los productos agregados deberá ser igual que en el carro
    Given El usuario ingresa a la pagina
    When elige una categoria y subcategoria
    And elige un producto al azar
    And agrega una cantidad aleatoria entre uno y diez
    Then validara que el nombre del producto debe ser el mismo que muestra el carro

