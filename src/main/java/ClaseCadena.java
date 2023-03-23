public class ClaseCadena {

    static final char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};


    public static String devuelveIniciales(String nombre){
        try {
            String[] palabras = nombre.split(" ");
            if (palabras.length != 2) throw new Exception("Error en los espacios");
            char[] iniciales = {palabras[0].charAt(0), palabras[1].charAt(0)};
            if (!esLetra(iniciales[0]) || !esLetra(iniciales[1])) throw new Exception("Error en las iniciales");
            return iniciales[0] + "." + iniciales[1] + ".";
        } catch (Exception e) {
        }
        return "";
    }

    public static boolean esLetra(char letra){
        for (char c : letras) {
            if (c == letra) return true;
        }
        return false;
    }
}
