# Contribuintes

Este repositório contém um programa em Java para calcular o imposto de renda de contribuintes, seguindo as regras de cálculo de imposto sobre salário, serviços e ganho de capital, além de considerar abatimentos por gastos médicos e educacionais.

## Funcionalidades

*   Leitura de dados de N contribuintes (renda anual com salário, serviços, ganho de capital, gastos médicos e educacionais).
*   Cálculo do imposto de renda bruto e líquido para cada contribuinte.
*   Aplicação de regras de abatimento de imposto.
*   Exibição de um resumo detalhado para cada contribuinte.

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/AdrckFayad/contribuintes.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd contribuintes
    ```
3.  **Compile o código:**
    ```bash
    javac src/application/Program.java src/entities/TaxPayer.java
    ```
4.  **Execute o programa:**
    ```bash
    java -cp . application.Program
    ```

## Estrutura do Projeto

*   `src/entities/TaxPayer.java`: Classe que representa um contribuinte, contendo os atributos de renda e gastos, além dos métodos para calcular os diferentes tipos de impostos, imposto bruto, abatimento e imposto líquido.
*   `src/application/Program.java`: Classe principal que gerencia a entrada de dados dos contribuintes, cria uma lista de objetos `TaxPayer` e exibe o relatório final.

## Regras de Imposto

*   **Imposto sobre salário:**
    *   Abaixo de R$ 3.000/mês: Isento
    *   R$ 3.000 a R$ 5.000 (exclusive): 10% sobre a renda anual com salário
    *   R$ 5.000 ou acima: 20% sobre a renda anual com salário
*   **Imposto sobre serviços:** 15% sobre a renda anual com prestação de serviços.
*   **Imposto sobre ganho de capital:** 20% sobre o ganho de capital.
*   **Abatimento:** Até 30% do imposto bruto total com gastos médicos ou educacionais. Se os gastos forem menores que 30% do imposto bruto, apenas o valor dos gastos é abatido.

---

*Este README.md foi gerado automaticamente.*
