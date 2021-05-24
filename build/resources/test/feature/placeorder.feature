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
      | username                   | password     | laptop      | name      | country  | city     | creditCard  | month | year | message                      |
      | alejomontalvo036@gmail.com | Colombia2019 | MacBook Pro | alejandro | colombia | medellin | 00989327983 | june  | 2021 | Thank you for your purchase! |