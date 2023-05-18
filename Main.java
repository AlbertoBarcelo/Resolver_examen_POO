public class Main {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente("ES123", 2000);
        CuentaAhorro ca = new CuentaAhorro("ES987", 5000);

        // Mostramos datos de las cuentas
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        // Ingresamos, retiramos y mostramos
        cc.ingresar(300);
        ca.retirar(1000);
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        // Traspasamos 1000 de cc a ca y mostramos
        cc.traspaso(100, ca);
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        // Calculamos intereses y mostramos
        cc.calcularIntereses();
        ca.calcularIntereses();
        cc.mostrar();
        ca.mostrar();

    }
    }
