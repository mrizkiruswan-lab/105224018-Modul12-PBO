public class krsValidator {

    public boolean validasiSKS(int totalSKS) {

        if(totalSKS > 24) {
            System.out.println("SKS melebihi batas.");
            return false;
        }

        return true;
    }
}