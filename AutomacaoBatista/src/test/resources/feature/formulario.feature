#Author: antonioleonelrjr@gmail.com

@teste
Feature: acessando formulario batista
 
  Como usuario
  Quero poder clicar na opcao criar Usuarios
  Para acessar o formulario e criar um usuario
  
  @teste
  Scenario: acessando formulario e validando-o
    Given que eu esteja no site "https://automacaocombatista.herokuapp.com"
    When preencher o formulario
    Then valido a funcionalidade
    
    

    
 