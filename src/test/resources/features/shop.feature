Feature: Purchase products at opencart

  @Test2
  Scenario Outline: Proceso de compra
    Given User estoy en la pagina opencart
    When selecciono un producto del catalogo
    Then agrego el producto al carrito
    And veo el carrito

    When ingreso datos desde el archivo named "<dataset>"
    Then veo nuevo formulario

    Examples:
      | dataset  |
      | dataset1 |