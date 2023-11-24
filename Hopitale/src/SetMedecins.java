import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setM;

    public void setSetM(Set<Medecin> setM) {
        this.setM = setM;
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
       return setM.stream().allMatch(setM-> setM.getCin() == cin);
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach(setM-> setM.toString());
    }
    /* Avec l’api Stream */
    public long nombreMedecins(){
        return setM.stream().count();
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
        return setM.stream().collect(Collectors.toCollection(TreeSet::new));
    }
}