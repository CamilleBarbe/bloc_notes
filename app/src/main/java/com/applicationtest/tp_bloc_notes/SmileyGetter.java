package com.applicationtest.tp_bloc_notes;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;

/**
 * Created by leila on 06/02/2017.
 * Récupère les images depuis les ressources pour
 * les ajouter à l'interpréteur HTML.
 */

public class SmileyGetter implements Html.ImageGetter {

    //Contexte de l'activité
    protected Context context = null;

    //Constructeur
    public SmileyGetter(Context c){
        context = c;
    }

    //setter
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * Donne un smiley en fonction du paramètre d'entrée
     * @param smiley Le nom du smiley à afficher
     * @return
     */
    @Override
    public Drawable getDrawable(String smiley) {
        Drawable retour = null;

        //Récupère le gestionnaire de ressources
        Resources resources = context.getResources();

        //Clin d'oeil
        if(smiley.compareTo("clin") ==0){
            //On récupère le drawable correspondant
            retour = resources.getDrawable(R.drawable.clin);
        }else if(smiley.compareTo("smile") == 0){
            retour = resources.getDrawable(R.drawable.smile);
        }else{
            retour = resources.getDrawable(R.drawable.heureux);
        }

        //Taille image
        retour.setBounds(0,0, retour.getIntrinsicWidth(), retour.getIntrinsicHeight());
        return retour;
    }
}
