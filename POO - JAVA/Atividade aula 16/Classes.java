// Classe Pessoa
public class Pessoa {
    public void exibirMensagem() {
        System.out.println("Olá, mundo!");
    }
}

// Classe Calculadora
public class Calculadora {
    public int dobrarNumero(int numero) {
        return numero * 2;
    }
}

// Classe Musica
public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int avaliacao;
    private int numAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    public void avaliarMusica(int avaliacao) {
        this.avaliacao += avaliacao;
        this.numAvaliacoes++;
    }

    public double calcularMediaAvaliacoes() {
        return (double) this.avaliacao / this.numAvaliacoes;
    }
}

// Classe Carro
public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.ano;
    }
}

// Classe ContaBancaria
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

// Classe IdadePessoa
public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println(this.nome + " é maior de idade.");
        } else {
            System.out.println(this.nome + " é menor de idade.");
        }
    }
}

// Classe Produto
public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        this.preco -= this.preco * percentual / 100;
    }
}

// Classe Aluno
public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        return soma / this.notas.length;
    }
}

// Classe Livro
public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}
