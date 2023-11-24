
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List ;
public class ListPatients implements InterfacePatient{
    private List <Patient> listP;
    public ListPatients(){
        listP  = new ArrayList<>();
    }
    public void ajouterPatient(Patient p) {
       listP.add(p);
    }
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        return listP.stream().allMatch(patient -> patient.equals(p));
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        return listP.stream().allMatch(patient -> patient.getCin() == cin);
    }
    public void afficherPatients() {
        listP.stream().forEach(p->listP.toString());
    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        listP.stream().sorted(Comparator.comparing(patient -> patient.getNom()));
    }
    /* Avec l&#39;api stream */
    public void PatientSansRedondance(){
        listP.stream().distinct().forEach(p->p.toString());
    }
}

