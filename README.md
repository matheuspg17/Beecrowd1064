# Resolução exercício Beecrowd1064

## Descrição do problema
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

## Como Funciona
1. O programa inicializa as variáveis contadoras e acumuladoras (`controle = 0` e `total = 0.0`).
2. Uma estrutura de repetição `for` roda seis vezes para ler as entradas do usuário na variável `numeros`.
3. Um bloco condicional `if (numeros > 0)` filtra apenas os valores maiores que zero:
   - Incrementa o contador: `controle++`.
   - Soma o valor ao somatório: `total = total + numeros`.
4. Após o laço, calcula a média dividindo o somatório pela quantidade de positivos: `media = total / controle`.
5. Exibe a contagem de positivos e a média formatada via `System.out.printf`.
