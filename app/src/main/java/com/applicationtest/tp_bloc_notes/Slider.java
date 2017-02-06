package com.applicationtest.tp_bloc_notes;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by leila on 06/02/2017.
 * Contient toutes mes vues
 */

public class Slider extends LinearLayout {

    boolean isOpen;
    RelativeLayout toHide;
    final static int SPEED;

    //Constructeur
    public Slider(Context context) {
        super(context);
    }

    /**
     * Ouvre/Ferme le menu
     * @return true si le menu est ouvert
     */
    public boolean toggle(){
        //Animation de transition
        TranslateAnimation animation = null;

        //Passe le menu de ouvert à fermé ou de fermé à ouvert
        isOpen = !isOpen;

        //Si le menu est ouvert
        if(isOpen){
            //Animation de bas en haut
            animation = new TranslateAnimation(0.0f, 0.0f, -toHide.getHeight(), 0.0f);
            animation.setAnimationListener(openListener);
        }else{
            animation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -toHide.getHeight());
            animation.setAnimationListener(closeListener);
        }

        //Durée de l'animation
        animation.setDuration(SPEED);
        //Effet d'accélération
        animation.setInterpolator(new AccelerateInterpolator());
        //Lancer l'animation
        startAnimation(animation);

        return isOpen;
    }
}
