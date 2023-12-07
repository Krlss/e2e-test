Feature: Purchase products at opencart

  @Test2
  Scenario Outline: Proceso de compra
    Given User estoy en la pagina opencart
    When selecciono un producto del catalogo
    Then agrego el producto al carrito
    And veo el carrito

    When ingreso datos <firstname> <lastname> <email> <telephone> <company> <address_1> <city> <postcode> <country> <region>
    Then veo nuevo formulario

    Examples:
      | firstname | lastname | email               | telephone | company | address_1 | city | postcode | country | region |
      | Carlos    | Pico     | cpico6375@gmail.com | 123456789 | Google  | 123       | Lima | 123456   |         | Conwy  |