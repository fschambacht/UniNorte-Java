public class CuerpoDeAgua {
    String name;
    int waterBodyId;
    String municipality;
    double irca;
    // this variables is to excecute method nivel()
    int sanitaryUnfeasible = 0;
    int high = 0;
    int mid = 0;
    int low = 0;
    int noRisk = 0;
    // construct method
    public CuerpoDeAgua(String name, int waterBodyId, String municipality, double irca) {
        this.name = name;
        this.waterBodyId = waterBodyId;
        this.municipality = municipality;
        this.irca = irca;
    }

    public int getSanitaryUnfeasible() {
        return sanitaryUnfeasible;
    }

    public void setSanitaryUnfeasible(int sanitaryUnfeasible) {
        this.sanitaryUnfeasible = sanitaryUnfeasible;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getNoRisk() {
        return noRisk;
    }

    public void setNoRisk(int noRisk) {
        this.noRisk = noRisk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaterBodyId() {
        return waterBodyId;
    }

    public void setWaterBodyId(int waterBodyId) {
        this.waterBodyId = waterBodyId;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public double getIrca() {
        return irca;
    }

    public void setIrca(double irca) {
        this.irca = irca;
    }
    // method nivel() to check water body risk level with IRCA
    public String nivel(){

        if (irca>80){
            sanitaryUnfeasible++;
            return "INVIABLE SANITARIAMENTE";
        } else if (irca<=80 && irca>35){
            high++;
            return "ALTO";
        } else if (irca<=35 && irca>14){
            mid++;
            return "MEDIO";
        } else if (irca<=14 && irca>5){
            low++;
            return "BAJO";
        } else {
            noRisk++;
            return "SIN RIESGO";
        }
    }
}
