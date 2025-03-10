revisão de collections: array, list, set, map,fila, pilha.

# Exercícios sobre Java Collections

## 1. Lista de Números Ímpares
Crie um programa que utilize uma **`List<Integer>`** para armazenar números de 1 a 20. Em seguida, remova todos os números pares e exiba a lista resultante.

---

## 2. Contagem de Palavras em um Texto
Crie um programa que receba uma frase digitada pelo usuário e utilize um **`Map<String, Integer>`** para contar quantas vezes cada palavra aparece no texto. Exiba os resultados.

**Exemplo de entrada:**  
```
"Java é ótimo e aprender Java é divertido"
```

**Exemplo de saída:**  
```
{Java=2, é=2, ótimo=1, e=1, aprender=1, divertido=1}
```

---

## 3. Ordenação de Produtos
Crie uma classe **Produto** com `nome` e `preco`. Depois, adicione objetos dessa classe a um **`Set`** e exiba os produtos ordenados pelo preço. Utilize um **`TreeSet`** e implemente **Comparable** na classe Produto.

---

## 4. Fila de Atendimento
Utilize um **`Queue<String>`** para simular uma fila de atendimento. O programa deve permitir:
1. Adicionar uma pessoa à fila  
2. Chamar (remover) a próxima pessoa da fila  
3. Mostrar quem é a próxima pessoa a ser atendida  
4. Exibir todos os nomes na fila  

---

## 5. Contagem de Caracteres
Peça ao usuário para digitar uma palavra e utilize um **`Map<Character, Integer>`** para contar quantas vezes cada caractere aparece.

**Entrada:**  
```
"banana"
```

**Saída:**  
```
{b=1, a=3, n=2}
```

---

## 6. Remover Duplicatas de uma Lista
Dada uma **`List<String>`** com vários nomes, remova os duplicados utilizando um **`Set<String>`** e exiba os nomes únicos.

**Entrada:**  
```
[Ana, Bruno, Ana, Carlos, Bruno, Daniel]
```

**Saída:**  
```
[Ana, Bruno, Carlos, Daniel]
```

---

## 7. Ranking de Pontuação
Crie um **`Map<String, Integer>`** para armazenar jogadores e suas pontuações. O programa deve permitir adicionar jogadores e exibir o ranking do maior para o menor.

**Exemplo:**
```java
{ "Alice"=100, "Bob"=250, "Carol"=150 }
```

**Saída esperada:**  
```
Bob = 250  
Carol = 150  
Alice = 100  
