@automation
Feature: Cadastro

  @ScenarioPositive
  Scenario: Realiza Cadastro com sucesso

    Given que esteja na tela inicial
    When Informo o nome
    And Informo o Sobrenome
    Then Informo o nome Sexo
    And  Seleciono a opção de comer pizza
    And  Informo minha escolaridade
    And  Informo Meu esporte Favorito
    Then Concluo Cadastro
    And Valido as informações setadas
