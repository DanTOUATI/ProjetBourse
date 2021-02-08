/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double valeurAction;
    private double prixAchatAction;
    private int quantiteAcheter;
    
    //constructeur
    public Action(int uneAction,String unNom,double uneValeur,double unPrix,int uneQuantite)
    {
        idAction = uneAction;
        nomAction = unNom;
        valeurAction = uneValeur;
        prixAchatAction = unPrix;
        quantiteAcheter = uneQuantite;
    }

    
    public int getIdAction() {
        return idAction;
    }

    
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    
    public String getNomAction() {
        return nomAction;
    }

    
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

   
    public double getValeurAction() {
        return valeurAction;
    }

    public void setValeurAction(double valeurAction) {
        this.valeurAction = valeurAction;
    }

    
    public double getPrixAchatAction() {
        return prixAchatAction;
    }

    
    public void setPrixAchatAction(double prixAchatAction) {
        this.prixAchatAction = prixAchatAction;
    }

    
    public int getQuantiteAcheter() {
        return quantiteAcheter;
    }

   
    public void setQuantiteAcheter(int quantiteAcheter) {
        this.quantiteAcheter = quantiteAcheter;
    }
    
}
