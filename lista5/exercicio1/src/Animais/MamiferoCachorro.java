package Animais;

public class MamiferoCachorro extends Mamifero {
    protected String horarioDia;
    protected boolean dono;
    protected String idadePeso;

    public void setHorarioDia(String horarioDia) {
        this.horarioDia = horarioDia;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public void setIdadePeso(String idadePeso) {
        this.idadePeso = idadePeso;
    }

    public void reagir() {
        if (horarioDia.equals("manhã")) {
            if (dono) {
                if (idadePeso.equals("novo e leve")) {
                    abanarRabo();
                } else if (idadePeso.equals("novo e pesado")) {
                    latir();
                }
            } else {
                rosnar();
            }
        } else if (horarioDia.equals("tarde")) {
            if (dono) {
                if (idadePeso.equals("novo e leve")) {
                    abanarRabo();
                } else if (idadePeso.equals("novo e pesado")) {
                    latir();
                }
            } else {
                rosnar();
                latir();
            }
        } else if (horarioDia.equals("noite")) {
            ignorar();
        }
    }

    public void emitirSom() {
        System.out.println("Au! Au! Au! Au!");
    }

    public void emitirSom(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            emitirSom();
        }
    }

    public void emitirSom(String intensidade) {
        if (intensidade.equals("agradável")) {
            abanarRabo();
            latir();
        } else if (intensidade.equals("agressiva")) {
            rosnar();
        }
    }

    public void enterrarOsso() {
        System.out.println("Enterrou o osso.");
    }

    public void enterrarOsso(String local) {
        System.out.println("Enterrou o osso em " + local + ".");
    }

    public void abanarRabo() {
        System.out.println("Abanou o rabo.");
    }

    public void abanarRabo(int velocidade) {
        System.out.println("Abanou o rabo com velocidade " + velocidade + ".");
    }

    public void latir() {
        System.out.println("Latindo.");
    }

    public void latir(int vezes) {
        for (int i = 0; i < vezes; i++) {
            latir();
        }
    }

    public void rosnar() {
        System.out.println("Rosnando.");
    }

    public void rosnar(String intensidade) {
        if (intensidade.equals("forte")) {
            rosnar();
            latir();
        } else if (intensidade.equals("fraco")) {
            rosnar();
        }
    }

    public void ignorar() {
        System.out.println("Ignorando.");
    }
}
