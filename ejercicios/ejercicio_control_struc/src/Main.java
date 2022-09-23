public class Main {
    public static void main(String[] args) {
        controlEstructures miIf =       new controlEstructures();
        controlEstructures miWhile =    new controlEstructures();
        controlEstructures miDoWhile =  new controlEstructures();
        controlEstructures miFor =      new controlEstructures();
        controlEstructures miSwitch =   new controlEstructures();

        miIf.determinarIf(3);
        miWhile.determinarWhile(0);
        miDoWhile.determinarDoWhile(2);
        miFor.determinarFor();
        miSwitch.determinarSwitch(1);

    }
}