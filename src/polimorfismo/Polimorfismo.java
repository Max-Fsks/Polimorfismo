
package polimorfismo;


public class Polimorfismo {
    //sobrecarga
    public static void main(String[] args) {
        /*DecimalFormat f = new DecimalFormat("#.#");
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2.2, 3.3));
*/
        Gato gato = new Gato();
        gato.comunicar();
        
        Cachorro dog = new Cachorro();
        dog.comunicar();
    }
}
