package com.mag.core;

import com.mag.Main;

import java.util.ArrayList;
//stitches final json structure to the root covering
public class PrimaryMapper {
    //private int i = 1;
    public String type = "minecraft:barter";
    public ArrayList<Object> pools = new ArrayList<Object>();

    /**
     * Takes in a list of Strings which are actually items
     * @param items the items that will go into the json
     */
    public PrimaryMapper(ArrayList<String> items){
        SecondaryMapper secondaryMapper = new SecondaryMapper();
        //idk how but it fucking works now lmao
        int i= 1;
        try {
            while (i<=items.size()) {
                secondaryMapper.addItems(items.get(i-1), i);
                i++;
            }
            secondaryMapper.addLastItem(i);
            this.pools.add(secondaryMapper);
        } catch (NullPointerException e){
            if(Main.isDebugEnabled) e.printStackTrace();
        }
    }
}
