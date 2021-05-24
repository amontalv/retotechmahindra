#language: es
Característica: : place order laptop

  Esquema del escenario: : buy laptop
    Dado the user in the application
    Y the user login in the application
      | <username> | <password> |
    Cuando the user buy laptop
      | <laptop> | <name> | <country> | <city> | <creditCard> | <month> | <year> |
    Entonces user view message
      | <message> |
    Ejemplos:
      | username | password | laptop | name | country | city | creditCard | month | year | message |
      ##@externaldata@.\src\test\resources\datadriven\placeorder.xlsx@Data@1
      |  |  |  |  |  |  |  |  |  |  |