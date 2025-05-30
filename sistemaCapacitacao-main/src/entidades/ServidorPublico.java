package entidade;

import javax.sound.midi.Soundbank;

public class ServidorPublico {

    private int material;
    private String orgao;
    private String foto;
    private String vinculo;
    private double salario;
    private int idade;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Object getHorasExtras() {
        return null;
    }

    private int tempoDeContribuicao;
    private String email;
    private double horasExtras;

    public double HorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    private String cargo;
    private String telefone;
    private String celular;
    private String cpf;
    private String naturalidade;

    private String lotacao;

    ServidorPublico isabela = new ServidorPublico();
    ServidorPublico heila = new ServidorPublico();
    ServidorPublico maria = new ServidorPublico();
    ServidorPublico caio = new ServidorPublico();

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoDeContribuicao() {
        return tempoDeContribuicao;
    }

    public void setTempoDeContribuicao(int tempoDeContribuicao) {
        this.tempoDeContribuicao = tempoDeContribuicao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public ServidorPublico getIsabela() {
        return isabela;
    }

    public void setIsabela(ServidorPublico isabela) {
        this.isabela = isabela;
    }

    public ServidorPublico getHeila() {
        return heila;
    }

    public void setHeila(ServidorPublico heila) {
        this.heila = heila;
    }

    public ServidorPublico getMaria() {
        return maria;
    }

    public void setMaria(ServidorPublico maria) {
        this.maria = maria;
    }

    public ServidorPublico getCaio() {
        return caio;
    }

    public void setCaio(ServidorPublico caio) {
        this.caio = caio;
    }

    public double calcularSalariohorasExtras(double horastrabalhadas, double valorHora) {
        double salarioMensal = salario +
                (horastrabalhadas * valorHora);
        horasExtras = salarioMensal;
        return (salarioMensal);
    }
    double soma = 0;

    public double calcularNumeros(double... numeros) {
        for (double numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos argumentos informados"+ soma);
        return soma;

    }


}