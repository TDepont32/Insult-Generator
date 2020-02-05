package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.insultes.Insulte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Controller {
    @FXML
    Button btn;
    @FXML
    Label texte;
    @FXML
    TextField addField;
    @FXML
    RadioButton radioAdj;
    @FXML
    RadioButton radioName;
    @FXML
    Button addBtn;
    private ArrayList<String> listAdjectifs = new ArrayList<String>(Arrays.asList("sly","dirty","rotten","wretched","ugly","stupid","dumb","bald","plain","humongous"));
    private ArrayList<String> listNoms = new ArrayList<String>(Arrays.asList("shithead","dog","cucumber","dumbass","snake","corpse","asshat","cow","wench","monkey", "cockwomble"));


    public void insulter(){
        Insulte insult= new Insulte();
        Random r = new Random();
        int indAdj= r.nextInt(listAdjectifs.size());
        int indNm= r.nextInt(listNoms.size());
        int i=0;
        String adj = listAdjectifs.get(indAdj);
        String nom = listNoms.get(indNm);
        insult.setAdjectif(adj);
        insult.setNom(nom);
        texte.setText(insult.toString());
    }
    public void cochernom(){
        radioAdj.setSelected(false);
    }
    public void cocheradj(){

        radioName.setSelected(false);
    }
    public void ajouter() {
        String nouv = addField.getText();
        String type = "";
        if (texte.getText().contentEquals("Is that too hard for you to understand birdbrain?")) {
            texte.setText("Alright, I'm done with you...");
            addBtn.setVisible(false);
        }else{
            if(texte.getText().contentEquals("Enter a word dipshit!")){
             texte.setText("Is that too hard for you to understand birdbrain?");
            } else{
            if (nouv.contentEquals("")) {
                texte.setText("Enter a word dipshit!");

            }else{
                if (radioAdj.isSelected()) {
                    listAdjectifs.add(nouv);
                    type = "adjectives";
                } else if (radioName.isSelected()) {
                    listNoms.add(nouv);
                    type = "names";
                }
                System.out.println(nouv);
                addField.setText("");
                texte.setText(nouv + " has been added to " + type + " for this session");
                }
         }

        }
    }
}
