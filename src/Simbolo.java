package jogodavelha;

public enum Simbolo {
    X("X"),
    O("O"),
    VAZIO(" ");

    private final String representacao;

    Simbolo(String representacao) {
        this.representacao = representacao;
    }

    public String getRepresentacao() {
        return representacao;
    }
}