public class InterfaceTest {
}

interface ColPrimarios​ {
    int ROJO=1, VERDE=2, AZUL=4;
}
interface ColArcoIris extends ColPrimarios​ {
    int AMARILLO=3, NARANJA=5, INDIGO=6, VIOLETA=7;
}
interface ColImpresion extends ColPrimarios​ {
    int AMARILLO=8, CYAN=16, MAGENTA=32;
}
interface TodosLosColores extends ColImpresion, ColArcoIris {
    int FUCSIA=17, BORDO=ROJO+90;
}
class MisColores implements ColImpresion, ColArcoIris {
    public MisColores() {
        // AMARILLO esta en las dos interfaces, por lo tanto es invalida la implementacion. MisColores no
        // tiene forma de saber a cual de los dos AMARILLO se esta refiriendo.

        // int unColor=AMARILLO;
    }
}
