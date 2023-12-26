@Suite @Login
Feature: Validar incio de sesion

  Background: Validar el incio de sesión con credenciales validas e invalidas

    Given el usuario navega al sitio web

  @ValidCredentials
  Scenario: Credenciales validas
    When ingresa con credenciales validas
    Then la aplicacion debera mostrar el modulo principal de productos

  @InavlidCredentials
  Scenario: Credenciales invalidas
    When ingresa con credenciales invalidas
    Then la aplicacion debera mostrar un mensaje de error
