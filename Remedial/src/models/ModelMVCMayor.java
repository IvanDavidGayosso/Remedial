package models;
public class ModelMVCMayor {
    private int numero1;
    private int numero2;
    private int numero3;
    private int numero_mayor;
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public int getNumero3() {
        return numero3;
    }
    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    public int getNumero_mayor() {
        return numero_mayor;
    }
    public void setNumero_mayor(int numero_mayor) {
        this.numero_mayor = numero_mayor;
    }
    public void CalcularMayor() {
        if ((this.numero1 > this.numero2) && (this.numero1 > this.numero3)) {
            this.setNumero_mayor(this.numero1);
        } else if ((this.numero2 > this.numero1) && (this.numero2 > this.numero3)) {
            this.setNumero_mayor(this.numero2);
        } else if ((this.numero3 > this.numero1) && (this.numero3 > this.numero2)) {
            this.setNumero_mayor(this.numero3);
        }
    }
}
